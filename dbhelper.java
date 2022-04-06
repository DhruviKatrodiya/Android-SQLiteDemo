package com.example.assignment2q2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbhelper extends SQLiteOpenHelper {

    public dbhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "Employee", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table emp(e_id integer primary key autoincrement,e_name text,e_des text,e_city text,e_doj text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists emp");
        onCreate(sqLiteDatabase);

    }

    public void addData(String en,String edes,String ecity,String doj)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("e_name",en);
        cv.put("e_des",edes);
        cv.put("e_city",ecity);
        cv.put("e_doj",doj);
        db.insert("emp",null,cv);
        db.close();
    }
}
