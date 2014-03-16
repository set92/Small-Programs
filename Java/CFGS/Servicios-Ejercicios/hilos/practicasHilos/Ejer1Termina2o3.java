package practicasHilos;

public class Ejer1Termina2o3 extends Thread{
	
	@Override
	public void run() {
		int suma=0, ultimoNumero=0;
		super.run();
		for (int i = 0; i < 1000; i++) {
			ultimoNumero=i%10;
			if (ultimoNumero==2 || ultimoNumero==3) {
				suma=suma+i;
			}
		}
	System.out.println("Numeros terminados en 2 o 3: "+suma);
	}
}
