package com.example.servicesapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button startbtn;
    Button Stopbtn;
    TextView title;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       startbtn=findViewById(R.id.Startbtn);
       Stopbtn=findViewById(R.id.Stopbtn);
       title=findViewById(R.id.title);

       startbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent serviceIntent=new Intent(getApplicationContext(),MyCustomService.class);
               startService(serviceIntent);
           }
       });

       Stopbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent serviceIntent=new Intent(getApplicationContext(),MyCustomService.class);
               stopService(serviceIntent);
           }
       });










    }
}