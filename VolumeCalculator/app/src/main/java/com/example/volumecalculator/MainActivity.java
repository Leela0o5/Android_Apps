package com.example.volumecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gridview;
    ArrayList<Shape_modalclass> shapeArrayList;
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         gridview=findViewById(R.id.gridview);

         //data source
       shapeArrayList=new ArrayList<>();
        Shape_modalclass shape1=new Shape_modalclass(R.drawable.sphere,"Sphere");
        Shape_modalclass shape2=new Shape_modalclass(R.drawable.cylinder,"cylinder");
        Shape_modalclass shape3=new Shape_modalclass(R.drawable.cube,"cube");
        Shape_modalclass shape4=new Shape_modalclass(R.drawable.prism,"Cuboid");


        shapeArrayList.add(shape1);
        shapeArrayList.add(shape2);
        shapeArrayList.add(shape3);
        shapeArrayList.add(shape4);

adapter=new MyCustomAdapter(shapeArrayList,getApplicationContext());
gridview.setAdapter(adapter);
gridview.setNumColumns(2);

gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String n=((MyCustomAdapter) adapterView.getAdapter()).getItem(position).getTextview();
        if(n=="Sphere"){
        Intent i=new Intent(getApplicationContext(),SphereVolume.class);
        startActivity(i);
        }
        if(n=="cube"){
            Intent i=new Intent(getApplicationContext(),cubeVol.class);
            startActivity(i);
        }
        if(n=="cylinder"){
            Intent i=new Intent(getApplicationContext(),cylindervol.class);
            startActivity(i);
        }
        if(n=="Cuboid"){
            Intent i=new Intent(getApplicationContext(),prismVol.class);
            startActivity(i);
        }

    }
});




    }
}