package sergio;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Cboton
//Crear una clase Cboton con los atributos bot, left, width, heigth, desarrollar su constructor para que se inicialicen a 0 o para que se inicialicen con los valores proporcionados,
//Desarrollar el metodo EsCuadrado, diremos que lo es cuando su width y heigth sean iguales.
//Desarrollar un metodo Fuera_Pantalla para determinar que el  boton este fuera del area visible de la pantalla.
//Consideramos el tamaño de la pantalla 1024x768.Este metodo tiene que recibir el valor de la pantalla.
//Autor: Sergio Tobal
//Fecha: 27-02-2012
public class Cboton {
	
	private int bot,left,width,heigth;
	
	Cboton(){
		bot=0;
		left=0;
		width=0;
		heigth=0;
	}
	
	public Cboton(int BOT, int LEFT, int WIDTH, int HEIGTH) throws Exception, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
//		Le quito de preguntar al usuario que bot y left porque eso los programas nunca lo preguntan y seria una tonteria preguntarlo
		bot=0;
		left=0;
		
		System.out.println("Anchura: ");
		width=Integer.parseInt(lectura.readLine());
		System.out.println("Altura: ");
		heigth=Integer.parseInt(lectura.readLine());
	}
	
	private boolean esCuadrado() {		
		if (width==heigth) {
			return true;
		}
		return false;
	}
	
	private boolean Fuera_Pantalla(int LEFT, int BOT) {
//		Se instancia el framework AWT con la clase general Toolkit, despues a traves de getScreenSize cojeremos la medida que 
//		almacenaremos en una clase Dimension llamada screensize
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		System.out.println(" - Tu resolucion es "+screensize.width+"x"+screensize.height);
		if (BOT<0 || LEFT<0) {//FALTA AÑADIR TOP Y RIGTH PERO QUE NO LOS HA ESPECIFICADO EL PROFESOR
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) throws IOException, Exception {
		int BOT=1,LEFT=0,WIDTH=0,HEIGTH=0;
		boolean es_cuadrado, fuera_pantalla;
		
		Cboton f1=new Cboton();
		Cboton f2=new Cboton(BOT,LEFT,WIDTH,HEIGTH);
		System.out.println("Margen inferior: "+f2.bot
				+"\nMargen izquierdo: "+f2.left
				+"\nAltura: "+f2.heigth+"px"
				+"\nTamaño: "+f2.width+"px");
		
		es_cuadrado=f2.esCuadrado();
		fuera_pantalla=f2.Fuera_Pantalla(LEFT, BOT);
		if (fuera_pantalla==true) {
			System.out.println(" - Tu cuadrado esta dentro de los margenes permitidos");
			
			if (es_cuadrado==true) {
				System.out.println(" - La figura es cuadradada");
				
			}else if (es_cuadrado==false) {
				System.out.println(" - La figura no es cuadrada");
			}
			
		}else if (fuera_pantalla==false) {
			System.out.println("ERROR. Tu cuadrado NO esta dentro de la pantalla");
		} 
		
		
	}

}
