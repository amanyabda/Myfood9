package com.example.myfood;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.myfood.Module.Food;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
Activity activity;
ArrayList<Food>data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView gridData = findViewById(R.id.textView);
        TextView descaption = findViewById(R.id.textView2);
        ImageView image = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String data= getIntent().getStringExtra("data");


        int receivedid = intent.getIntExtra("id",0);
        String receivedName = intent.getStringExtra("NAME");
        String receivedDescription = intent.getStringExtra("Description");
        String receivedImage = intent.getStringExtra("Image");

//  int receivedImage1 = Integer.parseInt(receivedImage);

        gridData.setText(receivedName);
        //gridData1.setImageResource(receivedImage);

       /* Bundle bundle=getIntent().getExtras();
       String name= bundle.getString(fooditem.getNameFood());
     int image= Integer.parseInt(bundle.getString(fooditem.getImageFood()));


        Toast.makeText(this, "image"+image, Toast.LENGTH_SHORT).show();
*/
        descaption.setText(receivedDescription);
     //   image.getResources();
       // image.setImageResource(receivedImage1);

    }
}