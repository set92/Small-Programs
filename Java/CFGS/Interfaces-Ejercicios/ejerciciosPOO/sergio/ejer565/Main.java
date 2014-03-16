package sergio.ejer565;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		E1Satelite prueba=new E1Satelite();
		
//		Pasamos valores al objeto prueba mediante uno de sus metodos
		prueba.setPosicion(5, 20, 40);
//		Modificacion del valor Meridiano a 10 mediante setters
		prueba.setMeridiano(10);
		
		if (prueba.enOrbita()==false) {
			System.out.println("El satelite esta en la Tierra");
		}else {
			System.out.println("El satelite esta en el espacio");
		}
		
		prueba.PrintPosicion();
		
//		Variamos la posicion del paralelo y del meridiano con valores relativos
		prueba.variaPosicion(10, 20);
		prueba.PrintPosicion();
	}

}
