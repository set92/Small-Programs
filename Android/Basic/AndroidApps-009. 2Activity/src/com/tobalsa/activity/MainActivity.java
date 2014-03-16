package com.tobalsa.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
//    	Seteamos el theme de la activity antes de mandar visualizar el layout
    	//Se puede hacer mediante XML modificandolo en el AndroidManifest
    	//this.setTheme(R.style.ThemeCreditos);
        setContentView(R.layout.activity_main);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void lanzar(View v){
    	Intent i = new Intent(this, AcercaDe.class);
    	startActivity(i);
    }
    
}
