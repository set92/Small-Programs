package com.tobalsa.eventotouchdibujarcirculo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnTouchListener {
	private int corx,cory;
    private Lienzo fondo;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout linearLayout = (LinearLayout)findViewById(R.id.LinearLayout1);
        corx=-100;
        cory=-100;
        fondo=new Lienzo(this); 
        fondo.setOnTouchListener(this);
        linearLayout.addView(fondo);   
	}
	public boolean onTouch(View v, MotionEvent event) {
        corx=(int)event.getX();
        cory=(int)event.getY();
        fondo.invalidate();
        return true;
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
            Paint pincel1=new Paint();
            pincel1.setARGB(255,255,0,0);
            pincel1.setStrokeWidth(4);
            pincel1.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(corx, cory, 20, pincel1);            
        }
    }
}
