package com.example.activitymobiledev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.login_btn);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                openlogin();
            }
        });

        button2 = (Button) findViewById(R.id.signup_btn);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                opensignup();
            }
        });
    }
    public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}