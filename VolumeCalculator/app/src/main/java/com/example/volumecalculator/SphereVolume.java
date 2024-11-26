package com.example.volumecalculator;

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

public class SphereVolume extends AppCompatActivity {
TextView result;
EditText editText;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere_volume);

result=findViewById(R.id.result);
editText=findViewById(R.id.editText);
btn=findViewById(R.id.btn);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String radius=editText.getText().toString();
        int r=Integer.parseInt(radius);
        double volume=(4/3)*3.14*r*r*r;
        result.setText("the volume is "+volume+" m^3");
    }
});





    }
}