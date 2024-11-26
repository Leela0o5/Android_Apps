package com.example.quadraticsolverapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticsolverapp.databinding.ActivityMainBinding;

public class MyEquation  extends BaseObservable {
    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    notifyPropertyChanged(BR.a);
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
        notifyPropertyChanged(BR.b);
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
        notifyPropertyChanged(BR.c);
    }

    public void solveEquation(View view){

        int a=Integer.parseInt(getA());
        int b=Integer.parseInt(getB());
        int c=Integer.parseInt(getC());

        double dis=b*b-(4*a*c);

        double x1,x2;
        if(dis>0){
            x1=(-b +Math.sqrt(dis))/2*a;
            x2=(-b -Math.sqrt(dis))/2*a;
            binding.result.setText("X1="+x1+" and X2="+x2);
        } else if (dis<0) {
            binding.result.setText(" no real solutions(complex roots)");


        }
        else{
            x1=-b/(2*a);
            binding.result.setText("one real solution:x= "+x1);
        }
    }
}
