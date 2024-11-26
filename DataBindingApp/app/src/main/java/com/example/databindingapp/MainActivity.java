package com.example.databindingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding activityMainBinding;
   private Click myHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
Person p1=new Person("jack","leela95@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
activityMainBinding.setPerson(p1);

myHandler=new Click(this);

activityMainBinding.setClickHandler(myHandler);



//

    }
}