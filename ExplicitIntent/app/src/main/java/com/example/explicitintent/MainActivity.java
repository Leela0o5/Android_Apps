package com.example.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 =findViewById(R.id.btn2);

        getSupportActionBar().setTitle("The Menu Bar");




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondActivity();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web();
            }
        });

    }

    public void secondActivity(){
        Intent intent=new Intent(this, SecondActivity2.class);
        startActivity(intent);
    }
    public void web(){
        Uri web=Uri.parse("https://www.google.com/");
        Intent i=new Intent(Intent.ACTION_VIEW,web);
        startActivity(i);
    }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.mymenu,menu);
    return true;
}}