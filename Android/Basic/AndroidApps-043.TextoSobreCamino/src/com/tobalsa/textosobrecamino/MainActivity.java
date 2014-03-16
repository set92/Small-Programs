package com.tobalsa.textosobrecamino;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
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
            canvas.drawRGB(0,0,255);              
            int alto=canvas.getHeight();
            
            Path camino = new Path();
            camino.moveTo(0, alto/2);
            camino.lineTo(40, alto/2-30);
            camino.lineTo(80, alto/2-60);
            camino.lineTo(120, alto/2-90);
            camino.lineTo(160, alto/2-120);
            camino.lineTo(220, alto/2-150);
            camino.lineTo(280, alto/2-180);
            camino.lineTo(340, alto/2-210);            
            Paint pincel1=new Paint();
            pincel1.setARGB(255,255,0,0);
            pincel1.setTextSize(30);
            canvas.drawTextOnPath("Hola Mundo Hola Mundo",camino, 0, 0, pincel1);           
        }
    }

}
