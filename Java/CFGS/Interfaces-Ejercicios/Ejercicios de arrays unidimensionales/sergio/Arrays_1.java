package sergio;
//Ejercicio 1
//Realiza un rograma que declare una array llamado Dias_anuales con 365 elementos (tantos como días del año). 
//Inicializar dicho array a 0, y visualizar su contenido con el siguiente texto por cada elemento:
//“El elemento Dias_anuales[0] es 0”.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_1 {

	public static void main(String[] args) {
		int SLOTS=365;
		int Dias_anuales[]= new int[SLOTS];
		
//		Inicializacion de los slots a 0
		for (int i = 0; i < Dias_anuales.length; i++) {
			Dias_anuales[i]=0;
		}
		for (int i = 0; i < Dias_anuales.length; i++) {
			System.out.println("El elemento Dias_anuales["+i+"] es "+Dias_anuales[i]);
		}
		
		
	}

}
