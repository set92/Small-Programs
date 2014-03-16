package sergio.ejer566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @author set92
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		double peso;
		String opcion;
		String tipo_destino;
		Peso objeto=new Peso(70,"Kg");
		opcion=menu();
		objeto.setTipo_medida(opcion);
		
		System.out.println("Cuanto peso quieres pasar? ");
		peso=Integer.parseInt(lectura.readLine());
		System.out.println("A que unidad lo quieres pasar?");
		tipo_destino=lectura.readLine();
		if (peso==0) {
			System.out.println("Peso incorrecto");
			System.exit(0);
		}
		
//		Miramos cuanto es nuestra cantidad en libras
		System.out.println(peso+opcion+" son "+(int)objeto.getLibras(peso)+" libras");	
		
//		Miramos cuanto es nuestra cantidad en lingotes
		System.out.println(peso+opcion+" son "+(int)objeto.getLingotes(peso)+" lingotes");	
		
//		Miramos cuanto es nuestra cantidad en la unidad deseada
		System.out.println(peso+opcion+" son "+(int)objeto.getPeso(peso, opcion, tipo_destino)+" "+tipo_destino);	
		
	}

	private static String menu() throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String opcion=null;
		System.out.println("Este es el menu para cambiar de unidades, elije la unidad que deseas cambiar\n PROGRAMA EN ESTADO DEV. SOLO FUNCIONA CON Kg"
				+"\nKg. Kilogramos"
				+"\nLb. Libras"
				+"\nLi. Lingotes"
				+"\nOz. Onzas"
				+"\nP. Peniques"
				+"\nGr. Gramos"
				+"\nQ. Quintales");
		
		opcion=lectura.readLine();
		return opcion;
	}

}