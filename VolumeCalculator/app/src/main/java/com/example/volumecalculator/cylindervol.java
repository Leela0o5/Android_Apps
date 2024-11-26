package com.example.volumecalculator;

import static com.example.volumecalculator.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cylindervol extends AppCompatActivity {
EditText lengthcylinder;
EditText heigthcylinder;
TextView resultcylinder;
Button btncylinder;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylindervol);
        lengthcylinder=findViewById(R.id.editTextcylinder);
        heigthcylinder=findViewById(R.id.editTextcylinder2);
        btncylinder=findViewById(R.id.btncylinder);
        resultcylinder=findViewById(R.id.resultcylinder);

        btncylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String len=lengthcylinder.getText().toString();
                int l=Integer.parseInt(len);
                String hei=heigthcylinder.getText().toString();
                int h=Integer.parseInt(hei);
                double volcylinder=3.14*l*l*h;
                resultcylinder.setText("the volume of cylinder is "+volcylinder+" m^3");
            }
        });


    }
}