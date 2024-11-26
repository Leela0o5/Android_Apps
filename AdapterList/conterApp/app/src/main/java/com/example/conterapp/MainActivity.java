package com.example.conterapp;

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
    int counter=0;
    String y="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView wel,textview;
        Button btn;
        Button reset;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

btn=findViewById(R.id.btn);
wel=findViewById(R.id.wel);
textview=findViewById(R.id.textview);
reset=findViewById(R.id.resets);
//adding the funtionality
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textview.setText(""+increasecount());

    }
});

reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textview.setText("0");
        counter=0;
    }
});
    }
    public int increasecount(){
     return  ++counter ;

    }
    
}