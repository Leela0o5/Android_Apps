package com.example.planetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listview;
MyCustomAdapter customAdapter;
ArrayList<Planet_modalClass> planetsArraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       listview=findViewById(R.id.listview);
       planetsArraylist=new ArrayList<>();
       Planet_modalClass planet3=new Planet_modalClass("earth","1",R.drawable.earth);
        Planet_modalClass planet1=new Planet_modalClass("Mercury","0",R.drawable.mercury);
        Planet_modalClass planet2=new Planet_modalClass("venus","0",R.drawable.venus);
        Planet_modalClass planet4=new Planet_modalClass("Mars","2",R.drawable.mars);
        Planet_modalClass planet5=new Planet_modalClass("Jupitar","79",R.drawable.jupiter);
        Planet_modalClass planet6=new Planet_modalClass("Saturn","83",R.drawable.saturn);
        Planet_modalClass planet7=new Planet_modalClass("Uranus","27",R.drawable.uranus);
        Planet_modalClass planet8=new Planet_modalClass("Neptune","14",R.drawable.neptune);
        Planet_modalClass planet9=new Planet_modalClass("Pluto","1",R.drawable.pluto);
       planetsArraylist.add(planet1);
        planetsArraylist.add(planet2);
        planetsArraylist.add(planet3);
        planetsArraylist.add(planet4);
        planetsArraylist.add(planet5);
        planetsArraylist.add(planet6);
        planetsArraylist.add(planet7);
        planetsArraylist.add(planet8);
        planetsArraylist.add(planet9);

        customAdapter=new MyCustomAdapter(planetsArraylist,getApplicationContext());
         listview.setAdapter(customAdapter);


//click views
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Planet name: "+customAdapter.getItem(position).getPlanetname(),Toast.LENGTH_SHORT).show();
            }
        });





    }
}