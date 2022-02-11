package com.example.myfood.DB;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.myfood.Module.FoodBride;

import java.util.ArrayList;

public class DBAdapterBride extends SQLiteOpenHelper {


    //DDL
    SQLiteDatabase db;
    public static final String DB_NAME = "Store_Db1";
    public static final int DB_VERSION = 5;

    public DBAdapterBride(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(FoodBride.CREATE_TABLE_PRODUCT);

        String sqlQuery1 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('معجنات الضفائر',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',1,"+"'brid1'"+")";





        String sqlQuery2 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',2,"+"'brid2'"+")";

        String sqlQuery3 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',3,"+"'brid1'"+")";

        String sqlQuery4 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',4,"+"'brid1'"+")";

        String sqlQuery5 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',5,"+"'brid1'"+")";
 String sqlQuery6 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('كرواسون بالشكولاتة',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',6,"+"'brid2'"+")";
 String sqlQuery7 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',7,"+"'brid1'"+")";
 String sqlQuery8 = "INSERT INTO " + FoodBride.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('كرواسون بالشكولاتة',"+"'\n" +
                "االمكوّنات\n" +
                "\n" +
                " علبة من عجينة البف باستري الجاهزة. نصف كوب من صلصة البيتزا الجاهزة. \n" +
                "نصف كوب من الفطر المقطّع. \n" +
                "نصف كوب من الذرة. مئة غرام من بيبروني البقر. \n" +
                "مئة غرام من برش جبنة الموزاريلا. \n" +
                "مئة غرام من جامبون الحبش. \n" +
                "مئة غرام من جبن الشيدر. بيضة واحدة مخفوقة لدهن العجينة. طريقة التحضير نفرد العجينة على أرضية صلبة. ندهن صلصة البيتزا في المنتصف، ونوزّع الفطر، والذرة. نضيف الجامبون، وجبنة الموزاريلا، وجبنة الشيدر، ونضيف البيبروني. نُحدث بعض الخطوط على جوانب العجينة باستخدم سكينة حادة. نلف الخطود على شكل ضفيرة بتروٍ. نضع العجينة في صينية مُغلّفة بورق الزبدة، ثمّ ندهن وجه الضفيرة بالبيض المخفوق. نخبز الضفيرة في فرن مسخّن مسبقاً على نار متوسطة حتى تتحمّر.,n ',8,"+"'brid2'"+")";


/*
 String sqlQuery4 = "INSERT INTO " + Food.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('بيتزا',"+"'بيتزا بيتزا ',4,"+"'pizza_recip'"+")";

 String sqlQuery5 = "INSERT INTO " + Food.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('سمبوسك',"+"'المقادير\n" +
         "5 x عدد موز\n" +
         "4 x معلقة كبيرة كاكاو\n" +
         "3 x معلقة كبيرة كسترد\n" +
         "3 x كوب لبن كامل الدسم\n" +
         "2 x كوب بسكوت (مطحون)\n" +
         "1 x كوب كريمة مخفوقة (للتزيين)\n" +
         "½ x كوب زبدة (بدرجة حرارة الغرفة)\n" +
         "½ x معلقة صغيرة قرفة\n" +
         "½ x كوب سكر\n" +
         "½ x كوب بندق (محمص)\n" +
         "\n" +
         "الخطوات\n" +
         "يسخن الفرن على درجة حرارة 180.\n" +
         "هنخلط البسكوت جيدا مع الزبدة والقرفة و2 معلقة سكر صغيرة.\n" +
         "هندهن القالب بالزبد ويفرد البسكوت فى القالب ويضغط علية باليد ويدخل الفرن لمدة عشر دقائق.\n" +
         "فى وعاء يخلط الكسترد واللبن البارد والسكر والكاكاو جيدا ثم يوضع على النار الى ان يغلظ القوام ويترك الخليط ليبرد.\n" +
         "يقطع الموز حلقات و ويرص فوق البسكوت.\n" +
         "يوضع كسترد الشوكولاته على البسكوت والموز ويدخل الثلاجه لمده 2 ساعه يزين بحلقات موز والكريمه المخفوقه ويقدم.',5,"+"'samosa'"+")";



        String sqlQuery6 = "INSERT INTO " + Food.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('كب كيك',"+"'المقادير\n" +
                "6 x عدد جبنة كيري (لكريمة الحشو)\n" +
                "2 x معلقة كبيرة سكر\n" +
                "1 x كوب حليب كامل الدسم (لكريمة الحشو)\n" +
                "1 x كوب كريمة مخفوقة (لكريمة الحشو)\n" +
                "1 x عدد حليب مكثف (لكريمة الحشو)\n" +
                "1 x معلقة كبيرة نشا (لكريمة الحشو)\n" +
                "½ x كوب سكر (لكريمة الحشو)\n" +
                "½ x كوب زبدة (سايحة)\n" +
                "½ x كيلو كنافة\n" +
                "¼ x كوب لبن بودرة (لكريمة الحشو)\n" +
                "الخطوات\n" +
                "نبدأ عمل كريمة الحشو نضع الحليب واللبن البودرة والسكر و كوب الكريمة ومعلقة النشا وندوب الخليط ونرفعه علي نار هادئة لغاية ما يتماسك وبعد ما نطفي النار نضيف مكعبات الجبنة ونقلب لغاية ما تدوب.\n" +
                "في الكبة نضرب الكنافة و معلقتين السكر والزبدة زي التشيز كيك.\n" +
                "في قالب الكب كيك نضع قليل من الكنافة ونضغط عليها كويس جدا ونتاكد انها غطت الجوانب كمان.\n" +
                "ناخد مقدار ملعقة من كريمة الحشو ونضعها في منتصف الكنافة ونغطيها بمقدار كنافة تانية ونقفلها.\n" +
                "نكمل مقدار الكنافة كلها وندخلها الفرن علي درجة 200 لغاية ما لونها يحمر.\n" +
                "نخرج الكنافة وهي ساخنة نسقيها بالحليب المكثف مقدار ملعقة كبيرة ونستني لما تتشربه الكنافة.\n" +
                "نخرج الكنافة من قوالب الكب كيك علي الوجه التاني ونسقيها كمان مرة بالحليب المكثف وبالهنا والشفا.',6,"+"'cubcake'"+")";



        String sqlQuery7 = "INSERT INTO " + Food.TABLE_NAME +"(name,description,id,image)"
                +" VALUES ('تارت موز',"+"'المقادير\n" +
                "5 x عدد موز\n" +
                "4 x معلقة كبيرة كاكاو\n" +
                "3 x معلقة كبيرة كسترد\n" +
                "3 x كوب لبن كامل الدسم\n" +
                "2 x كوب بسكوت (مطحون)\n" +
                "1 x كوب كريمة مخفوقة (للتزيين)\n" +
                "½ x كوب زبدة (بدرجة حرارة الغرفة)\n" +
                "½ x معلقة صغيرة قرفة\n" +
                "½ x كوب سكر\n" +
                "½ x كوب بندق (محمص)\n" +
                "\n" +
                "الخطوات\n" +
                "يسخن الفرن على درجة حرارة 180.\n" +
                "هنخلط البسكوت جيدا مع الزبدة والقرفة و2 معلقة سكر صغيرة.\n" +
                "هندهن القالب بالزبد ويفرد البسكوت فى القالب ويضغط علية باليد ويدخل الفرن لمدة عشر دقائق.\n" +
                "فى وعاء يخلط الكسترد واللبن البارد والسكر والكاكاو جيدا ثم يوضع على النار الى ان يغلظ القوام ويترك الخليط ليبرد.\n" +
                "يقطع الموز حلقات و ويرص فوق البسكوت.\n" +
                "يوضع كسترد الشوكولاته على البسكوت والموز ويدخل الثلاجه لمده 2 ساعه يزين بحلقات موز والكريمه المخفوقه ويقدم.',7,"+"'banana'"+")";

  */

        Log.e("amany",sqlQuery1);


        db.execSQL(sqlQuery1);
        db.execSQL(sqlQuery2);
        db.execSQL(sqlQuery3);
        db.execSQL(sqlQuery4);
        db.execSQL(sqlQuery5);
        db.execSQL(sqlQuery6);
        db.execSQL(sqlQuery7);
        db.execSQL(sqlQuery8);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FoodBride.TABLE_NAME);
        onCreate(db);
    }


    //-------------------------------------------------------------------------
    //DML


    public boolean insertProduct(String name, String description, int id, String image) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodBride.COL_NAME, name);
        contentValues.put(FoodBride.COL_IMAGE, image);
        contentValues.put(FoodBride.COL_DESCRIPTION, image);
        return db.insert(FoodBride.TABLE_NAME, null, contentValues) > 0;
    }

