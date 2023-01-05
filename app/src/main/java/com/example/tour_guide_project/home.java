package com.example.tour_guide_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {


  Button btnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent movehome = getIntent();
     btnn = (Button)findViewById(R.id.btn);
     btnn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent detail= new Intent(home.this,datails.class);
             startActivity(detail);
         }
     });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.notification:
                Intent notify = new Intent(home.this,notifications.class);
               startActivity(notify);
                return true;

            case R.id.profile:
                Intent profill = new Intent(home.this,profile.class);
                startActivity(profill);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}