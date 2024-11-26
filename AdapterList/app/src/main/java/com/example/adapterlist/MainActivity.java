package com.example.adapterlist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ListView listo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//adapterView
listo=findViewById(R.id.lists);
//data source
String[] countries={"USA","PERSIA","INDIA","RUSSIA","PAKISTAN","UKRAIN"};
//Adapter
        ArrayAdapter<String> adaptero=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,countries
        );
//link listview with adapter
listo.setAdapter(adaptero);






    }
}