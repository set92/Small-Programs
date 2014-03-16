package sergio.ejer566;

public class Peso {
	private double peso_kg;
	private String tipo_medida;

	public double getPeso_kg() {
		return peso_kg;
	}
	public String getTipo_medida() {
		return tipo_medida;
	}
	public void setPeso_kg(double peso_kg) {
		this.peso_kg = peso_kg;
	}
	public void setTipo_medida(String tipo_medida) {
		if (tipo_medida.equals("Kg")==true || tipo_medida.equals("Lb")==true || tipo_medida.equals("Li")==true || tipo_medida.equals("Oz")==true
				|| tipo_medida.equals("P")==true || tipo_medida.equals("Gr")==true || tipo_medida.equals("Q")==true) {
			this.tipo_medida = tipo_medida;
		}else {
			System.out.println("Tipo de la medida incorrecto. Solo existen los tipos Kg, Lb, Li, Oz, P, Gr y Q");

		}
	}

	//	Constructor de la clase Peso
	Peso(double peso_kg, String tipo_medida){
		this.peso_kg=peso_kg;
		this.tipo_medida=tipo_medida;
	}

	public double getLibras(double peso) {
		double peso_libra = 0;
		double valor_libra_kg=32.17/14.59;
		
		if (tipo_medida.equals("Kg")==true) {
			return(peso*valor_libra_kg);
		}


		return peso_libra;
	}
	
	public double getLingotes(double peso) {
		double peso_lingote = 0;
		double valor_lingote_kg=1/32.17/14.59;

		if (tipo_medida.equals("Kg")==true) {
			return(peso*valor_lingote_kg);
		}


		return peso_lingote;
	}
	public double getPeso(double peso, String tipo, String tipo_destino) {
		if (tipo.equals(tipo_destino)) {
			return peso;
		}else if (tipo.equals("Kg") && tipo_destino.equals("Lb")) {
			return peso*(32.17/14.59);
		}
		return 0;
		
		
	}
	


}
