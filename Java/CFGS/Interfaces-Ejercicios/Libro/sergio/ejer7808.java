package sergio;
//Ejercicio 1 - Pag 77
//Realiza una clase con un metodo decimalToRomano que transforme numeros en formato decimal a numeros en formato romano.
//Autor: Sergio Tobal
//Fecha: 17-01-2012
public class ejer7808 {

	public static void main(String[] args) {
		int numero=90;
		String respuesta="0";
		
		while (numero!=0) {
	        switch(numero){
	            case 1000: respuesta+= "M";
	                break;
	            case 900: respuesta+= "CM";
	                break;
	            case 500: respuesta+= "D";
	                break;
	            case 400: respuesta+= "CD";
	                break;
	            case 100: respuesta+= "C";
	                break;
	            case 90: respuesta+= "LC";
	                break;
	            case 50: respuesta+= "L";
	                break;
	            case 40: respuesta+= "XL";
	                break;
	            case 10: respuesta+= "X";
	                break;
	            case 9: respuesta+= "IX";
	                break;
	            case 5: respuesta+= "V";
	                break;
	            case 4: respuesta+= "IV";
	                break;
	            case 1: respuesta+= "I";
	        }
		}
		System.out.println(respuesta);
	}

}
