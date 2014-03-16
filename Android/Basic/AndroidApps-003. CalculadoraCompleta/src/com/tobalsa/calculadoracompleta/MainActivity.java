package com.tobalsa.calculadoracompleta;

import android.os.Bundle;
import android.app.Activity;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText ETresultado;
	private Button btn_num0, btn_num1, btn_num2, btn_num3, btn_num4, btn_num5, btn_num6, btn_num7,
	btn_num8, btn_num9, btn_sumar, btn_restar, btn_dividir, btn_multiplicar, btn_resultado, btn_borrar;
	private double num1=0, resultado=0;
	private boolean isNumeroNuevo;
	private String operacionEnCurso;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ETresultado=(EditText) findViewById(R.id.ET_Resultado);
        btn_num0=(Button) findViewById(R.id.btn_num0);
        btn_num1=(Button) findViewById(R.id.btn_num1);
        btn_num2=(Button) findViewById(R.id.btn_num2);
        btn_num3=(Button) findViewById(R.id.btn_num3);
        btn_num4=(Button) findViewById(R.id.btn_num4);
        btn_num5=(Button) findViewById(R.id.btn_num5);
        btn_num6=(Button) findViewById(R.id.btn_num6);
        btn_num7=(Button) findViewById(R.id.btn_num7);
        btn_num8=(Button) findViewById(R.id.btn_num8);
        btn_num9=(Button) findViewById(R.id.btn_num9);
        
        btn_sumar=(Button) findViewById(R.id.btn_sumar);
        btn_restar=(Button) findViewById(R.id.btn_restar);
        btn_dividir=(Button) findViewById(R.id.btn_dividir);
        btn_multiplicar=(Button) findViewById(R.id.btn_multiplicar);
        btn_resultado=(Button) findViewById(R.id.btn_resultado);
        btn_borrar=(Button) findViewById(R.id.btn_borrar);
        
//      Listener para el btn de borrado (la C)
        btn_borrar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				ETresultado.setText(null);//Seteamos el texto a 0 cuando el usuario pulse la C
				num1=0;
				resultado=0;
				operacionEnCurso="";
			}
		});
        
//      Listener para los botones de los numeros
        View.OnClickListener lsBtnNumeros = new View.OnClickListener() {
			public void onClick(View v) {
//				Comprobamos si es un numero nuevo y si lo es borramos el anterior y lo guardamos en una variable
				EsNumeroNuevo();
//				Seteamos el contenido de la EditText a su contenido mas el contenido que le pase el boton, y lo que le haya pasado el boton se lo pasamos a string
				ETresultado.setText(ETresultado.getText()+((Button)v).getText().toString());
			}
		};
		
//		Listener para los botones de operaciones
		View.OnClickListener lsBtnOperaciones = new View.OnClickListener() {			
			public void onClick(View v) {
				String texto=((Button)v).getText().toString();
				isNumeroNuevo=true;
				if (texto.equals("+"))	operacionEnCurso="sumar";
				if (texto.equals("-"))	operacionEnCurso="restar";
				if (texto.equals("/"))	operacionEnCurso="dividir";
				if (texto.equals("*"))	operacionEnCurso="multiplicar";
				if (texto.equals("=")) {
					if (operacionEnCurso.equals("sumar")) {
						resultado=num1+Double.parseDouble(ETresultado.getText().toString());
						ETresultado.setText(String.valueOf(resultado));
					} else if (operacionEnCurso.equals("restar")) {
						resultado=num1-Double.parseDouble(ETresultado.getText().toString());
						ETresultado.setText(String.valueOf(resultado));
					} else if (operacionEnCurso.equals("dividir")) {
						resultado=num1/Double.parseDouble(ETresultado.getText().toString());
						ETresultado.setText(String.valueOf(resultado));
					} else if (operacionEnCurso.equals("multiplicar")) {
						resultado=num1*Double.parseDouble(ETresultado.getText().toString());
						ETresultado.setText(String.valueOf(resultado));
					}
					
				}
				
			}
		};
		
		btn_num0.setOnClickListener(lsBtnNumeros);
		btn_num1.setOnClickListener(lsBtnNumeros);
		btn_num2.setOnClickListener(lsBtnNumeros);
		btn_num3.setOnClickListener(lsBtnNumeros);
		btn_num4.setOnClickListener(lsBtnNumeros);
		btn_num5.setOnClickListener(lsBtnNumeros);
		btn_num6.setOnClickListener(lsBtnNumeros);
		btn_num7.setOnClickListener(lsBtnNumeros);
		btn_num8.setOnClickListener(lsBtnNumeros);
		btn_num9.setOnClickListener(lsBtnNumeros);
		
		btn_sumar.setOnClickListener(lsBtnOperaciones);
		btn_restar.setOnClickListener(lsBtnOperaciones);
		btn_dividir.setOnClickListener(lsBtnOperaciones);
		btn_multiplicar.setOnClickListener(lsBtnOperaciones);
		btn_resultado.setOnClickListener(lsBtnOperaciones);
		
    }

    protected void EsNumeroNuevo() {
		if (isNumeroNuevo == true) {
			num1=Double.parseDouble(ETresultado.getText().toString());
			ETresultado.setText(null);
			isNumeroNuevo = false;
		}
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
