package com.example.viewmodelapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.viewmodelapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
 ActivityMainBinding mainBinding;
    MyViewModel viewmodel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
 viewmodel=new ViewModelProvider(this).get(MyViewModel.class);
 //linking viewmodel with data binding


//observing the live data
viewmodel.getCount().observe(this, new Observer<Integer>() {
    @Override
    public void onChanged(Integer count) {
        //update the ui when LiveData changes
        mainBinding.number.setText(""+count);
    }
});
        mainBinding.setButtonclick(viewmodel);

    }

}