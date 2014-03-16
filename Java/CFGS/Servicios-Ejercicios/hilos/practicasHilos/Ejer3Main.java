package practicasHilos;

public class Ejer3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ejer3Hilos hilos = null;
		for (int i = 1; i <= 20; i++) {
			hilos=new Ejer3Hilos("hilo "+i);
			System.out.println(hilos.getName());
		}
		
		
		
		
	}

}
