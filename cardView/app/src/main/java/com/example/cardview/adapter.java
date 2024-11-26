package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.SportsViewHolder> {
    private List<sports> sportList;
    public name ItemclickListener;
    public void setItemclickListener(name myListener){
        this.ItemclickListener=myListener;
    }

    public adapter(List<sports> sportList) {
        this.sportList = sportList;

    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,parent,false);
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
         sports sport=sportList.get(position);
         holder.title.setText(sport.getSportname());
         holder.imageView.setImageResource(sport.getSportImg());



    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

      TextView title;
      ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.textview);
            imageView=itemView.findViewById(R.id.imageViewCard);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(ItemclickListener!=null){
                ItemclickListener.onclick(v,getAdapterPosition());
            }
        }
    }



}
