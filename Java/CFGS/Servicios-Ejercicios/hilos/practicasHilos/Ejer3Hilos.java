package practicasHilos;

public class Ejer3Hilos extends Thread {
	
	public Ejer3Hilos() {
		super();
	}
	public Ejer3Hilos(String string) {
		super(string);
	}
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

}
