package com.example.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

import static com.example.myapplication.R.id.btn;

public class About extends AppCompatActivity {
ImageButton btnabout;
CheckBox btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        btnabout = (ImageButton) findViewById(R.id.btn);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent object = new Intent(About.this, MainActivity.class);
                startActivity(object);
            }

        });

        btn = (CheckBox) findViewById(R.id.terms);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNotification();
            }
        });
    }
            private void addNotification() {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                        .setContentText("Welcome to the Party App!")
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setContentTitle("PARTY APP");
                Intent notification=new Intent(About.this,MainActivity.class);
                PendingIntent intent=PendingIntent.getActivity(this,0,notification,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(intent);
                NotificationManager manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
    }

    protected void onStart(){
        super.onStart();
        Log.d("tag","In onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.d("tag","In onResume");
    }
    protected void onStop(){
        super.onStop();
        Log.d("tag","In onStop");
    }
}
