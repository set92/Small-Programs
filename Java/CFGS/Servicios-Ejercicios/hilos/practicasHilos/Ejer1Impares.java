package practicasHilos;

public class Ejer1Impares extends Thread{
	
	@Override
	public void run() {
		int suma=0;
		super.run();
		for (int i = 0; i < 1000; i++) {
			if (i%2!=0) {
				suma+=i;
			}
		}
		System.out.println("Suma impares: "+suma);
	}

}
