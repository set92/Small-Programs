package practicasHilos;

public class Ejer2Hilo4 extends Thread {
	
	public Ejer2Hilo4(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		super.run();
		
		System.out.println("Comienza "+getName());
		Ejer2Hilo5 Hilo5 = new Ejer2Hilo5("Hilo 5");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+". "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Hilo5.start();
		try {
			Hilo5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Termina "+getName());
	}
}
