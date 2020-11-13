package com.example.windsorrideshare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginFragment extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button buttonOne = findViewById(R.id.btn_login);
        Button buttonTwo = findViewById(R.id.btn_register);
       // System.out.println("hello");
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(LoginFragment.this, AdminDashboard.class);
                startActivity(activity2Intent);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(LoginFragment.this, activity_register.class);
                startActivity(activity2Intent);
            }
        });
    }
}
