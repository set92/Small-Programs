package sergio;
/* Ejercicio 1 - Pag 54
 * Realiza una clase finanzas que convierta dolares a euros y viceversa.Codifica los metodos dolaresToEuros y eurosToDolares
 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dolares. La clase tiene que tener:
 * Un constructor finanzas() por defecto el cual establecera el cambio Dolar-Euro en 1.36.
 * Un constructor finanzas(double), el cual permitira configurar el cambio dolar-euro.
 * Autor: Sergio Tobal
 * Fecha: 01-01-2012
 */


public class ejer541 {
	private double cambio;
	
	ejer541(){
		cambio=1.36;
	}
	ejer541(double valor){
		cambio=valor;
	}
	public double dolarestoeuros(double dolares){
		return (dolares*cambio);
	}
	public static void main(String[] args){
		ejer541 F1=new ejer541();
		ejer541 F2=new ejer541(1.55);
		System.out.println("100 dolares son "+F1.dolarestoeuros(100)+" euros");
		System.out.println("100 dolares son "+F2.dolarestoeuros(100)+" euros");
	}
	
	
	
//	public static void main(String[] args)throws IOException {
//		BufferedReader lectura=new BufferedReader (new InputStreamReader (System.in));
//		int moneda=0;
//		
//		System.out.println("Selecciona cual es la moneda origen: ");
//		System.out.println("1. Euro");
//		System.out.println("2. Dolares");
//		moneda=Integer.parseInt(lectura.readLine());
//		
//		finanzas(moneda,lectura);
//	}
//	
//	private static void finanzas(int moneda, BufferedReader lectura)throws IOException{
//		double origen=0, devolucion=0, tasacambio=1.36;
//		
//		if (moneda==1) {
//			System.out.println("Euros que tienes: ");
//			origen=Double.parseDouble(lectura.readLine());
//			devolucion=origen/tasacambio;
//			System.out.println("Son "+devolucion+" dolares");
//		} else if (moneda==2) {
//			System.out.println("Dolares que tienes: ");
//			origen=Double.parseDouble(lectura.readLine());
//			devolucion=origen*tasacambio;
//			System.out.println("Son "+devolucion+" euros");
//		}
//	}
}
