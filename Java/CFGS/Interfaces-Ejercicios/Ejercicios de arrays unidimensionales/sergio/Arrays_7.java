package sergio;
//Ejercicio 7
//Realizar un programa que declare un array llamado Edades de 20 elementos. 
//Cargar dicho array con edades al azar comprendidas entre 1 y 99 (Ver random y randomize). 
//Calcular:  la edad media de la serie, la edad máxima y la edad mínima. 
//Visualizar el array completo y las posiciones donde están los máximos y mínimos.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_7 {

	public static void main(String[] args) {
		int SLOTS=20, acum=0, media=0, n_max=0, n_min=100;
		int EDADES[]=new int[SLOTS];
		
//		Se generan numeros aleatorios y se van guardando en cada SLOT, tambien se va sumando en una
//		variable todos los numeros para hacer luego la media
		for (int i = 0; i < EDADES.length; i++) {
			EDADES[i]=genera_aleatorio();
			acum=acum+EDADES[i];
			if (EDADES[i]<n_min) {
				n_min=EDADES[i];
			}
			if (EDADES[i]>n_max) {
				n_max=EDADES[i];
			}
		}
		media=acum/SLOTS;
		
//		Visualizamos el array completo, la media 
		for (int i = 0; i < EDADES.length; i++) {
			System.out.println("El numero de la posicion "+i+" es el "+EDADES[i]);
		}
		System.out.println("\nEl maximo numero es "+n_max);
		System.out.println("El minimo numero es "+n_min);
		System.out.println("La media de todos los numeros es "+media);
	}
	
	public static int genera_aleatorio(){
		return (int) (Math.random()*99+1);
	}
}
