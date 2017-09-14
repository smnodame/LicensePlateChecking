package com.example.boonprakit.cars;

/**
 * Created by boonprakit on 14/9/2560.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by boonprakit on 10/9/2560.
 */

public class DBHelper extends SQLiteOpenHelper {

    private final String TAG = getClass().getSimpleName();

    private SQLiteDatabase sqLiteDatabase;

    public DBHelper(Context context) {
        super(context, Environment.getExternalStorageDirectory().toString() + File.separator +"DemoT.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<String> getListID(String number) {
        List<String> IDs = new ArrayList<String>();

        sqLiteDatabase = this.getWritableDatabase();
        String table = "";
        if(number.length() == 1)
        {
            table = "single";
        }
        else if(number.length() > 1)
        {
            table = "double_" + number.charAt(0) + number.charAt(1);
        }
        else {
            return Collections.EMPTY_LIST;
        }
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT id FROM "+ table +" WHERE number = '"+ number +"' ORDER BY city, charactor", null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        while(!cursor.isAfterLast()) {

            IDs.add(cursor.getString(0) + "");

            cursor.moveToNext();
        }

        sqLiteDatabase.close();

        return IDs;
    }

    public String getDetail(String id, String number) {
        sqLiteDatabase = this.getWritableDatabase();
        String table = "";
        if(number.length() == 1)
        {
            table = "single";
        }
        else if(number.length() > 1)
        {
            table = "double_" + number.charAt(0) + number.charAt(1);
        }
        else {
            return "";
        }
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT description FROM "+ table +" WHERE id = '"+ id +"'", null);
        String description = "-";
        if (cursor != null) {
            cursor.moveToFirst();
        }
        while(!cursor.isAfterLast()) {
            description = cursor.getString(0);
            cursor.moveToNext();
        }

        sqLiteDatabase.close();

        return description;
    }
}

