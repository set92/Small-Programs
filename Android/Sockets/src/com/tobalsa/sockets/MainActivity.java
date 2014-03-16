package com.tobalsa.sockets;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	final static int PAQUETE_RECIBIDO = 1;
	final static int TOAST  = 2;
	EditText etMensaje;
	Button btnMandar;
	ListView lstMensajes;
	HiloServer hilo;
	ArrayAdapter<String> mensajesRecibidos;
	
	private final Handler miHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
        	switch (msg.what) {
	            case PAQUETE_RECIBIDO:
	                String mensajeEntrante = (String) msg.obj;
	                mensajesRecibidos.add("Tu: "+mensajeEntrante);
	                break;
	            case TOAST:
	            	String toastToMake= (String) msg.obj;
	            	Toast.makeText(getApplicationContext(), toastToMake, Toast.LENGTH_SHORT).show();
	                break;               
            }
        }
    };  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnMandar= (Button)findViewById(R.id.btnMandar);
		etMensaje= (EditText)findViewById(R.id.etMensaje);
        lstMensajes= (ListView)findViewById(R.id.lstChat);
        
        mensajesRecibidos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lstMensajes.setAdapter(mensajesRecibidos);
        
        btnMandar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mandarMensaje();
			}
		});
        
        hilo = new HiloServer(getApplicationContext(),miHandler);
        hilo.start();
	}
	
    // Manda el mensaje que haya en el EditText
    private void mandarMensaje(){
    	String nuevoMensaje = etMensaje.getText().toString();
    	try{
    		hilo.mandarMensaje(nuevoMensaje);
    	}catch(Exception e){
    		Log.e("ERROR","No se puede mandar el mensaje: "+e.getMessage());
    	}
    	mensajesRecibidos.add("Yo: "+nuevoMensaje);
    	etMensaje.setText("");
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	

	@Override
	protected void onStop() {
		super.onStop();
		hilo.cerrarSocket();
	}
}
