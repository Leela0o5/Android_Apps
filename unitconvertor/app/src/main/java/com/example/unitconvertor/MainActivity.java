package com.example.unitconvertor;

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

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edittext;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

btn=findViewById(R.id.btn);
textView=findViewById(R.id.textView);
edittext=findViewById(R.id.edittext);




btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String value=edittext.getText().toString();
        double kilos=Double.parseDouble(value);
       double grams= makeconvesion(kilos);
       textView.setText(""+grams+"grams");

    }
});



    }
    public int makeconvesion(double kilos){
        return (int) (1000*kilos);
    }



}