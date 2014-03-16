package com.tobalsa.spinner;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText ETvalor1, ETvalor2;
	private TextView TVresultado;
	private Spinner Sopciones;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ETvalor1=(EditText)findViewById(R.id.ETvalor1);
        ETvalor2=(EditText)findViewById(R.id.ETvalor2);
        TVresultado=(TextView)findViewById(R.id.TVresultado);
        Sopciones=(Spinner) findViewById(R.id.Sopciones);
        
        String opciones[]={"Suma","Resta","Multiplicacion","Division"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_dropdown_item, opciones);
        Sopciones.setAdapter(adapter);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void operar(View v) {
        int num1=Integer.parseInt(ETvalor1.getText().toString());
        int num2=Integer.parseInt(ETvalor2.getText().toString());
        
        String opcion=Sopciones.getSelectedItem().toString();
        
        if (opcion.equals("sumar")) {
            int suma=num1+num2;
            String resu=String.valueOf(suma);
            TVresultado.setText(resu);
        } else
            if (opcion.equals("restar")) {
                int resta=num1-num2;
                String resu=String.valueOf(resta);
                TVresultado.setText(resu);                
            }
            else
                if (opcion.equals("multiplicar")) {
                    int multi=num1*num2;
                    String resu=String.valueOf(multi);
                    TVresultado.setText(resu);

                }
                else
                    if (opcion.equals("dividir")) {
                        int div=num1/num2;
                        String resu=String.valueOf(div);
                        TVresultado.setText(resu);
                    }
	}
}
