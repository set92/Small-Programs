package com.tobalsa.dibujarlineas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout linearLayout = (LinearLayout)findViewById(R.id.LinearLayout1);
		Lienzo fondo=new Lienzo(this);        
		linearLayout.addView(fondo); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	class Lienzo extends View {

		public Lienzo(Context context) {
			super(context);
		}

		protected void onDraw(Canvas canvas) {
			canvas.drawRGB(255,255,0);
			int ancho=canvas.getWidth();
			Paint pincel1=new Paint();
			pincel1.setARGB(255,255,0,0);
			canvas.drawLine(0, 30, ancho, 30, pincel1);
			pincel1.setStrokeWidth(4);
			canvas.drawLine(0, 60, ancho, 60, pincel1);            
		}
	} 
}
