package com.example.contactsapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.databinding.ContactItemListBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {
    private ArrayList<Contacts> contactsArrayList;

    public MyAdapter(ArrayList<Contacts> contactsArrayList) {
        this.contactsArrayList = contactsArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactItemListBinding contactItemListBinding= DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.contact_item_list,
                parent,false
        );
        return new ContactViewHolder(contactItemListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
//called by recycler view when it need to display or update an item at a specific position in the list or grid
      Contacts CurrentContact= contactsArrayList.get(position);
      holder.contactItemListBinding.setContact(CurrentContact);

    }

    @Override
    public int getItemCount() {
        if(contactsArrayList!=null){
            return contactsArrayList.size();
        }
        else{
            return 0;
        }
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
     private ContactItemListBinding contactItemListBinding;

     public ContactViewHolder(ContactItemListBinding contactItemListBinding) {
         super(contactItemListBinding.getRoot());
         this.contactItemListBinding = contactItemListBinding;
     }
 }





}
