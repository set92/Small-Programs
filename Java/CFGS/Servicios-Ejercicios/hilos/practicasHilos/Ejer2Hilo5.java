package practicasHilos;

public class Ejer2Hilo5 extends Thread {
	
	public Ejer2Hilo5(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		super.run();
		
		System.out.println("Comienza "+getName());

		for (int i = 0; i < 10; i++) {
			System.out.println(i+". "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Termina "+getName());
	}
}
