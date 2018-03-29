package com.example.android.udacityforum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_screen extends AppCompatActivity {

    EditText username;
    EditText password;
    Button sign_in;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (EditText)findViewById(R.id.username_input);
        password =(EditText)findViewById(R.id.password_input);
        sign_in = (Button)findViewById(R.id.sign_in_btn);
        sign_up = (Button)findViewById(R.id.sign_up_btn);

        // goes to sign in home screen.
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if conditions of validate method is met.
                if (validate()){
                    Intent i = new Intent(login_screen.this, sign_in_home.class);
                    startActivity(i);
                }

            }
        });

    }

    // validate method for validation of user data.
    private boolean validate(){
        if(!username.getText().toString().equals("@") && password.getText().toString().equals("")){
            username.setError("Invalid Username");
            password.setError("Invalid Password");
            return false;
        }else{
            return true;
        }
    }
}
