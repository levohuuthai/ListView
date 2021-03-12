package com.example.baitap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAo extends BaseAdapter  {

    public CustomAo(Context ctx, int layoutItem, ArrayList<Ao> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItem;
    ArrayList<Ao> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        TextView tvAo = convertView.findViewById(R.id.tvAo);
        TextView tvGia = convertView.findViewById(R.id.tvGia);
        ImageView imgAo = convertView.findViewById(R.id.imgAo);

        tvAo.setText(arrayList.get(position).getTenAo());
        tvGia.setText(arrayList.get(position).getGia());
        imgAo.setImageResource(arrayList.get(position).getImage());
        return convertView;
    }
}
