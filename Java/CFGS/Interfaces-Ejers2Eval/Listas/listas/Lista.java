package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
	
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		//Metemos valores
		lista.add("Hola");
		lista.add("Mundo");
		
		//Tamaño del arraylist
		System.out.println(lista.size());
		System.out.println(lista);
		
		//----------------------------Diferentes formas de recorrer una lista-----------------------------
		//Utilizamos el get y un indice
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+" ");
			System.out.println();
		}
		
		//Utilizando el for que recorre listas
		for (String i: lista) {
			System.out.print(i+" ");
			System.out.println();
		}
		
		//Utilizando un objeto de la clase Iterator (que se utilizan para recorrer objetos de tipo ArrayList)
		Iterator<String> iT = lista.iterator();//Defino un iterator que recorra el arraylist de strings
		while (iT.hasNext()) {
			System.out.println(iT.next()+" ");
		}
		
		lista.set(1, "Pepe");
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		System.out.println("La posicion de la palabra hola es "+lista.indexOf("Hola"));
	}
	
	
	
}
