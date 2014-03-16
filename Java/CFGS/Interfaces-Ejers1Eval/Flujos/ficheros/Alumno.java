package ficheros;

public class Alumno {
	private int numMatricula;
	private String nombre;
	private double nota1, nota2;
	
	public Alumno(int nMat, String n){
		numMatricula=nMat;
		nombre=n;
	}
	
	public void ponNota(int num1, int num2){
		nota1=num1;
		nota2=num2;
	}
	
	public double dameNota(){
		return((nota1+nota2)/2);
	}
	
	public String muestraAlumno(){
		return("Numero de matricula: "+numMatricula+
				"\n Nombre: "+ nombre +
				"\n Nota 1: "+ nota1 +
				"\n Nota 2: "+ nota2 +
				"\n Media: "+ dameNota());
	}
}
