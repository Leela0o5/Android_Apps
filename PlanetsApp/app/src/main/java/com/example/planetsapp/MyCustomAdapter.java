package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet_modalClass> {

    private ArrayList<Planet_modalClass> planreArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Planet_modalClass> planreArrayList, Context context) {
        super(context, R.layout.mylist_blueprint, planreArrayList);
        this.planreArrayList = planreArrayList;
        this.context=context;
    }
private static class Myviewholder{
        TextView myplanetname;
        TextView moon;
        ImageView planetImg;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //getting the planet object at a current position
        Planet_modalClass planets=getItem(position);
        //insert layout
        Myviewholder myviewholder;
        final View result;
        if(convertView== null){
            myviewholder=new Myviewholder();
            LayoutInflater inflater =LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.mylist_blueprint,parent,false);
            //finding views
            myviewholder.myplanetname=(TextView) convertView.findViewById(R.id.planetname);
            myviewholder.moon=(TextView) convertView.findViewById(R.id.moon);
            myviewholder.planetImg=(ImageView) convertView.findViewById(R.id.Planetimage);
            result=convertView;
            convertView.setTag(myviewholder);

        }
        else{
            myviewholder=(Myviewholder) convertView.getTag();
            result=convertView;
        }
        myviewholder.myplanetname.setText(planets.getPlanetname());
        myviewholder.moon.setText(planets.getMooon());
        myviewholder.planetImg.setImageResource(planets.getPlanetImage());
         return result;


    }
}