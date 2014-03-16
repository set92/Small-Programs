package practicasHilos;

public class Ejer1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ejer1Pares HiloPares = new Ejer1Pares();
		Ejer1Impares HiloImpares = new Ejer1Impares();
		Ejer1Termina2o3 HiloTerminar2o3 = new Ejer1Termina2o3();
		
		HiloPares.start();
		try {
			HiloPares.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		HiloImpares.start();
		try {
			HiloImpares.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		HiloTerminar2o3.start();
		try {
			HiloTerminar2o3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
