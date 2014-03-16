package sergio;

public class vehiculo {
	private String modelo;
	private double potencia;
	private boolean tracion4;
	
	public vehiculo() {
		this.modelo="Honda";
		this.potencia=220;
		this.tracion4=true;
	}
	
	public vehiculo(String modelo) {
		this.modelo=modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public boolean isTracion4() {
		return tracion4;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public void setTracion4(boolean tracion4) {
		this.tracion4 = tracion4;
	}
	
	public void muestravehiculo() {
		System.out.println("\nEl modelo del coche es: "+modelo);
		System.out.println("La potencia del coche es: "+potencia);
		if (tracion4==true) {
			System.out.println("El coche tiene tracion a las 4 ruedas.");
		}else if (tracion4==false) {
			System.out.println("El coche no tiene tracion a las 4 ruedas.");
		}
	}



}
