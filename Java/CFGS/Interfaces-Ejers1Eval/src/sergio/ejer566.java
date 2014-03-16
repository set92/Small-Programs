package sergio;

public class ejer566 {
	private double peso;
	
	public ejer566() {
		this.setPeso(0);
	}
	ejer566(double pes, String medida){
		switch (medida) {
		case "K" : peso=pes; break;
		case "Lb" : peso=pes*453/1000; break;
		case "Li" : peso=pes*14.59; break;
		case "Oz" : peso=pes*28.35/1000; break;
		case "P" : peso=pes*1.55/1000; break;
		case "G" : peso=pes/1000; break;
		case "Q" : peso=pes*43.3; break;
		default:System.out.println("Unidades incorrectas");	break;
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getLibras(double pesokg) {
		return (pesokg*32.17)/14.59;
	}
	public double getLingotes(double pesokg) {
		return (pesokg)/14.59;
	}
	public double getPeso(double pes,String medida){
		switch (medida) {
		case "K" : peso=pes; break;
		case "Lb" : peso=pes/453*1000; break;
		case "Li" : peso=pes/14.59; break;
		case "Oz" : peso=pes/28.35*1000; break;
		case "P" : peso=pes/1.55*1000; break;
		case "G" : peso=pes*1000; break;
		case "Q" : peso=pes/43.3; break;
		default:System.out.println("Unidades incorrectas");	break;
		}
		return peso;
	}
	

}
