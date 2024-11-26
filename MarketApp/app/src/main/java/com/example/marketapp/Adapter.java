package com.example.marketapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Item> ItemList;
    public ItemClickListener clickListener;


    public void setClickListener(ItemClickListener myListener){
        this.clickListener=myListener;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView title;
        TextView description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(clickListener!=null){
                clickListener.onClick(v,getAdapterPosition());
            }
        }
    }








    public Adapter(List<Item> itemList) {
        this.ItemList = itemList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //responsible for creating new viewholders for ur items
        View ItemView= LayoutInflater.
                from(parent.getContext()).inflate(R.layout.my_item_layout,parent,false);
        return new MyViewHolder(ItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//binds the data from dataset to the views within the view holder
        Item item=ItemList.get(position);
        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDesp());
        holder.imageView.setImageResource(item.getItemImg());
    }

    @Override
    public int getItemCount() {
        //total no of items
        return ItemList.size();
    }










}



