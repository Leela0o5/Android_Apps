package com.example.mycustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adapterClass extends BaseAdapter {
private Context context;
private String[] items;
public adapterClass(Context context,String[] items){
    this.context=context;
    this.items=items;
}

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            //convertview is a recycled view that u can use to improve the performance of ur list
            convertView= LayoutInflater.from(context).
                         inflate(R.layout.mylistview,parent,false);
            holder=new ViewHolder();
            holder.textView=convertView.findViewById(R.id.text);
            convertView.setTag(holder);

        }
        else{
            holder=(ViewHolder) convertView.getTag();
        }
        holder.textView.setText(items[position]);
        return convertView;
    }
    static class ViewHolder{
        TextView textView;
    }
}
