package com.example.myfood.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfood.R;

public class CustomGridViewAdapter extends BaseAdapter {
    private Context mContext;

    String[] NameFood = {"كب كيك", "تارت موز", "السمبوسك", "مكرونة بشاميل"};
    int[] ImageFood = {R.drawable.cubcake, R.drawable.banana, R.drawable.samosa, R.drawable.macrona};


    // Constructor
    public CustomGridViewAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return ImageFood.length;
    }

    @Override
    public Object getItem(int position) {
        return ImageFood[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolderItem viewHolder;


        if (convertView == null) {

            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.food_item, parent, false);

            viewHolder = new ViewHolderItem();
            viewHolder.textViewItem = (TextView) convertView.findViewById(R.id.food_name);

            viewHolder.imageViewItem = (ImageView) convertView.findViewById(R.id.food_image);
            convertView.setTag(viewHolder);


        } else {

            viewHolder = (ViewHolderItem) convertView.getTag();
        }


        viewHolder.textViewItem.setText(NameFood[position]);
        viewHolder.textViewItem.setTag(position);
        viewHolder.imageViewItem.setImageResource(ImageFood[position]);


        return convertView;

    }


    static class ViewHolderItem {
        TextView textViewItem;
        ImageView imageViewItem;


    }



}
