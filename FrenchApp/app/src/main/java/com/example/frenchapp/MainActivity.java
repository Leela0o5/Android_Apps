package com.example.frenchapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button red;
    Button yellow;
    Button black;
    Button purple;
    Button green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        red=findViewById(R.id.red);
        yellow=findViewById(R.id.yellow);
        black=findViewById(R.id.black);
        purple=findViewById(R.id.purple);
        green=findViewById(R.id.green);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
        black.setOnClickListener(this);
        purple.setOnClickListener(this);
        green.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
       int clickbtn=v.getId();
       if(clickbtn==R.id.red){
       playsound(R.raw.red);
       }
        else if(clickbtn==R.id.yellow){
            playsound(R.raw.yellow);
        }
        else if(clickbtn==R.id.black){
            playsound(R.raw.black);
        }
        else if(clickbtn==R.id.purple){
            playsound(R.raw.purple);
        }
        else if(clickbtn==R.id.green){
            playsound(R.raw.green);
        }


    }

    public void playsound(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);

        mediaPlayer.start();
    }




}