package com.example.tour_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notifications extends AppCompatActivity {
    Button notifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("my notification" ,"my notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager= getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        Intent notify= getIntent();
         notifi=(Button) findViewById(R.id.button);
         notifi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 NotificationCompat.Builder builder=new NotificationCompat.Builder(notifications.this,"my notification");
                 builder.setContentTitle("beautiful places to visit");
                 builder.setContentText("come with us to visit Al-Qishla in Baghdad.");
                 builder.setSmallIcon(R.drawable.ic_launcher_background);
                 builder.setAutoCancel(true);
                 NotificationManagerCompat managerCompat= NotificationManagerCompat.from(notifications.this);
                 managerCompat.notify(1,builder.build());

             }
         });

} }