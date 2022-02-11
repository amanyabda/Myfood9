package com.example.myfood.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import com.example.myfood.Adapter.CustomGridViewAdapter;
import com.example.myfood.Adapter.FoodAdapter;
import com.example.myfood.DB.DBAdapter;
import com.example.myfood.Main2Activity;
import com.example.myfood.Module.Food;
import com.example.myfood.R;

import java.util.ArrayList;

public class MainFood extends Fragment {

    private ImageView imageView;
    private TextView textView;
    GridView gridView;
    ArrayList<Food> foods = new ArrayList<>();

        Food foodobject=new Food();
    public MainFood() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.foodmain, container, false);
        gridView =view.findViewById(R.id.lgdata);

        CustomGridViewAdapter customAdapter = new CustomGridViewAdapter(getActivity());
        gridView.setAdapter(customAdapter);

        final GridView lvEmployee = view.findViewById(R.id.lgdata);
        DBAdapter db = new DBAdapter(getActivity());
        foods=db.getAllFoods();
        FoodAdapter productAdapter = new FoodAdapter(foods, getActivity());
        lvEmployee.setAdapter(productAdapter);


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

