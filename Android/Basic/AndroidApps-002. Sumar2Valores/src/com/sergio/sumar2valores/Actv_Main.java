package com.sergio.sumar2valores;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings.TextSize;
import android.widget.EditText;
import android.widget.TextView;

public class Actv_Main extends Activity {
	private EditText etvalor1, etvalor2;
	private TextView tvvalor1, tvvalor2, tvresultado;
			
			
			
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__main);
        
    	etvalor1=(EditText) findViewById(R.id.ETvalor1);
    	etvalor2=(EditText) findViewById(R.id.ETvalor2);
    	tvresultado=(TextView) findViewById(R.id.TVresultado);
    	
    	
    }
    
    public void sumar(View view) {
    	String strnum1=etvalor1.getText().toString();
        String strnum2=etvalor2.getText().toString();
        
        double num1=Integer.parseInt(strnum1);
        double num2=Float.parseFloat(strnum2);
        double suma=num1+num2;
        String resultado=String.valueOf(suma);
        tvresultado.setText(resultado);

    	tvresultado.setTypeface(null, Typeface.BOLD);
    	tvresultado.setTextSize(50);
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_actv__main, menu);
        return true;
    }
}
