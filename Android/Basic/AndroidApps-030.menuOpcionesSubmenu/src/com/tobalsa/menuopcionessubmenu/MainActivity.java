package com.tobalsa.menuopcionessubmenu;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
        case R.id.item2: i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
                         startActivity(i);
                         break;
        case R.id.item3: i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.yahoo.com"));
                         startActivity(i);
                         break;
        case R.id.item4: i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bing.com"));
                          startActivity(i);
                          break;
        case R.id.item5: finish();
        }
        return true;
    } 

}
