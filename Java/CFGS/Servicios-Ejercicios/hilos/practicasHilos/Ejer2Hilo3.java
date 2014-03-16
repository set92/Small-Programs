package practicasHilos;

public class Ejer2Hilo3 extends Thread {
	
	public Ejer2Hilo3(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		super.run();
		
		System.out.println("Comienza "+getName());
		Ejer2Hilo4 Hilo4 = new Ejer2Hilo4("Hilo 4");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+". "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Hilo4.start();
		try {
			Hilo4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Termina "+getName());
	}
}
