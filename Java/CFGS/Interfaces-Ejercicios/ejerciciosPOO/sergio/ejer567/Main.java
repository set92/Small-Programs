package sergio.ejer567;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main objeto1=new Main();
		
		objeto1.millasAMetros(1);
		objeto1.millasAKilometros(1);
		
	}
	private void millasAMetros(double millas){
		double resultado=millas*1852;
		System.out.println((int)millas+" milla marina son "+resultado+" metros");
	}
	
	private void millasAKilometros(double millas){
		double resultado=(millas*1852)/1000;
		System.out.println((int)millas+" milla marina son "+resultado+" kilometros");
	}

}