    @SuppressLint("Range")
    public ArrayList<FoodBride> getAllFoods() {
        ArrayList<FoodBride> foods = new ArrayList<>();
        String SQLQuery ="Select * from "+FoodBride.TABLE_NAME;
        Cursor c = db.rawQuery(SQLQuery,null);

        if(c.moveToFirst())
        {
            do{
                FoodBride category=new FoodBride();
                category.setId(c.getInt(c.getColumnIndex(FoodBride.COL_ID)));
                category.setNameFood(c.getString(c.getColumnIndex(FoodBride.COL_NAME)));
                category.setDescriptionFood(c.getString(c.getColumnIndex(FoodBride.COL_DESCRIPTION)));
                category.setImageFood(c.getString(c.getColumnIndex(FoodBride.COL_IMAGE)));
                foods.add(category);

            }while (c.moveToNext());
        }
        c.close();
        return foods;
    }


    //Favorites:
    public void addToFavrites(int foodId){
        SQLiteDatabase database=getReadableDatabase();
        String query=String.format("INSERT INTO Food.COL_ID VALUES( '%s');",foodId);
        database.execSQL(query);
        // ContentValues contentValues = new ContentValues();
        // contentValues.put(Food.COL_ID, foodId);

    }

    public void removeFromFavrites(int foodId){
        SQLiteDatabase database=getReadableDatabase();
        String query=String.format("DELETE From WHERE Food.COL_ID ='%s';",foodId);
        database.execSQL(query);


    }
    public boolean IsFavrites(int foodId){
        SQLiteDatabase database=getReadableDatabase();
        String query=String.format("SELCET * From Food.TABLE_NAME WHERE  Food.COL_ID='%s';",foodId);
        Cursor cursor=db.rawQuery(query,null);
        if (cursor.getCount() <=0){
            cursor.close();
            return false;

        }
        cursor.close();
        return  true;


    }



}
