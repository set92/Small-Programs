package com.tobalsa.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public EditText ETweb;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ETweb=(EditText) findViewById(R.id.ETweb);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void lanzar(View v){
    	Intent i = new Intent(this, activity2.class);
    	i.putExtra("direccion", ETweb.getText().toString());
    	startActivity(i);
    }
    
}
