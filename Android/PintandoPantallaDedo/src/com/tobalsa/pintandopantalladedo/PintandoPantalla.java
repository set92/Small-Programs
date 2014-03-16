package com.tobalsa.pintandopantalladedo;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class PintandoPantalla extends View implements OnTouchListener{
	public static final String TAG="Pintar";
	List<Point> points = new ArrayList<Point>();
	Paint paint = new Paint();
	Path path = new Path();
    
	public PintandoPantalla(Context context) {
		super(context);
		setFocusable(true);
		setFocusableInTouchMode(true);

		this.setOnTouchListener(this);

		paint.setColor(Color.RED);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(10);
		//OBLIGATORIO PONER STROKE, SINO NO DIBUJA LINEAS
		paint.setStyle(Paint.Style.STROKE);


	}

	@Override
	public void onDraw(Canvas canvas) {
//		for (Point point : points) {
//			canvas.drawPoint(point.x, point.y, paint);
//			//canvas.drawLine(point.x, point.y, point.finalX, point.finalY, paint);
//			Log.d(TAG, "Painting: "+point);
//		}
		
		boolean first = true;
	    for(Point point : points){
	        if(first){
	            first = false;
	            path.moveTo(point.x, point.y);
	        }
	        else{
	            path.lineTo(point.x, point.y);
	        }
	    }
	    canvas.drawPath(path, paint);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Point point = new Point();
		
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			point.x = event.getX();
			point.y = event.getY();
			points.add(point);
			break;
		case MotionEvent.ACTION_UP:
			
			break;
		case MotionEvent.ACTION_MOVE:
			point.x = event.getX();
			point.y = event.getY();
			points.add(point);
			break;
		}
		invalidate();
		return true;
	}


	class Point {
		float x, y;

		@Override
		public String toString() {
			return x + ", " + y;
		}
	}
}
