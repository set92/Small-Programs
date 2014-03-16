package com.tobalsa.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private String strPaises[]={"Pais 1", "Pais 2", "Pais 3", "Pais 4", "Pais 5"};
	private String strHabitantes[]={"10.000", "20.000", "1.000", "2.000", "4.000"};
	private TextView TVresultado;
	private ListView LVopciones;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        TVresultado=(TextView) findViewById(R.id.TVresultado);
        LVopciones=(ListView) findViewById(R.id.LVopciones);
        
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strPaises);
        LVopciones.setAdapter(adapter);
        LVopciones.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int posicion,long id) {
				TVresultado.setText("Poblacion de "+LVopciones.getItemAtPosition(posicion)+" es "+strHabitantes[posicion]);
			}
        	
		});
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
