package com.tobalsa.usandothreads;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Intent;
import android.text.format.Time;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	static ProgressBar pbCargando;
	static public TextView tvAcceso, tvHora;
	static boolean entrar=true;
	static Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			pbCargando.incrementProgressBy(20);
	        if (pbCargando.getProgress()==pbCargando.getMax()) {
	        	if (entrar) {
	        		tvAcceso.setText("Concedido");
				}else if (entrar==false) {
					tvAcceso.setText("Acceso denegado");
				}
				
				
			}
		}
	};
    Thread hiloHora = new Thread(){
    	public void run() {
    		Time hora= new Time(Time.getCurrentTimezone());
    		hora.setToNow();
    		tvHora.setText(hora.format("%k: %M : %S"));
    		handler.postDelayed(this, 1000);
    	};
    };
    Thread comprobarAcceso = new Thread(new Runnable() {
		public void run() {
			
			while (entrar) {
		        if (tvAcceso.getText().toString().equals("Concedido")) {
		        	entrar=false;
		        	hiloHora.interrupt();
		        	Intent intent = new Intent(MainActivity.this, Calcular.class);
		        	startActivity(intent);
				}
			}
		}
	});
	boolean isRunning;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pbCargando=(ProgressBar) findViewById(R.id.pbCargando);
        tvAcceso=(TextView) findViewById(R.id.tvAcceso);
        tvHora=(TextView) findViewById(R.id.tvHora);

        hiloHora.start();
        comprobarAcceso.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	pbCargando.setProgress(0);
    	
    	Thread hilo1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					for (int i = 0; i < pbCargando.getMax(); i++) {
						Thread.sleep(2000);
						handler.sendMessage(handler.obtainMessage());
					}
				} catch (Exception e) {
					
				}finally{
					finish();
				}
			}
		});
		isRunning=true;
		hilo1.start();
    }
    @Override
    protected void onPause() {
    	super.onPause();
    	entrar=true;
    }
}
