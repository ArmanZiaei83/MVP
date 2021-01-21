package com.example.mvp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DateBase extends SQLiteOpenHelper {

    public DateBase(@Nullable Context context) {
        super(context, "userInfo", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table userInfo (name text , email text , password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists userInfo");
        onCreate(db);
    }
}
