package practicasHilos;

public class Ejer2Hilo2 extends Thread {
	
	public Ejer2Hilo2(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("Comienza "+getName());
		Ejer2Hilo3 Hilo3 = new Ejer2Hilo3("Hilo 3");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+". "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Hilo3.start();
		try {
			Hilo3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Termina "+getName());
	}
}
