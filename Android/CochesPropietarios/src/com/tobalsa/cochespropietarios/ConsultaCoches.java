package com.tobalsa.cochespropietarios;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConsultaCoches extends Activity {
	public ListView lstMatriculas;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_coches);
        
        lstMatriculas = (ListView) findViewById(R.id.lstMatriculas);
        
        cargarListView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_consulta_coches, menu);
        return true;
    }
    public void cargarListView() {
		CreacionSQLite CrearDB = new CreacionSQLite(this);
		SQLiteDatabase db = CrearDB.getReadableDatabase();
		//List<String> labels = db.getAllLabels();
        List<String> labels = new ArrayList<String>();
        
        Cursor cursor = db.rawQuery("select matricula, dni from tablaCoches", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add("Matricula: "+cursor.getString(0));
                labels.add("DNI: "+cursor.getString(1));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

		// Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.textView1, labels);
        lstMatriculas.setAdapter(dataAdapter);
	}
}
