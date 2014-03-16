package practicasHilos;

public class Ejer2Hilo1 extends Thread {
	
	public Ejer2Hilo1(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("Comienza "+getName());
		Ejer2Hilo2 Hilo2 = new Ejer2Hilo2("Hilo 2");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+". "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Hilo2.start();
		try {
			Hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Termina "+getName());
	}
}
