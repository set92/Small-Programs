package com.tobalsa.cochespropietarios;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	public RadioButton rbPropietarios, rbCoches;
	public String opcionElegida="";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		rbPropietarios=(RadioButton) findViewById(R.id.rbPropietarios);
		rbCoches=(RadioButton) findViewById(R.id.rbCoches);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void alta(View v) {
		opcionElegida="alta";
		if (rbPropietarios.isChecked()) {
			Intent pasarActivity = new Intent(this, FormPropietarios.class);
			pasarActivity.putExtra("opcion", opcionElegida);
			startActivity(pasarActivity);
		}else if (rbCoches.isChecked()) {
			Intent pasarActivity = new Intent(this, FormCoches.class);
			pasarActivity.putExtra("opcion", opcionElegida);
			startActivity(pasarActivity);
		}
	}

	public void baja(View v) {
		opcionElegida="baja";
		if (rbPropietarios.isChecked()) {
			Intent pasarActivity = new Intent(this, FormPropietarios.class);
			pasarActivity.putExtra("opcion", opcionElegida);
			startActivity(pasarActivity);
		}else if (rbCoches.isChecked()) {
			Intent pasarActivity = new Intent(this, FormCoches.class);
			pasarActivity.putExtra("opcion", opcionElegida);
			startActivity(pasarActivity);
		}
	}

	public void modificacion(View v) {
		opcionElegida="modificacion";
		if (rbPropietarios.isChecked()) {
			Intent pasarActivity = new Intent(this, FormPropietarios.class);
			pasarActivity.putExtra("opcion", opcionElegida);
			startActivity(pasarActivity);
		}else if (rbCoches.isChecked()) {
			Toast.makeText(this, "La modificacion de los coches no esta habilitada", Toast.LENGTH_LONG).show();
		}

	}

	public void consulta(View v) {
		if (rbPropietarios.isChecked()) {
			Intent pasarActivity = new Intent(this, ConsultaCoches.class);
			startActivity(pasarActivity);
		}else if (rbCoches.isChecked()) {
			Toast.makeText(this, "La consulta de los coches no esta habilitada", Toast.LENGTH_LONG).show();
		}


	}
}
