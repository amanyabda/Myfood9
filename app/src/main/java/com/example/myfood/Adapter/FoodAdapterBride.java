package com.example.myfood.Adapter;


import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfood.DB.DBAdapterBride;
import com.example.myfood.Module.FoodBride;
import com.example.myfood.R;

import java.util.ArrayList;
import java.util.List;


public class FoodAdapterBride extends BaseAdapter  implements Filterable
{
    //1
    SQLiteDatabase database;
    //2
   ArrayList<FoodBride> data;
   ArrayList<FoodBride> orig;

    List<FoodBride> list;
    DBAdapterBride db;

    //3
    Activity activity;



    //4


    public FoodAdapterBride(ArrayList<FoodBride> data, Activity activity) {
        this.data = data;
        this.list = list;
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
    public View getView(final int position, View convertView, final ViewGroup parent) {

        View root= LayoutInflater.from(activity).inflate(R.layout.food_item,null,false);

        final TextView name_food= root.findViewById(R.id.food_name);

        final ImageView image_food = root.findViewById(R.id.food_image);
        final ImageView image_food_fav = root.findViewById(R.id.fav);
       /* if (db.IsFavrites(position)){
            image_food_fav.setImageResource(R.drawable.ic_favorite_black_24dp);
            image_food_fav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!db.IsFavrites(position)){

                        db.addToFavrites(position);
                        image_food_fav.setImageResource(R.drawable.ic_favorite_black_24dp);
                        Toast.makeText(activity, "food is added", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        db.removeFromFavrites(position);
                        image_food_fav.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                        Toast.makeText(activity, "food is removed", Toast.LENGTH_SHORT).show();


                    }
                }
            });



        }*/



        int image = activity.getResources().getIdentifier(data.get(position).getImageFood()
                    ,"drawable",activity.getPackageName());

        image_food.setImageResource(image);

        String namefood = data.get(position).getNameFood();
        name_food.setText(namefood);




        return root;
    }


     @Override
    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults oReturn = new FilterResults();
                final ArrayList<FoodBride> results = new ArrayList<FoodBride>();
                if (orig == null)
                    orig = data;
                if (constraint != null) {
                    if (orig != null && orig.size() > 0) {
                        for (final FoodBride g : orig) {
                            if (g.getNameFood().toLowerCase()
                                    .contains(constraint.toString()))
                                results.add(g);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                data = (ArrayList<FoodBride>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


}
