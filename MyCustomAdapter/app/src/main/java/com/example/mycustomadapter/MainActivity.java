package com.example.mycustomadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
list=findViewById(R.id.listview);
String[] countries={"opoogl","jyjht","yhtyr","ryjyj","yjtyjj"};
adapterClass customadapter=new adapterClass(this,countries);
list.setAdapter(customadapter);
    }
}