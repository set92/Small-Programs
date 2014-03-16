package com.tobalsa.imagebutton;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ImageButton IBlogo_set92;
	private TextView TVtexto;
	MediaPlayer sonido;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TVtexto=(TextView) findViewById(R.id.TVtexto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void IBlogo_set92_boton(View v) {
    	sonido=MediaPlayer.create(this, R.raw.sonido);
    	sonido.start();
	}
    
}
