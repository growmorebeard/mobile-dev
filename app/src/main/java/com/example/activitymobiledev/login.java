package com.example.activitymobiledev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1 = (Button) findViewById(R.id.signupbtn_login);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                opensignup();
            }
        });

        button2 = (Button) findViewById(R.id.loginbtn_login);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                openlogin();
            }
        });
    }
    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void openlogin(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}