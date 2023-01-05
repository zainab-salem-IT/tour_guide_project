package com.example.tour_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button ssignup = (Button) findViewById(R.id.signup);
        EditText usernn=(EditText) findViewById(R.id.editTextTextPersonName);
        EditText ppasss=(EditText) findViewById(R.id.editTextTextPersonName2);
        EditText eemmail=(EditText) findViewById(R.id.editTextTextPersonName3);
        Intent movesignup=getIntent();
        ssignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movehome= new Intent(signup.this,home.class);
                startActivity(movehome);
            }
        });
    }
}