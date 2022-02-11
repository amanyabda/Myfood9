package com.example.myfood.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myfood.Adapter.CustomGridViewAdapter;
import com.example.myfood.Adapter.FoodAdapterBride;
import com.example.myfood.DB.DBAdapterBride;
import com.example.myfood.Main2Activity;
import com.example.myfood.Module.FoodBride;
import com.example.myfood.R;

import java.util.ArrayList;


public class Bride extends Fragment implements SearchView.OnQueryTextListener{

    private ImageView imageView;
    private TextView textView;
    GridView gridView;

    SearchView editsearch;

    FoodBride foodobject=new FoodBride();
    GridView lvEmployee;
    DBAdapterBride db;
    FoodAdapterBride productAdapter;
    int i;
    public static ArrayList<FoodBride> foods = new ArrayList<FoodBride>();
    ArrayList<String> list;


    public Bride() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bride, container, false);


        editsearch = (SearchView) view.findViewById(R.id.search);


        gridView = view.findViewById(R.id.lgdata);
        CustomGridViewAdapter customAdapter = new CustomGridViewAdapter(getActivity());
        gridView.setAdapter(customAdapter);

        lvEmployee = view.findViewById(R.id.lgdata);
        db = new DBAdapterBride(getActivity());
        foods = db.getAllFoods();
        productAdapter = new FoodAdapterBride(foods, getActivity());
        lvEmployee.setAdapter(productAdapter);

        lvEmployee.setTextFilterEnabled(true);
        setupSearchView();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FoodBride food1 = foods.get(i);

                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("id", foods.get(i).getId());
                intent.putExtra("NAME", foods.get(i).getNameFood());
                intent.putExtra("Description", foods.get(i).getDescriptionFood());
                intent.putExtra("Image", foods.get(i).getImageFood());
                // intent.putExtra("IMAGE", food1.getImageFood());
                startActivity(intent);


            }
        });




        return view;

    }

    private void setupSearchView()
    {
        editsearch.setIconifiedByDefault(false);
        editsearch.setOnQueryTextListener(this);
        editsearch.setSubmitButtonEnabled(true);
        editsearch.setQueryHint("ابحث هنا");
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {

        if (TextUtils.isEmpty(newText)) {
            lvEmployee.clearTextFilter();
        } else {
            lvEmployee.setFilterText(newText);
        }
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }



}

