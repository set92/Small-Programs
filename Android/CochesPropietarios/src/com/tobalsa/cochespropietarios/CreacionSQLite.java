package com.tobalsa.cochespropietarios;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreacionSQLite  extends SQLiteOpenHelper{
	public static String name="BDconcesionario";
	public static int version=1;
	public static String tablaPropietarios="tablaPropietarios";
	public static String tablaCoches="tablaCoches";
	
	public CreacionSQLite(Context context) {
		super(context, name, null, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table "+tablaPropietarios+" (dni text primary key, nombre text, edad integer);");
		db.execSQL("create table "+tablaCoches+" (matricula text primary key, marca text, potencia integer, dni text not null);");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

	public List<String> getAllLabels() {
        List<String> labels = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select dni from "+tablaPropietarios, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        
        cursor.close();
        db.close();
        return labels;
	}

}
