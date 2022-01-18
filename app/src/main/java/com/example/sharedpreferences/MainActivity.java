package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText email, password;
Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.etEmail);
        password= findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        signup = findViewById(R.id.btnSignup);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnLogin){
            //TODO: login logic
            String uEmail = email.getText().toString();
            String uPassword = password.getText().toString();
            //abc is xml file name
            SharedPreferences sp = getSharedPreferences("abc", MODE_PRIVATE);
            String fEmail =sp.getString("email","");
            String fPassword = sp.getString("password", "");

            if(formValidation(uEmail, uPassword)){
                if(uEmail.equals(fEmail) && uPassword.equals(fPassword)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT ).show();
                }else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT ).show();
                }
            }

        }else if(v.getId()==R.id.btnSignup){
            Intent iSignup = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(iSignup);
        }
    }

    public boolean formValidation(String email, String password){
        boolean valid = true;
        //empty input
        if(TextUtils.isEmpty(email)){
            valid = false;
            this.email.setError("Email can't be true");
        }

        if(TextUtils.isEmpty(password)){
            valid = false;
            this.password.setError("Password can't be true");
        }
        return valid;
    }
}