package com.tobalsa.cochespropietarios;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormPropietarios extends Activity {
	public EditText etNombre, etDNI, etEdad;
	public TextView tvNombre, tvDNI, tvEdad;
	public Button btnAceptar;
	public String opcionElegida;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form_propietarios);
		Bundle recogerDatos = getIntent().getExtras();
		opcionElegida = recogerDatos.getString("opcion");
		
		tvNombre=(TextView) findViewById(R.id.tvNombre);
		etNombre=(EditText) findViewById(R.id.etNombre);
		tvDNI=(TextView) findViewById(R.id.tvDNI);
		etDNI=(EditText) findViewById(R.id.etDNI);
		tvEdad=(TextView) findViewById(R.id.tvEdad);
		etEdad=(EditText) findViewById(R.id.etEdad);
		btnAceptar=(Button) findViewById(R.id.btnAceptar);
		
		if (opcionElegida.equals("alta")) {
			btnAceptar.setText("Grabar");
		}else if (opcionElegida.equals("baja")) {
			btnAceptar.setText("Borrar");
		}else if (opcionElegida.equals("modificacion")) {
			btnAceptar.setText("Modificar");
		}
		
		
		if (opcionElegida.equals("baja")) {
			tvNombre.setVisibility(View.INVISIBLE);
			etNombre.setVisibility(View.INVISIBLE);
			tvEdad.setVisibility(View.INVISIBLE);
			etEdad.setVisibility(View.INVISIBLE);
		}
		btnAceptar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (opcionElegida.equals("alta")) {
					darDeAltaUnPropietario();
				}else if (opcionElegida.equals("baja")) {
					darDeBajaUnPropietario();
				}else if (opcionElegida.equals("modificacion")) {
					modificarUnPropietario();
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_form_propietarios, menu);
		return true;
	}

	public void darDeAltaUnPropietario() {
		CreacionSQLite CrearBD = new CreacionSQLite(this);
		SQLiteDatabase db = CrearBD.getWritableDatabase();
		String strNombre=etNombre.getText().toString();
		String strDni=etDNI.getText().toString();
		String strEdad=etEdad.getText().toString();

		ContentValues registro=new ContentValues();
		registro.put("nombre", strNombre);
		registro.put("dni", strDni);
		registro.put("edad", strEdad);
		db.insert("tablaPropietarios", null, registro);
		db.close();
		etNombre.setText(null);
		etDNI.setText(null);
		etEdad.setText(null);
		Toast.makeText(this, "Registro dado de alta correctamente", Toast.LENGTH_SHORT).show();
	}
	public void darDeBajaUnPropietario() {
		CreacionSQLite CrearBD = new CreacionSQLite(this);
		SQLiteDatabase db = CrearBD.getWritableDatabase();
		String strDni=etDNI.getText().toString();
		
		int cont=db.delete("tablaPropietarios", "dni="+"'"+strDni+"'", null);
		db.close();
		etDNI.setText(null);
		if (cont==1) {
			Toast.makeText(this, "Registro borrado correctamente", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this, "Error al borrar el registro", Toast.LENGTH_SHORT).show();
		}
	}
	public void modificarUnPropietario() {
		CreacionSQLite CrearBD = new CreacionSQLite(this);
		SQLiteDatabase db = CrearBD.getWritableDatabase();
		String strNombre=etNombre.getText().toString();
		String strDni=etDNI.getText().toString();
		String strEdad=etEdad.getText().toString();
		
		ContentValues registro=new ContentValues();
		registro.put("nombre", strNombre);
		registro.put("dni", strDni);
		registro.put("edad", strEdad);
		int cont = db.update("tablaPropietarios", registro, "dni="+"'"+strDni+"'", null);
		db.close();
		
		if (cont==1) {
			Toast.makeText(this, "Registro modificado correctamente", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this, "No hay nadie con ese DNI, introduce el DNI correcto", Toast.LENGTH_SHORT).show();
		}
	}

	public void cancelar(View v) {
		finish();
	}

}
