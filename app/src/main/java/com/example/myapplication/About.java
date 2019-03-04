package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.myapplication.R.id.btn;

public class About extends AppCompatActivity {
ImageButton btnabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnabout= (ImageButton) findViewById(R.id.btn);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent object= new Intent(About.this,MainActivity.class);
                startActivity(object);
            }
        });
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
