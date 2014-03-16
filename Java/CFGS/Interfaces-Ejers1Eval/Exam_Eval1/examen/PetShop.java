package examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetShop {

	public static void main(String[] args) throws IOException {
		String[] articulos = new String[100];
//		Rellena el array de huecos blancos para luego no tener problemas mirando cuantos articulos hay de verdad
		for (int i = 0; i < articulos.length; i++) {
			articulos[i]=null;
		}

		almacenarArticulos(articulos);
		int numeroEfectivo = numeroEfectivo(articulos);
		System.out.println("El numero efectivo de articulos es: "+numeroEfectivo);
		guardarFichero(articulos);
	}


	public static int numeroEfectivo(String[] articulos) {
		int cont=0;
//		Va recorriendo el array y cuando encuentra un hueco vacio incrementa el contador
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i]==null) {
				cont++;
			}
		}
//		Al final devolvera el total del array menos los huecos que estaban vacios
		return ((articulos.length-cont)+1);
	}

	public static void almacenarArticulos(String[] articulos) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String producto;

		System.out.println("Para terminar en cualquier momento de almacenar datos introduce fin");
		for (int i = 0; i < articulos.length; i++) {
			System.out.println("Introduce el nombre del articulo nº "+(i+1));
			producto=lectura.readLine();
//			Si el usuario pulsa fin o Fin se saldra del bucle, sino ira almacenando en el array lo que el usuario diga
			if (producto.equals("fin") | producto.equals("Fin")) {
				break;
			}else {
				articulos[i]=producto;
			}
		}
	}
	
	public static void guardarFichero(String[] articulos) throws IOException {
		File archivo = new File("C:/archivo.txt");
		FileWriter fileWriter = new FileWriter(archivo);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
//		Volcamos el contenido del array en un fichero
		for (int i = 0; i < articulos.length; i++) {
//			Si no hay nada en el array o llega a una posicion en la que este vacia se sale del bucle
			if (articulos[i]==null) {
				break;
			}
			bufferedWriter.write(articulos[i]);//Escribe lo que tenga la posicion del array
			bufferedWriter.newLine();//Nueva linea para que no este todo el codigo seguido
		}
		bufferedWriter.close();//Cerramos el filtro para evitar problemas
	}
}
