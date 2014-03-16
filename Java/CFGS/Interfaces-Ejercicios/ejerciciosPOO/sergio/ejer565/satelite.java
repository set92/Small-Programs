package sergio.ejer565;

public class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	public double getMeridiano() {
		return meridiano;
	}

	public double getParalelo() {
		return paralelo;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setMeridiano(double meridiano) {
		this.meridiano = meridiano;
	}

	public void setParalelo(double paralelo) {
		this.paralelo = paralelo;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	//	Constructor de la clase satelite. Los constructores se inician automaticamente con la creacion del objeto
	satelite() {
		meridiano=10;
		paralelo=10;
		distancia_tierra=10;
	}

	//	Constructor de la clase satelite si recibe parametros desde la llamada al objeto
	public satelite(double meridiano, double paralelo, double distancia) {
		this.meridiano=meridiano;
		this.paralelo=paralelo;
		this.distancia_tierra=distancia;
	}

	//	Metodo para definir los valores en cualquier momento de la ejecucion
	public void setPosicion(double m, double p, double d) {
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}

	public void PrintPosicion(){
		System.out.println("El satelite se encuentra en el paralelo " +paralelo+" Meridiano "+meridiano+" a una distancia de la tierra de "+distancia_tierra+" kilometros");
	}

}
