package figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1. Defina un array de 100 figuras.
//2. Cargar el array creando los objetos que el usuario decida(1 para rectangulo, 2 para circulo, ... 0 para terminar)
//3. Establecer los valores de cada figura del array atendiendo al tipo de figura que es y pidiendo los datos correspondientes al usuario.
//4. Crear un metodo ponColorTodos que establezcan un color para todos los objetos creados.
//5. Crear un metodo estadistica que muestre cuantos objetos de cada tipo hay en el array
//6. Crear un metodo booleano hayEsferas y que devuelva true si hay alguna esfera en el array
//7. Crear un metodo llamado areaMedia que calcule el area media de todas las figuras 2D
//8.- crear un metodo "mostrarFiguras" que visualice el contenido de todo el array de figuras
//9.- crear un metodo "borraTodo" que borrer los atributos de todas las figuras del array
//10.- crear un metodo "eliminarFigura" que borre la figura cuyo nombre se le pase por parametro
//11.- crear un metodo llamado "eliminarTriangulos" que elimine todas las figuras que sean triangulos
//Autor: Sergio Tobal
//Fecha: 03-10-2012
public class Figuras_m {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		//		1. Definir array de 100 figuras
		Figuras[] objFiguras = new Figuras[100];
		int eleccionFigura = 0,i=0, nombreFiguraBorrar=0;

		//		Se muestra un menu y se pide el numero de la figura
		eleccionFigura=menuPedirFigura(eleccionFigura);

		//		2. Cargar el array creando los objetos que el usuario decida(1 para rectangulo, 2 para circulo, ... 0 para terminar)
		while (eleccionFigura!=0 && i<100) {
			switch (eleccionFigura) {
			case 0:break;
			case 1:objFiguras[i]=new Rectangulo();i++;break;
			case 2:objFiguras[i]=new Circulo();i++;break;
			case 3:objFiguras[i]=new Triangulo();i++;break;
			case 4:objFiguras[i]=new Cubo();i++;break;
			case 5:objFiguras[i]=new Esfera();i++;break;
			case 6:objFiguras[i]=new Piramide();i++;break;
			default:System.out.println("NUMERO NO EXISTENTE");break;
			}
			eleccionFigura=menuPedirFigura(eleccionFigura);
		}

