package sergio;

public class pajaro_m {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pajaro objpajaro1 = new pajaro();
		pajaro objpajaro2 = new pajaro();
		pajaro objpajaro3 = new pajaro('a',14);
		
		objpajaro1.setcolor('v');
		objpajaro1.setedad(15);
		objpajaro2.setcolor('a');
		objpajaro2.setedad(8);
		
		
		System.out.println("El color del Pajaro 1 es: "+objpajaro1.printcolor()+" y su edad es: "+objpajaro1.getEdad());
		System.out.println("El color del Pajaro 2 es: "+objpajaro2.printcolor()+" y su edad es: "+objpajaro2.getEdad());
		System.out.println("El color del Pajaro 3 es: "+objpajaro3.printcolor()+" y su edad es: "+objpajaro3.getEdad());
		System.out.println("El numero de pajaros es: "+pajaro.getNumpajaro());
	}

}
