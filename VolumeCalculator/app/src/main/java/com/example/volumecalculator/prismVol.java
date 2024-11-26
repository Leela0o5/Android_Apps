package com.example.volumecalculator;

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

public class prismVol extends AppCompatActivity {
Button btncuboid;
EditText lengthcuboid;
    EditText widthcuboid;
    EditText heigthcuboid;
    TextView resultcuboid;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism_vol);
        btncuboid=findViewById(R.id.btncuboid);
        lengthcuboid=findViewById(R.id.editTextcuboidlength);
        widthcuboid=findViewById(R.id.editTextcuboidwidth);
        heigthcuboid=findViewById(R.id.editTextcuboidheigth);
        resultcuboid=findViewById(R.id.resultcuboid);

        btncuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String len=lengthcuboid.getText().toString();
                int l=Integer.parseInt(len);
                String hei=heigthcuboid.getText().toString();
                int h=Integer.parseInt(hei);
                String width=widthcuboid.getText().toString();
                int w=Integer.parseInt(width);

                double volcuboid=l*w*h;
                resultcuboid.setText("the volume of cuboid is "+volcuboid+" m^3");

            }
        });




    }
}