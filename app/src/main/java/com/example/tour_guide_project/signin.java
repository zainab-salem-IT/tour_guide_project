package com.example.tour_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Intent movesignin=getIntent();
        TextView username= (TextView)findViewById(R.id.textView2);
        TextView password= (TextView)findViewById(R.id.textView3);
        EditText name= (EditText)findViewById(R.id.editTextTextPersonName);
        EditText password2= (EditText)findViewById(R.id.editTextTextPersonName2);
        Button signin =(Button)findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("zainab")&& password2.getText().toString().equals("123"))
                {
                    Toast.makeText(signin.this,"sign in successfull",Toast.LENGTH_LONG).show();
                    Intent movehome= new Intent(signin.this,home.class);
                    startActivity(movehome);
                }
                else {
                    Toast.makeText(signin.this, "sign in failled", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}