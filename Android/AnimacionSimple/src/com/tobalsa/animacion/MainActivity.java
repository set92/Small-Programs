package com.tobalsa.animacion;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	AnimationDrawable animacion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		animacion = (AnimationDrawable)getResources().getDrawable(R.drawable.animacion);
		ImageView cara = new ImageView(this);
		cara.setImageDrawable(animacion);
		cara.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				animacion.start();
			}
			
		});
		setContentView(cara);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
