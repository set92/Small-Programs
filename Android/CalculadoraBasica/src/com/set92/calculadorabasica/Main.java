package com.set92.calculadorabasica;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        View button = findViewById(R.id.BtnSumar);
//        button.setOnClickListener(this);
//        View settings = findViewById(R.id.ajustes);
//        settings.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
    	switch (item.getItemId()) {
	    	case R.id.menu_settings: 
	    		Intent settings = new Intent(this, Settings.class);
	    		startActivity(settings);
	    		return true;
	    	default:
	    		return super.onOptionsItemSelected(item);
	    	}
    }
    
    public void suma(View view) {
    	float num1=0,num2=0;
    	
    	if(view.getId()==findViewById(R.id.BtnSumar).getId())
    	{
    	EditText temp;
    	EditText resultado = (EditText) findViewById(R.id.Resultado_Suma);
    	
    	temp = (EditText) findViewById(R.id.Numero1);
    	try {
    		num1 = Float.parseFloat(temp.getText().toString());
		} catch (Exception e) {
			Toast aviso =Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
			aviso.show();
		}
    	
    	temp = (EditText) findViewById(R.id.Numero2);
    	try {
    		num2 = Float.parseFloat(temp.getText().toString());
		} catch (Exception e) {
			Toast aviso =Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
			aviso.show();
		}
    	
    	resultado.setText("resultado : "+(num1+num2));
    	}
	}
    
    public void ajustes(View view) {
    	Intent settings = new Intent(this, Settings.class);
		startActivity(settings);
	}
    
    public void onClick (View view){

    	
    }
}
