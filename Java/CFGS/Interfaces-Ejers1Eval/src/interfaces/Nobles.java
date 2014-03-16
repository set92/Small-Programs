package interfaces;

public class Nobles implements Rey {

	@Override
	public void nombre() {
		System.out.println("Nombre del Noble: ");
	}

	@Override
	public void edad() {
		
	}
	
	public void tituloNobiliario(){
		System.out.println("Su titulo es: ");
	}



}
