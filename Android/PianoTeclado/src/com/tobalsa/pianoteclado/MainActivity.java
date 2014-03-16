package com.tobalsa.pianoteclado;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView img1, img2, img3, img4, img5;
	SoundPool soundpool;
	int sonido;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img1 = (ImageView) findViewById(R.id.imageView1);
		img2 = (ImageView) findViewById(R.id.imageView2);
		img3 = (ImageView) findViewById(R.id.imageView3);
		img4 = (ImageView) findViewById(R.id.imageView4);
		img5 = (ImageView) findViewById(R.id.imageView5);
		
		soundpool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
		sonido = soundpool.load(getApplicationContext(), R.raw.percussion, 0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void pulsarTecla(View v) {
		v.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction()==MotionEvent.ACTION_DOWN && v.getId()==R.id.imageView1) {
					img1.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano_pulsado));
					//MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.percussion);
					//mp.start();
					
					soundpool.play(sonido, 100, 100, 1, 0, 1);
				}
				if (event.getAction()==MotionEvent.ACTION_DOWN && v.getId()==R.id.imageView2) {
					img2.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano_pulsado));
					soundpool.play(sonido, 100, 100, 1, 0, 1);
				}
				if (event.getAction()==MotionEvent.ACTION_DOWN && v.getId()==R.id.imageView3) {
					img3.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano_pulsado));
					soundpool.play(sonido, 100, 100, 1, 0, 1);
				}
				if (event.getAction()==MotionEvent.ACTION_DOWN && v.getId()==R.id.imageView4) {
					img4.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano_pulsado));
					soundpool.play(sonido, 100, 100, 1, 0, 1);
				}
				if (event.getAction()==MotionEvent.ACTION_DOWN && v.getId()==R.id.imageView5) {
					img5.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano_pulsado));
					soundpool.play(sonido, 100, 100, 1, 0, 1);
				}
				if (event.getAction()==MotionEvent.ACTION_UP) {
					img1.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano));
					img2.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano));
					img3.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano));
					img4.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano));
					img5.setImageDrawable(getResources().getDrawable(R.drawable.tecla_piano));
				}
				
				
				return false;
			}
		});
		
	}
	
	public void dormirImagen() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
