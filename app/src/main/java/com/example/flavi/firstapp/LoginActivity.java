package com.example.flavi.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText usernameET;
    EditText passwordET;
    Button loginBtn;

    View.OnClickListener loginClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            String username = usernameET.getText().toString();
            String password = passwordET.getText().toString();
            if(doLogin(username, password)){
                Toast.makeText(LoginActivity.this, getString(R.string.login_success),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        usernameET =(EditText) findViewById(R.id.username);
        passwordET = (EditText)findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.button);
        loginBtn.setOnClickListener(loginClickListener);

    }
    private boolean doLogin(String username, String Password){
        return true;
    }
}
