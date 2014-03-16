package sergio;
//Ejercicio 1 Strings
//Crear una clase pública de nombre EjercicioString1 que contenga sólo al método main y partiendo de la String 
//"En mi proxima vida, creere en la reencarnacion" declarada e inicializada como variable primitiva, mostrar por consola lo siguiente:
//1.	Su longitud 
//2.	El carácter asociado al índice 7 
//3.	La subcadena "creere" 
//4.	El índice que ocupa el carácter 'x' 
//5.	La String transformada en mayúsculas 
//6.	Por último, comprobar si el primer carácter de la String es 'E' y mostrar por consola un mensaje que lo indique. 
//Autor: Sergio Tobal
//Fecha: 21-05-2012
public class EjercicioString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto="En mi proxima vida, creere en la reencarnacion";
		
//		Mostramos longitud del texto
		System.out.println("La longitud del texto es: "+texto.length());

//		Recorremos el string y cuando la posicion sea 7 miramos el caracter asociado
		for (int i = 0; i < texto.length(); i++) {
			if (i==7) {
				System.out.println("Caracter de la posicion "+i+" igual a "+texto.substring(i,i+1));
			}
		}
		
//		Comrpobamos si la cadena creere esta en el texto, si esta se lo diremos al usuario
		if (texto.indexOf("creere")>-1) {
			System.out.println("La cadena creere esta en el texto");
		}else {
			System.out.println("La cadena creere NO esta en el texto");
		}
		
//		Buscamos la posicion del caracter 'x'
		for (int i = 0; i < texto.length(); i++) {
			if (texto.indexOf("x")>-1) {
				System.out.println("La posicion es: "+i);
			}
		}
		
//		Comprobar si el primer caracter es M
		if (texto.startsWith("M")) {
			System.out.println("Empieza por M");
		}else {
			System.out.println("No empieza por M");
		}
		
		
		
		
		
	}

}
