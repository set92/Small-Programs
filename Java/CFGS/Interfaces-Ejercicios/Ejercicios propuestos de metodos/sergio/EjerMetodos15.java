package sergio;
//Ejercicio Metodos 15
//Realiza un metodo llamado EsPerfecto que recibira un numero y devolvera a la funcion que la llamo un true
//si es verdadero y sino un 0. Usando dicho metodo Main visualizara los numeros perfectos entre 1 y 10.000
//Un numero es perfecto cuando la suma de sus multiplos es el propio numero
//Autor: Sergio Tobal
//Fecha: 13-02-2012
public class EjerMetodos15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numsend=1,cont=1;
		boolean numreceive = false;
		
		while (numsend!=1000000) {
			numreceive=EsPerfecto(numsend);
			
			if (numreceive==true) {
				System.out.println(cont);
			}else if (numreceive==false) {
			
			}
			numsend++;
			cont++;
		}
		

	}

	private static boolean EsPerfecto(int numsend) {
		int perfect=0;
		for (int i = 1; i < numsend; i++) {
            if (numsend % i == 0) {
                    perfect += i;
            }
		}
		
		if (perfect == numsend) {
            return true;
		}else {
            return false;
		}
	}

}
