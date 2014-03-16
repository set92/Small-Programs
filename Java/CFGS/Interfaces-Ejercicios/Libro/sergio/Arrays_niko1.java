package sergio;
//Ejercicio Arrays ejercicio 1
//crear un array llamado tiradas_dado para almacenar 100 lanzamientos de dado. Cargarlo con 100 tiradas aleatorias.
//Contabilizar cuantas veces aparece cada numero del 1 al 6. Comprobar que la suma de las tiradas sean 100 
//Autor: Sergio Tobal
//Fecha: 17-04-2012
public class Arrays_niko1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0;
		int tiradas_dado[]=new int[100];
		int contadores[]=new int[6];
		
		for (int i = 0; i < tiradas_dado.length; i++) {
			tiradas_dado[i]=genera_aleatorio();
			if (tiradas_dado[i]==1) {
				cont1++;
			}else if (tiradas_dado[i]==2) {
				cont2++;
			}else if (tiradas_dado[i]==3) {
				cont3++;
			}else if (tiradas_dado[i]==4) {
				cont4++;
			}else if (tiradas_dado[i]==5) {
				cont5++;
			}else if (tiradas_dado[i]==6) {
				cont6++;
			}
		}
		System.out.println("Contador de 1: "+cont1+
				"\nContador de 2: "+cont2+
				"\nContador de 3: "+cont3+
				"\nContador de 4: "+cont4+
				"\nContador de 5: "+cont5+
				"\nContador de 6: "+cont6);
		System.out.println("La suma de las tiradas son: "+(cont1+cont2+cont3+cont4+cont5+cont6));
	}
	
	public static int genera_aleatorio(){
		return (int) (Math.random()*6+1);
	}
	
}
