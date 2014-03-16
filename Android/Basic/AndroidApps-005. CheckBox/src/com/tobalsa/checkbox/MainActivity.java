package com.tobalsa.checkbox;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText ETvalor1, ETvalor2;
	private TextView TVresultado;
	private CheckBox CBsumar, CBrestar;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ETvalor1=(EditText)findViewById(R.id.ETvalor1);
        ETvalor2=(EditText)findViewById(R.id.ETvalor2);
        TVresultado=(TextView)findViewById(R.id.TVresultado);
        CBsumar=(CheckBox)findViewById(R.id.CBsumar);
        CBrestar=(CheckBox)findViewById(R.id.CBrestar);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void operar(View v) {
    	int INTnum1=Integer.parseInt(ETvalor1.getText().toString());
    	int INTnum2=Integer.parseInt(ETvalor2.getText().toString());
    	
    	if (CBsumar.isChecked()==true) {
			int sumar=INTnum1+INTnum2;
			String resultado=String.valueOf(sumar);
			TVresultado.setText(resultado);
		}else if (CBrestar.isChecked()==true) {
			int resultado_resta=INTnum1-INTnum2;
			String resultado=String.valueOf(resultado_resta);
			TVresultado.setText(resultado);
		}
	}
}
