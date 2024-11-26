package com.example.greetingsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;
TextView TITLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.editText);
        b=findViewById(R.id.btn);
        TITLE=findViewById(R.id.title);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputname=e.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Welcome "+inputname+" to our app",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}