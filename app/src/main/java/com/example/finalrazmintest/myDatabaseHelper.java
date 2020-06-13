package com.example.finalrazmintest;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME ="razmin.db" ;
    public static final String TBL_NAME="test" ;

    public myDatabaseHelper( Context context) {
        super(context, DB_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TBL_NAME + "(Id INTEGER PRIMARY KEY AutoIncrement , name TEXT , LastName TEXT,A INTEGER,B INTEGER,C INTEGER,D INTEGER,E INTEGER,F INTEGER)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TBL_NAME);
        onCreate(db);
    }






    //_________________________________________________________________________________________________
    //تابع اضافه کردن
    public boolean insertData(String n,String m,int A,int B,int C,int D,int E,int F
    ){

//دیتابیس قابل نوشتن می شود
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
        ContentValues cv=new ContentValues();
        cv.put("name"    ,n);
        cv.put("LastName",m);
       cv.put("A",A);
       cv.put("B",B);
       cv.put("C",C);
       cv.put("D",D);
       cv.put("E",E);
       cv.put("F",F);
//وارد کردن اطلاعات به دیتابیس
        long result=db.insert(TBL_NAME,null,cv);

//بررسی وارد شدن اطلاعات به دیتابیس
        if(result==-1)
            return false;
        else
            return true;
    }
//_________________________________________________________________________________

    //تابع حذف کردن
    public boolean deleteData(String id){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//حذف اطلاعات از دیتابیس
        long result=db.delete(TBL_NAME,"Id=?",new String[] {id});

//بررسی حذف اطلاعات
        if(result==0)
            return false;
        else
            return true;
    }

//_________________________________________________________________________________________


    //تابع آپدیت
    public boolean updateData(String id,String n){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
        ContentValues cv=new ContentValues();
        cv.put("name",n);

//آپدیت اطلاعات دیتابیس
        long result=db.update(TBL_NAME,cv,"Id=?",new String [] {id});

//بررسی آپدیت اطلاعات
        if(result<1)
            return false;
        else
            return true;
    }
//__________________________________________________________________________________________


    public Cursor ShowallData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from " + TBL_NAME ,null);

        return result;
    }





}

