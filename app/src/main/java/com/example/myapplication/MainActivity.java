//Muzamiru Sebulime
//2017/BIT/107/PS
package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
Button btncreate, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncreate=(Button) findViewById(R.id.create_account);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj= new Intent(MainActivity.this,Account.class);
                startActivity(obj);
            }
        });
        login=(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(obj);
            }
        });
    }
}

