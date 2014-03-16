package sergio;
/* Ejercicio niko2
 * Autor: Sergio Tobal
 * Fecha: 25-11-2011
 */
 
/* Recojer 5 valores desde la cmd y visualizar su media.*/


public class niko2 {
	
	public static void main (String args[]) {
		int n1,n2,n3,n4,n5;
		double media, resultado;
		n1= Integer.parseInt(args[0]);
		n2= Integer.parseInt(args[1]);
		n3= Integer.parseInt(args[2]);
		n4= Integer.parseInt(args[3]);
		n5= Integer.parseInt(args[4]);
		resultado=(n1+n2+n3+n4+n5);
		media=resultado/5;
		System.out.println("Resultado:"+n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"="+media);
	}
}

