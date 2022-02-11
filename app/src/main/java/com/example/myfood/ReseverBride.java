package com.example.myfood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReseverBride extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resever_bride);
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
