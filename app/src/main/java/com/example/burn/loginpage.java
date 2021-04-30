package com.example.burn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class loginpage extends AppCompatActivity {
    EditText username,password;
    Button but;
    String user_get;
    String username1= "admin";
    String password1 = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        username = (EditText) findViewById(R.id.edit1);
        password = (EditText) findViewById(R.id.edit2);
        but = (Button) findViewById(R.id.loginbutton);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_get= username.getText().toString();
                if ((TextUtils.isEmpty(username.getText().toString())) || (TextUtils.isEmpty(password.getText().toString()))){
                    Toast.makeText(loginpage.this,"Empty Username/Password",Toast.LENGTH_LONG).show();
                }
                else if (username.getText().toString().equals(username1)) {
                    if (password.getText().toString().equals(password1)){
                        Intent intent = new Intent(loginpage.this,splashscreen.class);
                        intent.putExtra("admin", user_get);
                         startActivity(intent);
                         finish();
                    }
                    else {
                        Toast.makeText(loginpage.this,"Invalid Username/Password",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(loginpage.this,"Invalid Username/Password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    }
