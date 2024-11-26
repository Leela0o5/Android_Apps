package com.example.marketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
RecyclerView recyclerView;//adapter view
    //data source
    List<Item> itemsList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        itemsList=new ArrayList<>();

        Item item1=new Item(R.drawable.fruit,"Fruits","fresh fruits from garden");
        Item item2=new Item(R.drawable.milk,"Milk","this is fresh");
        Item item3=new Item(R.drawable.beverage,"Beverage","beverage is cold");
        Item item4=new Item(R.drawable.bread,"Bread","wheat and beans");
        Item item5=new Item(R.drawable.popcorn,"Popcorn","popcorn is tasty");
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);



        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new Adapter(itemsList);
        recyclerView.setAdapter(adapter);
   adapter.setClickListener(this);







    }

    @Override
    public void onClick(View V, int pos) {
        Toast.makeText(this, "You choose "+itemsList.get(pos).getItemName(), Toast.LENGTH_SHORT).show();
    }
}