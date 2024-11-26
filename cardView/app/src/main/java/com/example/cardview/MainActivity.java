package com.example.cardview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements name {
private RecyclerView recyclerView;
private List<sports> sportsList;
adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportsList = new ArrayList<>();
        sports s1=new sports("Football",R.drawable.football);
        sports s2=new sports("Basekball",R.drawable.basketball);
        sports s3=new sports("Ping",R.drawable.ping);
        sports s4=new sports("Tennis",R.drawable.tennis);
        sports s5=new sports("VolleyBall",R.drawable.volley);
        sportsList.add(s1);
        sportsList.add(s2);
        sportsList.add(s3);
        sportsList.add(s4);
        sportsList.add(s5);
         adapter = new adapter(sportsList);

         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setAdapter(adapter);
         adapter.setItemclickListener(this);

    }

    @Override
    public void onclick(View v, int pos) {
        Toast.makeText(this,"You choose: "+sportsList.get(pos).getSportname(),
                Toast.LENGTH_SHORT).show();
    }
}