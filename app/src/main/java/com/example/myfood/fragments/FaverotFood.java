package com.example.myfood.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myfood.Adapter.FoodAdapter;
import com.example.myfood.DB.DBAdapter;
import com.example.myfood.Main2Activity;
import com.example.myfood.Module.Food;
import com.example.myfood.R;

import java.util.ArrayList;

public class FaverotFood extends Fragment {


    private ImageView imageView;
    private TextView textView;
    GridView gridView;
    ArrayList<Food> foods = new ArrayList<>();

    public FaverotFood() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.foodfaverot, container, false);

        final GridView gridView = view.findViewById(R.id.lgdata);
        DBAdapter db = new DBAdapter(getActivity());
        foods=db.getAllFoods();
        FoodAdapter productAdapter = new FoodAdapter(foods, getActivity());
        gridView.setAdapter(productAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Food food1= foods.get(i);

                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("id",foods.get(i).getId());
                //intent.putExtra("ID", foods.get(i).getId());
                intent.putExtra("NAME", foods.get(i).getNameFood());
                intent.putExtra("Description", foods.get(i).getDescriptionFood());
                intent.putExtra("Image",foods.get(i).getImageFood());


                // intent.putExtra("IMAGE", food1.getImageFood());
                startActivity(intent);
            }
        });


        return view;

    }


}