		//		3. Establecer los valores de cada figura del array atendiendo al tipo de figura que es y pidiendo los datos correspondientes al usuario.
		setearValores(objFiguras, i);
		//		4. Crear un metodo ponColorTodos que establezcan un color para todos los objetos creados.
		ponColorTodos(objFiguras, i);
		//		5. Crear un metodo estadistica que muestre cuantos objetos de cada tipo hay en el array
		estadistica(objFiguras, i);
		//		6. Crear un metodo booleano hayEsferas y que devuelva true si hay alguna esfera en el array
		if (hayEsferas(objFiguras, i)) {
			System.out.println("----------------------------------------");
			System.out.println("Hay por lo menos una esfera en el array");
			System.out.println("----------------------------------------");
		}else {
			System.out.println("----------------------------------------");
			System.out.println("No hay ningun esfera");
			System.out.println("----------------------------------------");
		}
		//		7. Crear un metodo llamado areaMedia que calcule el area media de todas las figuras 2D
		areaMedia(objFiguras, i);
		//		8.- crear un metodo "mostrarFiguras" que visualice el contenido de todo el array de figuras
		mostrarFiguras(objFiguras, i);
		//		9.- crear un metodo "borraTodo" que borrer los atributos de todas las figuras del array
		borraTodo();
		//		10.- crear un metodo "eliminarFigura" que borre la figura cuyo nombre se le pase por parametro		
		System.out.println("Introduzca el nombre de la figura que desea borrar: ");
		try {
			nombreFiguraBorrar=Integer.parseInt(lectura.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		eliminarFigura(objFiguras, i, nombreFiguraBorrar);
		//		11.- crear un metodo llamado "eliminarTriangulos" que elimine todas las figuras que sean triangulos
		eliminarTriangulos();


	}



	private static void mostrarFiguras(Figuras[] objFiguras, int cont) {
		for (int i = 0; i < cont; i++) {
			objFiguras[i].mostrarFigura();
		}
	}

	private static void borraTodo() {

	}

	private static void eliminarTriangulos() {

	}

	private static int menuPedirFigura(int eleccionFigura) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		//		Creamos un Menu que vea el usuario cuando va a introducir las figuras
		System.out.println("1. Rectangulo" +
				"\n2. Circulo" +
				"\n3. Triangulo" +
				"\n4. Cubo" +
				"\n5. Esfera" +
				"\n6. Piramide" +
				"\n0. No crear mas figuras");
		System.out.println("Elije el numero de la figura que quieres crear: ");

		try {
			eleccionFigura=Integer.parseInt(lectura.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return eleccionFigura;
	}

	private static void setearValores(Figuras[] objFiguras, int cont) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int Circulo_radio=0, Cubo_altura=0,Esfera_radio=0 ;
		String strColor = null, strNombre = null;
		for (int i = 0; i < cont; i++) {
			if (objFiguras[i] instanceof Circulo) {
				System.out.println("----------------------------------------");
				System.out.println("Radio del Circulo: ");
				Circulo_radio=Integer.parseInt(lectura.readLine());
				((Circulo) objFiguras[i]).setRadio(Circulo_radio);

				System.out.println("Color del circulo: ");
				strColor=lectura.readLine();
				((Circulo) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre del circulo: ");
				strNombre=lectura.readLine();
				((Circulo) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}else if (objFiguras[i] instanceof Cubo) {
				System.out.println("----------------------------------------");
				System.out.println("Altura del Cubo: ");
				Cubo_altura=Integer.parseInt(lectura.readLine());
				((Cubo) objFiguras[i]).setAltura(Cubo_altura);

				System.out.println("Color del Cubo: ");
				strColor=lectura.readLine();
				((Cubo) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre del Cubo: ");
				strNombre=lectura.readLine();
				((Cubo) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}else if (objFiguras[i] instanceof Esfera) {
				System.out.println("----------------------------------------");
				System.out.println("Radio de la Esfera: ");
				Esfera_radio=Integer.parseInt(lectura.readLine());
				((Esfera) objFiguras[i]).setRadio(Esfera_radio);

				System.out.println("Color de la Esfera: ");
				strColor=lectura.readLine();
				((Esfera) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre de la Esfera: ");
				strNombre=lectura.readLine();
				((Esfera) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}else if (objFiguras[i] instanceof Piramide) {
				System.out.println("----------------------------------------");
				System.out.println("Triangulo de la Piramide: ");
				int piramideTriangulo = Integer.parseInt(lectura.readLine());
				((Piramide) objFiguras[i]).setTriangulo(piramideTriangulo);
				System.out.println("Volumen de la piramide: ");
				((Piramide) objFiguras[i]).calcular_volumen();

				System.out.println("Color de la Piramide: ");
				strColor=lectura.readLine();
				((Piramide) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre de la Piramide: ");
				strNombre=lectura.readLine();
				((Piramide) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}else if (objFiguras[i] instanceof Rectangulo) {
				System.out.println("----------------------------------------");
				System.out.println("Lado 1 del Rectangulo: ");
				int rectanguloLado1 = Integer.parseInt(lectura.readLine());
				((Rectangulo) objFiguras[i]).setLado1(rectanguloLado1);
				System.out.println("Lado 2 del Rectangulo: ");
				int rectanguloLado2 = Integer.parseInt(lectura.readLine());
				((Rectangulo) objFiguras[i]).setLado2(rectanguloLado2);
				System.out.println("Diagonal del Rectangulo: ");
				int rectanguloDiagonal = Integer.parseInt(lectura.readLine());
				((Rectangulo) objFiguras[i]).setDiagonal(rectanguloDiagonal);

				System.out.println("Color del Rectangulo: ");
				strColor=lectura.readLine();
				((Rectangulo) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre del Rectangulo: ");
				strNombre=lectura.readLine();
				((Rectangulo) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}else if (objFiguras[i] instanceof Triangulo) {
				System.out.println("----------------------------------------");
				System.out.println("Altura del Triangulo: ");
				int trianguloAltura = Integer.parseInt(lectura.readLine());
				((Triangulo) objFiguras[i]).setAltura(trianguloAltura);
				System.out.println("Base del Triangulo: ");
				int trianguloBase = Integer.parseInt(lectura.readLine());
				((Triangulo) objFiguras[i]).setAltura(trianguloBase);

				System.out.println("Color del Triangulo: ");
				strColor=lectura.readLine();
				((Triangulo) objFiguras[i]).setColor(strColor);
				System.out.println("Nombre del Triangulo: ");
				strNombre=lectura.readLine();
				((Triangulo) objFiguras[i]).setNombre(strNombre);
				System.out.println("----------------------------------------");
				
			}

		}
	}

	private static void ponColorTodos(Figuras[] objFiguras, int cont) {//Este metodo setea el color de todas las figuras
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String color="";
		System.out.println("De que color deseas pintar todas las figuras?");
		try {
			color=lectura.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < cont; i++) {
			objFiguras[i].setColor(color);
		}
	}

	private static void estadistica(Figuras[] objFiguras, int cont) {
		int num_circulo = 0,num_cuadrado=0,num_cubo=0,num_esfera=0,num_piramide=0,num_rectangulo=0,num_triangulo=0;
		for (int i = 0; i < cont; i++) {
			if (objFiguras[i] instanceof Circulo) {
				num_circulo++;
			}else if (objFiguras[i] instanceof Cuadrado) {
				num_cuadrado++;
			}else if (objFiguras[i] instanceof Cubo) {
				num_cubo++;
			}else if (objFiguras[i] instanceof Esfera) {
				num_esfera++;
			}else if (objFiguras[i] instanceof Piramide) {
				num_piramide++;
			}else if (objFiguras[i] instanceof Rectangulo) {
				num_rectangulo++;
			}else if (objFiguras[i] instanceof Triangulo) {
				num_triangulo++;
			}
		}
		System.out.println("Hay "+num_circulo+" circulos" +
				"\nHay "+num_cuadrado+" cuadrados" +
				"\nHay "+num_cubo+" cubo" +
				"\nHay "+num_esfera+" esferas" +
				"\nHay "+num_piramide+" piramides" +
				"\nHay "+num_rectangulo+" rectangulos" +
				"\nHay "+num_triangulo+" triangulos");
	}

	private static boolean hayEsferas(Figuras[] objFiguras, int cont) {

		for (int i = 0; i < cont; i++) {
			if (objFiguras[i] instanceof Esfera) {
				return true;
			}
		}
		return false;
	}

	private static void areaMedia(Figuras[] objFiguras, int cont) {
		double suma=0,cont_figuras_2d=0, media=0;
		for (int i = 0; i < cont; i++) {
			if (objFiguras[i] instanceof Rectangulo || objFiguras[i] instanceof Circulo || objFiguras[i] instanceof Triangulo) {
				suma=suma+((Figura2D) objFiguras[i]).getArea();
				cont_figuras_2d++;
			}
		}
		media=suma/cont_figuras_2d;
		System.out.println("----------------------------------------");
		System.out.println("La media de las figuras de 2 dimensiones es "+media);
		System.out.println("----------------------------------------");
	}

	public static void eliminarFigura(Figuras[] listafiguras, int cont, int num){
		for (int i = num; i < cont-1; i++) {
			listafiguras[i]=listafiguras[i+1];
		}
		cont--;
	}

}
