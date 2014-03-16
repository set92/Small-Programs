package sergio.ejer565;

//Se llama asi porque la E quiere decir que es una extension de satelite y el 1 que la primera, por si acaso quiero hacer mas luego
//La extension quiere decir que coje todo el codigo que tenga satelite, por lo que es como si tuviera copiado todo su codigo aunque
//no se vea

public class E1Satelite extends satelite {
	public boolean enOrbita() {
		if (getDistancia_tierra()==0) {
			return false;
		}else {
			return true;
		}
	}
	
	//	Metodo que modifica los valores del paralelo y el meridiano respecto a unos valores que introduzcamos
	public void variaPosicion(double varia_paralelo, double varia_meridiano) {
		setParalelo(getParalelo()+varia_paralelo);
		setMeridiano(getMeridiano()+varia_meridiano);
	}
	
	public void variaAltura(double desplazamiento){
		if (desplazamiento>0) {
			System.out.println("El satelite se aleja de la Tierra");
		}else {
			System.out.println("El satelite se acerca a la Tierra");
		}
	}
	
	
}
