package com.example.fragmentsapp;

import static com.example.fragmentsapp.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank2,container,false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btn2=view.findViewById(R.id.bye);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView txt2=view.findViewById(R.id.txt2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Goodbye from second fragment",Toast.LENGTH_LONG).show();
            }
        });
return view;
    }
}