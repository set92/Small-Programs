package com.tobalsa.almacenamientodb_sqlite;


import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	public EditText etNombre, etDNI, etColegio, etNumMesa;
    
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNombre = (EditText) findViewById(R.id.etNombre);
        etDNI = (EditText) findViewById(R.id.etDNI);
        etColegio = (EditText) findViewById(R.id.etColegio);
        etNumMesa = (EditText) findViewById(R.id.etMesa);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void alta(View v) {
    	CreacionSQLite creacionDB1 = new CreacionSQLite(this);
        SQLiteDatabase db1 = creacionDB1.getWritableDatabase();
        
    	String strDni=etDNI.getText().toString();
    	String strNombre=etNombre.getText().toString();
    	String strColegio=etColegio.getText().toString();
    	String strNumMesa=etNumMesa.getText().toString();
    	
    	ContentValues nuevoRegistro= new ContentValues();
    	nuevoRegistro.put("DNI", strDni);
    	nuevoRegistro.put("NOMBRE", strNombre);
    	nuevoRegistro.put("COLEGIO", strColegio);
    	nuevoRegistro.put("NUM_MESA", strNumMesa);
    	db1.insert("VOTANTES", null, nuevoRegistro);
    	db1.close();
    	
    	etDNI.setText("");
    	etNombre.setText("");
    	etColegio.setText("");
    	etNumMesa.setText("");
    	
    	Toast.makeText(this, "Se ha cargado correctamnete los datos", Toast.LENGTH_SHORT).show();
    	
    }
    
    public void baja(View v) {
    	CreacionSQLite creacionDB1 = new CreacionSQLite(this);
        SQLiteDatabase db1 = creacionDB1.getWritableDatabase();
        
        String strDni=etDNI.getText().toString();
        
        int registrosBorrados=db1.delete("VOTANTES", "DNI="+"'"+strDni+"'", null);
        db1.close();
        
        etDNI.setText("");
    	etNombre.setText("");
    	etColegio.setText("");
    	etNumMesa.setText("");
    	
    	if (registrosBorrados == 1) {
			Toast.makeText(this, "Usuario borrado con exito", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this, "Usuario no borrado", Toast.LENGTH_SHORT).show();
		}
	}
    
    public void modificacion(View v) {
    	CreacionSQLite creacionDB1 = new CreacionSQLite(this);
        SQLiteDatabase db1 = creacionDB1.getWritableDatabase();
        
    	String strDni=etDNI.getText().toString();
    	String strNombre=etNombre.getText().toString();
    	String strColegio=etColegio.getText().toString();
    	String strNumMesa=etNumMesa.getText().toString();
    	
    	ContentValues nuevoRegistro = new ContentValues();
    	nuevoRegistro.put("DNI", strDni);
    	nuevoRegistro.put("NOMBRE", strNombre);
    	nuevoRegistro.put("COLEGIO", strColegio);
    	nuevoRegistro.put("NUM_MESA", strNumMesa);
    	
    	int registrosBorrar=db1.update("VOTANTES", nuevoRegistro, "dni="+strDni, null);
        db1.close();
        if (registrosBorrar==1) {
			Toast.makeText(this, "Registro borrado adecuadamente", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this, "No existe una persona con ese registro", Toast.LENGTH_SHORT).show();
		}
	}
    
    public void consulta(View v) {
    	CreacionSQLite creacionDB1 = new CreacionSQLite(this);
        SQLiteDatabase db1 = creacionDB1.getWritableDatabase();
        
        String dni=etDNI.getText().toString();
        Cursor fila=db1.rawQuery("select nombre,colegio,nromesa from votantes where dni="+dni+"",null);
        if (fila.moveToFirst())
        {
            etNombre.setText(fila.getString(0));
            etColegio.setText(fila.getString(1));
            etNumMesa.setText(fila.getString(2));            
        }
        else{
            Toast.makeText(this, "No existe una persona con dicho dni", Toast.LENGTH_SHORT).show();
        }
        db1.close(); 
	}
    
}
