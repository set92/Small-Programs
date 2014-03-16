package examen;

public class Fecha {
	int dia=15, mes=11, anio=2012;
	
	public Fecha() {
		dia=0;
		mes=0;
		anio=0;
	}
	
	public Fecha(int dia,int mes,int anio){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return (dia+"/"+mes+"/"+anio);
	}
	
}
