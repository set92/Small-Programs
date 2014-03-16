package sergio;

//Ejercicio inventado - Pag 87
//Realizar una clase ventana con atributos top bot height width, implementar sus dos metodos constructores, 1 que inicialice a 0,
//otro que lo inicialice a los valores recibidos. Implementar metodo clone() para dicha clase, crear un objeto v1 con valores 10 10 10 10,
//crear un objeto v2 que sea un clone de v1. 
//Visualizar finalmente los valores de sus atributos con un metodo visualizar_datos_ventana. 
//Autor: Sergio Tobal
//Fecha: 12-03-2012

public class Niko10 implements Cloneable {
	int top,bot,width,heigth;

	public Niko10() {
		this.top=0;
		this.bot=0;
		this.heigth=0;
		this.width=0;
	}
	
	public Niko10(int i, int j, int k, int l) {
		this.top=i;
		this.bot=j;
		this.heigth=k;
		this.width=l;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Niko10 C1=new Niko10();
		Niko10 C2=new Niko10(10,10,10,10);
		Niko10 C3= (Niko10) C2.clone();
		
		C1.visualizar_datos_ventana(C1,C2,C3);
	}

	private void visualizar_datos_ventana(Niko10 C1,Niko10 C2, Niko10 C3) {
		System.out.println("MOSTRANDO VALORES DE OBJETO C1:");
		System.out.println("Alto: "+C1.top+"   ||   "+"Bajo: "+C1.bot+"   ||   "+"Ancho: "+C1.width+"   ||   "+"Altura: "+C1.heigth);
		System.out.println("\nMOSTRANDO VALORES DE OBJETO C2:");
		System.out.println("Alto: "+C2.top+"   ||   "+"Bajo: "+C2.bot+"   ||   "+"Ancho: "+C2.width+"   ||   "+"Altura: "+C2.heigth);
		System.out.println("\nMOSTRANDO VALORES DE OBJETO C3:");
		System.out.println("Alto: "+C3.top+"   ||   "+"Bajo: "+C3.bot+"   ||   "+"Ancho: "+C3.width+"   ||   "+"Altura: "+C3.heigth);
	}

}
