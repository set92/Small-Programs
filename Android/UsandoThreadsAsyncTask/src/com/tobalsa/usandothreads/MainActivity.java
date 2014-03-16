package com.tobalsa.usandothreads;

import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	static ProgressBar pbCargando;
	static public TextView tvAcceso, tvHora;
	static boolean entrar=true, isRunning=true;
	Time hora= new Time(Time.getCurrentTimezone());
//    Thread comprobarAcceso = new Thread(new Runnable() {
//		public void run() {
//			
//			while (entrar) {
//		        if (tvAcceso.getText().toString().equals("Concedido")) {
//		        	entrar=false;
//		        	Intent intent = new Intent(MainActivity.this, Calcular.class);
//		        	startActivity(intent);
//				}
//			}
//		}
//	});
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pbCargando=(ProgressBar) findViewById(R.id.pbCargando);
        tvAcceso=(TextView) findViewById(R.id.tvAcceso);
        tvHora=(TextView) findViewById(R.id.tvHora);
        
        new AsyncTaskHora().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new AsyncTaskPbCargar().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new AsyncTaskCheckAccess().execute();
        //new AsyncTaskHora().execute();
        //new AsyncTaskPbCargar().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public class AsyncTaskHora extends AsyncTask<Void, Void, Void> {
//		Metodo con el codigo que ejecutara el hilo aparte del hilo UI
		@Override
		protected Void doInBackground(Void... params) {
    		while (isRunning) {
    			hora.setToNow();
        		publishProgress();
        		if (pbCargando.getProgress()==100) {
					isRunning=false;
				}
			}
    		
			return null;//Al llegar aqui llamaremos al metodo onPostExecute y terminara el AsyncTask
		}
//		Si necesitamos modificar la UI llamaremos a este metodo mediante publishProgress()
		@Override
		protected void onProgressUpdate(Void... values) {
			tvHora.setText(hora.format("%k: %M : %S"));
		}

	}
    public class AsyncTaskPbCargar extends AsyncTask<Void, Void, Void> {

//    	Metodo anterior a la ejecucion del hilo, se muestra un dialogo de lo que se va a hacer
//    	se prepara la tarea, se inicializan las cosas que vayamos a usar mas adelante...
		@Override
		protected void onPreExecute() {
			pbCargando.setProgress(0);
		}
//		Metodo con el codigo que ejecutara el hilo aparte del hilo UI
		@Override
		protected Void doInBackground(Void... params) {
    		while (isRunning) {
    			if (pbCargando.getProgress()<pbCargando.getMax()) {
    				try {
						Thread.sleep(1000);//Hacemos como que esta revisando el nivel de acceso
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
    				publishProgress();
				}
    			
        		if (pbCargando.getProgress()==100) {
					isRunning=false;
				}
			}
    		
			return null;//Al llegar aqui llamaremos al metodo onPostExecute y terminara el AsyncTask
		}
//		Si necesitamos modificar la UI llamaremos a este metodo mediante publishProgress()
		@Override
		protected void onProgressUpdate(Void... values) {
			pbCargando.setProgress(pbCargando.getProgress()+10);
		}
//		Ultimo metodo en ejecutarse y devolvera el control al hilo UI
		@Override
		protected void onPostExecute(Void result) {
			tvAcceso.setText("Acceso concedido");
		}
	}
    public class AsyncTaskCheckAccess extends AsyncTask<Void, Void, Void> {

//    	Metodo anterior a la ejecucion del hilo, se muestra un dialogo de lo que se va a hacer
//    	se prepara la tarea, se inicializan las cosas que vayamos a usar mas adelante...
		@Override
		protected void onPreExecute() {
			pbCargando.setProgress(0);
		}
//		Metodo con el codigo que ejecutara el hilo aparte del hilo UI
		@Override
		protected Void doInBackground(Void... params) {
    		while (isRunning) {

			}
    		
			return null;//Al llegar aqui llamaremos al metodo onPostExecute y terminara el AsyncTask
		}
//		Si necesitamos modificar la UI llamaremos a este metodo mediante publishProgress()
		@Override
		protected void onProgressUpdate(Void... values) {
			pbCargando.setProgress(pbCargando.getProgress()+10);
		}
//		Ultimo metodo en ejecutarse y devolvera el control al hilo UI
		@Override
		protected void onPostExecute(Void result) {
			Intent intent = new Intent(MainActivity.this, Calcular.class);
        	startActivity(intent);
		}
	}
    
}


