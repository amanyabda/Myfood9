package com.example.myfood.Adapter;


import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static android.app.Activity.RESULT_OK;

import com.example.myfood.Module.Food;
import com.example.myfood.R;


public class FoodAdapter extends BaseAdapter {
    //1
    SQLiteDatabase database;
    //2
    ArrayList<Food> data;
    //3
    Activity activity;

    //4
    public FoodAdapter(ArrayList<Food> data, Activity activity) {
        this.data = data;
        this.activity = activity;
    }

    //5
    @Override
    public int getCount() {
        return data.size();
    }

    //6
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    //7
    @Override
    public long getItemId(int position) {
        return position;
    }

    //8
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View root= LayoutInflater.from(activity).inflate(R.layout.food_item,null,false);

        final TextView name_food= root.findViewById(R.id.food_name);

        final ImageView image_food = root.findViewById(R.id.food_image);



        int image = activity.getResources().getIdentifier(data.get(position).getImageFood()
                    ,"drawable",activity.getPackageName());

        image_food.setImageResource(image);

        String namefood = data.get(position).getNameFood();
        name_food.setText(namefood);




        return root;
    }




}
