package com.tobalsa.usandothreads;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular extends Activity {
	public EditText etNum1, etNum2;
	public TextView tvSuma, tvResta, tvDivision, tvMultiplicacion;
	public Button btnOperar;
	public float num1=0,num2=0;
	final Handler handler= new Handler();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcular);

		etNum1=(EditText) findViewById(R.id.etNum1);
		etNum2=(EditText) findViewById(R.id.etNum2);
		tvSuma=(TextView) findViewById(R.id.tvSuma);
		tvResta=(TextView) findViewById(R.id.tvResta);
		tvDivision=(TextView) findViewById(R.id.tvDivision);
		tvMultiplicacion=(TextView) findViewById(R.id.tvMultiplicacion);
		btnOperar=(Button) findViewById(R.id.btnOperar);

		final Thread hiloSuma = new Thread(new Runnable() {
			public void run() {
				tvSuma.setText(""+(num1+num2));
			}
		});
		final Thread hiloResta = new Thread(new Runnable() {
			public void run() {
				tvResta.setText(""+(num1-num2));
			}
		});
		final Thread hiloDividir = new Thread(new Runnable() {
			public void run() {
				tvDivision.setText(""+(num1/num2));
			}
		});
		final Thread hiloMultiplicar = new Thread(new Runnable() {
			public void run() {
				tvMultiplicacion.setText(""+(num1*num2));
			}
		});
		btnOperar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				num1=Float.parseFloat(etNum1.getText().toString());
				num2=Float.parseFloat(etNum2.getText().toString());
				
				handler.post(hiloSuma);
				handler.post(hiloResta);
				handler.post(hiloDividir);
				handler.post(hiloMultiplicar);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_calcular, menu);
		return true;
	}
}
