package practicasHilos;

public class Ejer1Pares extends Thread{

	
	@Override
	public void run() {
		int num=0;
		super.run();
		for (int i = 1; i < 1000; i++) {
			if (i%2==0) {
				num=num+i;
			}
		}
		System.out.println("Suma pares: "+num);
	}
}
