package com.tobalsa.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class activity2 extends Activity {
	public WebView wbWeb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		wbWeb= (WebView) findViewById(R.id.wbWeb);
		
		Bundle bundle=getIntent().getExtras();
		wbWeb.loadUrl("http://"+bundle.getString("direccion"));
	}
	
	public void finalizar(View v){
		finish();
	}
}
