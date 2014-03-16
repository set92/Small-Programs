package com.tobalsa.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AcercaDe extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acerca_de);
		
	}
	public void finalizar(View v){
		finish();
	}
}
