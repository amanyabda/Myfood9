package com.example.myfood.Module;

public class FoodBride {

    //Part Of DataBase:
    public static final String TABLE_NAME = "FoodBride";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_IMAGE = "image";



    public static final String CREATE_TABLE_PRODUCT=  "CREATE TABLE "+TABLE_NAME+"("+COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            COL_NAME+" TEXT NOT NULL,"+COL_DESCRIPTION+" TEXT,"+COL_IMAGE+" TEXT"+")";

    private int id;
    private String NameFood;
    private String ImageFood;
    private String DescriptionFood;

    public FoodBride() {
    }


    public FoodBride(int id, String nameFood, String imageFood, String descriptionFood) {
        this.id = id;
        NameFood = nameFood;
        ImageFood = imageFood;
        DescriptionFood = descriptionFood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFood() {
        return NameFood;
    }

    public void setNameFood(String nameFood) {
        NameFood = nameFood;
    }

    public String getImageFood() {
        return ImageFood;
    }

    public void setImageFood(String imageFood) {
        ImageFood = imageFood;
    }

    public String getDescriptionFood() {
        return DescriptionFood;
    }

    public void setDescriptionFood(String descriptionFood) {
        DescriptionFood = descriptionFood;
    }
}

