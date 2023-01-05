package com.example.tour_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Button signin=(Button) findViewById(R.id.signin);
        Button signup=(Button) findViewById(R.id.signup);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movesignin=new Intent(MainActivity2.this,signin.class);
                startActivity(movesignin);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movesignup=new Intent(MainActivity2.this,signup.class);
                startActivity(movesignup);
            }
        });
    }
}