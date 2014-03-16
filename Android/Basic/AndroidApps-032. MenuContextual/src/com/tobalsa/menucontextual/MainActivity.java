package com.tobalsa.menucontextual;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText etTexto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etTexto = (EditText) findViewById(R.id.etTexto);
		registerForContextMenu(etTexto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderTitle("Elija el color de fondo");
		MenuInflater inflater = getMenuInflater();
		
        inflater.inflate(R.menu.activity_main, menu);
	}
	
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.optRojo:etTexto.setBackgroundColor(Color.rgb(255, 0, 0)) ;
        break;
        case R.id.optVerde:etTexto.setBackgroundColor(Color.rgb(0, 255, 0)) ; 
        break;
        case R.id.optAzul:etTexto.setBackgroundColor(Color.rgb(0, 0, 255)) ; 
        break;                
        }
        return true;
    }   

}
