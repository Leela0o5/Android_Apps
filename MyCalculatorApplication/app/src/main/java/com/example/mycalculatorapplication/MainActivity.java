package com.example.mycalculatorapplication;

import android.os.Bundle;
import android.view.Menu;
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
    Button sum;
    Button sub;
    Button mul;
    Button div;
    EditText num1;
    EditText num2;
     TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sum=findViewById(R.id.sum);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);




        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s1=num1.getText().toString();
                String s2=num2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n1=Integer.parseInt(s1);
                result.setText(""+sum(n1,n2));

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=num1.getText().toString();
                String s2=num2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n1=Integer.parseInt(s1);
                result.setText(""+sub(n1,n2));

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=num1.getText().toString();
                String s2=num2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n1=Integer.parseInt(s1);
                result.setText(""+mul(n1,n2));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=num1.getText().toString();
                String s2=num2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n1=Integer.parseInt(s1);
                result.setText(""+div(n1,n2));

            }
        });



    }

    public int sum(int a,int b){

        return a+b;
    }
    public int sub(int a,int b){

        return a-b;
    }
    public int mul(int a,int b){

        return a*b;
    }
    public int div(int a,int b){

        return a/b;
    }

}