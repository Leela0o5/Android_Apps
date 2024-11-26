package com.example.contactsapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //data sourcse
    private ContactsDataBase contactsDataBase;
    private ArrayList<Contacts> contactsArrayList=new ArrayList<>();
    //Adapter
    private MyAdapter myAdapter;

// binding
    private MainActivityclickHandler handlers;
    private ActivityMainBinding mainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //data binding
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        handlers=new MainActivityclickHandler(this);
        mainBinding.setClickhandler(handlers);

        //recycler view
        RecyclerView recyclerView=mainBinding.recyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);



        //database
        contactsDataBase=ContactsDataBase.getInstance(this);
        //viewmodel
        MyViewModel viewModel=new ViewModelProvider(this).get(MyViewModel.class);
//testing data
        Contacts c1=new Contacts("jack","jack@gmail.com");


        viewModel.getAllcontacts().observe(this,
                new Observer<List<Contacts>>() {
                    @Override
                    public void onChanged(List<Contacts> contacts) {
                           contactsArrayList.clear();

                        for(Contacts c:contacts){
                            Log.v("TAG",c.getContact_name());
                            contactsArrayList.add(c);
                        }

                        myAdapter.notifyDataSetChanged();
                    }
                });
        myAdapter=new MyAdapter(contactsArrayList);

        recyclerView.setAdapter(myAdapter);
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                Contacts c=contactsArrayList.get(viewHolder.getAdapterPosition());
                viewModel.deletecontact(c);
            }
        }).attachToRecyclerView(recyclerView);











    }
}