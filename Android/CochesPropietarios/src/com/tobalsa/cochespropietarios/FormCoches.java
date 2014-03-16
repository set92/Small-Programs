package com.tobalsa.cochespropietarios;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormCoches extends Activity {
	public Spinner spDNI;
	public TextView tvMatricula, tvPotencia, tvMarca, tvDNI;
	public EditText etMatricula, etPotencia, etMarca;
	public Button btnAceptar;
	public String opcionElegida="", strDNI="";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_coches);
		Bundle recogerDatos = getIntent().getExtras();
		opcionElegida = recogerDatos.getString("opcion");
		
        tvMarca=(TextView) findViewById(R.id.tvMarca);
        etMarca=(EditText) findViewById(R.id.etMarca);
        tvMatricula=(TextView) findViewById(R.id.tvMatricula);
        etMatricula=(EditText) findViewById(R.id.etMatricula);
        tvPotencia=(TextView) findViewById(R.id.tvPotencia);
        etPotencia=(EditText) findViewById(R.id.etPotencia);
        btnAceptar=(Button) findViewById(R.id.btnAceptar);
        tvDNI=(TextView) findViewById(R.id.tvDNI);
        spDNI=(Spinner) findViewById(R.id.spDNI);
        cargarSpinner();
        
        if (opcionElegida.equals("alta")) {
			btnAceptar.setText("Grabar");
		}else if (opcionElegida.equals("baja")) {
			btnAceptar.setText("Borrar");
		}
        
        if (opcionElegida.equals("baja")) {
        	tvMarca.setVisibility(View.INVISIBLE);
			etMarca.setVisibility(View.INVISIBLE);
			tvPotencia.setVisibility(View.INVISIBLE);
			etPotencia.setVisibility(View.INVISIBLE);
			tvDNI.setVisibility(View.INVISIBLE);
			spDNI.setVisibility(View.INVISIBLE);
		}
        
        btnAceptar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (opcionElegida.equals("alta")) {
					darDeAltaCoche();
				}else if (opcionElegida.equals("baja")) {
					darDeBajaCoche();
				}
			}
		});
        
        spDNI.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> parent, View v,int posicion, long id) {
				strDNI = parent.getItemAtPosition(posicion).toString();
			}

			public void onNothingSelected(AdapterView<?> parent) {
				strDNI = "";
			}
        	
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_form_coches, menu);
        return true;
    }
    public void cargarSpinner() {
		CreacionSQLite db = new CreacionSQLite(this);
		List<String> labels = db.getAllLabels();
		// Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, labels);
        spDNI.setAdapter(dataAdapter);
	}
	public void darDeAltaCoche() {
		CreacionSQLite CrearBD = new CreacionSQLite(this);
		SQLiteDatabase db = CrearBD.getWritableDatabase();
		String strMarca=etMarca.getText().toString();
		String strMatricula=etMatricula.getText().toString();
		String strPotencia=etPotencia.getText().toString();
		
		ContentValues registro=new ContentValues();
		registro.put("marca", strMarca);
		registro.put("matricula", strMatricula);
		registro.put("potencia", strPotencia);
		registro.put("dni", strDNI);
		db.insert("tablaCoches", null, registro);
		db.close();
		etMarca.setText(null);
		etMatricula.setText(null);
		etPotencia.setText(null);
		if (strDNI.equals("")) {
			Toast.makeText(this, "Error, debes introducir un DNI", Toast.LENGTH_LONG).show();
		}else {
			Toast.makeText(this, "Registro dado de alta correctamente", Toast.LENGTH_SHORT).show();
		}
		
	}
	public void darDeBajaCoche() {
		CreacionSQLite CrearBD = new CreacionSQLite(this);
		SQLiteDatabase db = CrearBD.getWritableDatabase();
		String strMatricula=etMatricula.getText().toString();
		
		int cont=db.delete("tablaCoches", "matricula="+"'"+strMatricula+"'", null);
		db.close();
		etMatricula.setText(null);
		if (cont==1) {
			Toast.makeText(this, "Registro borrado correctamente", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this, "Error al borrar el registro", Toast.LENGTH_SHORT).show();
		}
	}
	public void cancelar(View v) {
		finish();
	}
}
