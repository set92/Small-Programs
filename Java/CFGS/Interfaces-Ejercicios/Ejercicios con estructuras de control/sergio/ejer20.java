package sergio;
/* Ejercicio 20 - Estructuras condiciones: simple, doble y multiple
 * Un vehiculo que circula a 60Km/h se ve obligado a parar bruscamente ante un paso de 
 * peatones. Si la deceleracion es de -58.82m/s2 y el peaton se encuentra a 5m decir si lo
 * atropella. vf=vi+a*t ; sf=s0+vi*t+1/2*a*t*t // solucion: tiempo de frenada: 0.28s y 
 * distancia 2,36m.
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */


// Importamos 
import java.text.DecimalFormat;
public class ejer20 {
	
	public static void main (String args[]) {
		double vi=16.66, s0=0, a=-58.8, vf=0, sf=0, t=0;
		
		
	//~ vf=vi+a*t;
		t=(vf-vi)/a;
		sf=s0+(vi*t)+(0.5*a*t*t);
	//~ double t1 = Math.round(t*100.0)/100.0;
		//Creamos una nueva variable donde mediante la funcion math.round redondeamos los
		//decimales para que solo tenga 2 unidades.
		double sf1 = Math.round(sf*100.0)/100.0;
		
		//Usando la clase DecimalFormat para definir cuantos enteros y decimales puede tener
		DecimalFormat tiempo = new DecimalFormat("#####.##");
		
		System.out.print(System.getProperty("line.separator"));
		//Muestra clase DecimalFormat llamada tiempo con el valor t
		System.out.println("El tiempo de frenado es: "+tiempo.format(t));
		System.out.println("La distancia de frenado es: "+sf1);
		System.out.print(System.getProperty("line.separator"));
		System.out.println("El peaton no muere por " +(5-sf1)+"m");
		
				
	}
}

