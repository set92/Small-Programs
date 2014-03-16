package com.set.holamundo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.support.*;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
		final Button btnHola = (Button)findViewById(R.id.BtnHola);

		btnHola.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, FrmMensaje.class);
				Bundle bundle = new Bundle();
				bundle.putString("NOMBRE", txtNombre.getText().toString());
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.activity_main, menu);
    	return true;
    }
    
    

    public class FrmMensaje extends Activity {
    	@Override
    	public void onCreate(Bundle savedInstanceState) {
    		super.onCreate(savedInstanceState);
    		setContentView(R.layout.frmmensaje);
    	}
    }

}
