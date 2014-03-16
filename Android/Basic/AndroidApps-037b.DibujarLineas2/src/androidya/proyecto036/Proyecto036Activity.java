package androidya.proyecto036;


import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Proyecto036Activity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linearLayout1);
        Lienzo fondo=new Lienzo(this);        
        linearLayout.addView(fondo);        
    }
        

}