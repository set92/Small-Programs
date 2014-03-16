package com.tobalsa.almacenamientodb_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreacionSQLite extends SQLiteOpenHelper{
	
	public static final String nombreDB="SergioDB";
	public static final String nombreTabla="VOTANTES";
	public static final int versionDB=1;
	public String sqlCreacionDB="create table "+nombreTabla+" (DNI text primary key, NOMBRE text, COLEGIO text, NUM_MESA integer)";

	public CreacionSQLite(Context contexto) {
		super(contexto, nombreDB, null, versionDB);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(sqlCreacionDB);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int versionAnterior, int versionPosterior) {
		database.execSQL("drop table if "+nombreTabla+" exists");
		
		database.execSQL(sqlCreacionDB);
	}



}
