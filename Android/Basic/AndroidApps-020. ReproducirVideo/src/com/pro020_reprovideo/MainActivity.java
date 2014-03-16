package com.pro020_reprovideo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends Activity {
	
	private VideoView vvVideo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        vvVideo=(VideoView)findViewById(R.id.vv1);
        
        vvVideo.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.pingpong);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void reproducir(View v){
        vvVideo.start();
    }
}
