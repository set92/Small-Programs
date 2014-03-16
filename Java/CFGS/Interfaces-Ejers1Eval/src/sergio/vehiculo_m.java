package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//pide al usuario datos de varios vehiculos hasta que escriba como modelo "fin".
//Fecha: 22/09/2012
//Autor: Sergio Tobal Uriarte
public class vehiculo_m {


	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String modelo;
		int cont=0;
		vehiculo[] listacoches = new vehiculo[100];//Se inicializa el array y se dice que tendra 100 objetos del tipo vehiculo

		//En este for se pregunta por los datos de los coches y se van almacenando en objetos distintos.
		for (int i=0;i<listacoches.length;i++){
			System.out.println("Dando de alta el coche numero "+(i+1));
			System.out.println("Modelo: ");
			modelo=lectura.readLine();//No me gusta esto, pero si no se lo asignaba a una variable
			if (modelo.equals("fin")) {//en esta linea me daba error porque me pedia dos veces el modelo
				break;
			}else {
				listacoches[i]= new vehiculo(modelo);//Aqui era la segunda vez donde me pedia el modelo
			}
			System.out.println("Potencia: ");
			listacoches[i].setPotencia(Integer.parseInt(lectura.readLine()));
			System.out.println("¿Tiene traccion a las 4 ruedas? ");
			if (lectura.readLine().equals("si")) {
				listacoches[i].setTracion4(true);
			}else {
				listacoches[i].setTracion4(false);
			}
			cont++;
		}

		//Un for para poder mostrar todos los datos de todos los objetos, hay un problema y es que muestra el objeto con los datos del constructor iniciales,
		//y tiene otro problema y es que da error al final del programa. Creo que es porque intenta mostrar todos los objetos del array pero claro el array no 
		//completamente lleno y cuando va a mostrar el objeto que no existe da error y se sale del programa, he intentado cambiar el .length pero no sab
		for (int i = 0; i < cont; i++) {
			listacoches[i].muestravehiculo();
		}
	}

}
