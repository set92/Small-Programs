package sergio;
//Ejercicio 6
//Realizar un programa que cree un array llamado Origen ,recorrerlo y meter en un segundo array
//llamado Destino los elementos pares mayores de 25. 
//El array origen se cargará con 10,25,26,40,37,45,90,76,78,81,58,32.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_6 {

	public static void main(String[] args) {
		int ORIGEN[]= {10,25,26,40,37,45,90,76,78,81,58,32};
		int DESTINO[]={};
//		Se hace un clonado del array ORIGEN para DESTINO
		DESTINO=ORIGEN.clone();
		
//		Se crea un if que mire que sea par y mayor que 25, luego muestra los que cumplan esas condiciones
//		desde el segundo array con nombre DESTINO
		for (int i = 0; i < ORIGEN.length; i++) {
			if (ORIGEN[i]%2==0 && ORIGEN[i]>25) {
				DESTINO[i]=ORIGEN[i];
				System.out.println(DESTINO[i]);
			}
		}
		
	}

}
