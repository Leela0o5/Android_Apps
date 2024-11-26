package com.example.volumecalculator;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class cubeVol extends AppCompatActivity {
    TextView resultcube;
    EditText editTextcube;
    Button btncube;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube_vol);
        resultcube = findViewById(R.id.resultcube);
        editTextcube=findViewById(R.id.editTextcube);
        btncube=findViewById(R.id.btncube);
        btncube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String len=editTextcube.getText().toString();
                int l=Integer.parseInt(len);
                double volCube=l*l*l;
                resultcube.setText("the volume of cube is "+volCube+" m^3");
            }
        });





    }
}