package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<Shape_modalclass> {
    private ArrayList<Shape_modalclass> shapesItems;
    Context context;


    public MyCustomAdapter(ArrayList<Shape_modalclass> shapesItems, Context context) {
        super(context,R.layout.grid_layout_item,shapesItems);
        this.context = context;
        this.shapesItems=shapesItems;
    }

    private static class MyViewHolder{
        TextView shapename;
        ImageView shapeimg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
          Shape_modalclass shape=getItem(position);
          MyViewHolder viewholder;
          if(convertView==null){
            viewholder=new MyViewHolder();
              LayoutInflater inflator=LayoutInflater.from(getContext());
            convertView=inflator.inflate(R.layout.grid_layout_item,
                                          parent,false);
            viewholder.shapename=(TextView)convertView.findViewById(R.id.textview);
            viewholder.shapeimg=(ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(viewholder);

          }else{
            viewholder=(MyViewHolder) convertView.getTag();
          }
          viewholder.shapename.setText(shape.getTextview());
          viewholder.shapeimg.setImageResource(shape.getImageview());
          return convertView;

    }
}
