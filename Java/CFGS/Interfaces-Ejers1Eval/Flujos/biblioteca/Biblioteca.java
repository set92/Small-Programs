package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Biblioteca {
	private Libro[] estanteria;
	private int cont=0, primeraLetra=0, letra=0, librosAñadidos=0;
	private String autor="", titulo="", isbn="", texto="";
	
	public Biblioteca(int numLibros) {
		estanteria = new Libro[numLibros];
	}
	
	public boolean añadirLibro(Libro libroNuevo) {
		for (int i = 0; i < estanteria.length; i++) {
			if (estanteria[i].equals(null)) {//Si la posicion esta vacia
				estanteria[i]=libroNuevo;//Mete el libro en el hueco de la estanteria
				return true;
			}
		}
		return false;//Si no habia ningun hueco libro en la estanteria saldra por aqui
		
	}
	
	public int archivaL(BufferedWriter bufferEscritura) {		
		for(int i = 0; i < estanteria.length; i++){
			if(estanteria[i] != null){
					try {
						bufferEscritura.write(estanteria[i].dameLibro()+"\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
					cont++;
			}
		}
		return 0;
	}
	
	public int recuperaLibros(BufferedReader bufferLectura) {
		for(int i = 0; i < estanteria.length; i++){
			if(estanteria[i] != null){
					try {
						texto=bufferLectura.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					cont++;
					for(int j = 0; j <= 2; j++){
						while(texto.charAt(letra)!=','){
							letra++;
						}
						if(j==0){
							autor=texto.substring(primeraLetra, letra-1);
							letra++;
							primeraLetra=letra+1;
						}else{
							titulo=texto.substring(primeraLetra, letra-1);
							letra=letra+1;
							isbn=texto.substring(letra);
						}
					}
					Libro libro=new Libro(autor, titulo, isbn);
					añadirLibro(libro);
					librosAñadidos++;
			}
		}
		return librosAñadidos;
	}
	
	public boolean borrarLibro(String isbn) {
			while(estanteria[cont].getIsbn().equals(isbn)){
				cont++;
			}
			estanteria[cont]=null;
			if (estanteria[cont]==null) {
				return true;
			}else {
				return false;
			}
	}
	
	public Libro localizaLibro(String isbn) {
			while(estanteria[cont].getIsbn().equals(isbn)){
				cont++;
			}
			if (estanteria[cont]!=null) {
				return estanteria[cont];
			}else {
				return null;
			}
	}
	
	public void listaLibros() {
		Libro aux[] = new Libro[estanteria.length];
		for (int i = 0; i < estanteria.length; i++) {
			if (estanteria[i] != null) {
				aux[i]=estanteria[i];
				ordena(aux);
			}
		}
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.println(aux[i].dameLibro());
			}
		}
	}
	
	public void ordena(Libro aux[]) {
		Libro temp;
		for (int j = aux.length; --j>=0;) {
			for (int i = 0; i < j; i++) {
				if (aux[i+1] != null & aux[i] != null) {
					if (comparaTextos(aux[i+1].getAutor(), aux[i].getAutor())<0) {
						temp=aux[i];
						aux[i]=aux[i+1];
						aux[i+1]=temp;
					}
				}
			}
		}
		
	}
	
	public int comparaTextos(String autor1, String autor2) {
		int longitud;
		autor1 = autor1.toUpperCase();
		autor2=autor2.toUpperCase();
		if (autor1.length()> autor2.length()) {
			longitud = autor2.length();
		}else {
			longitud = autor1.length();
		}
		
		for (int i = 0; i < longitud; i++) {
			if (autor1.charAt(i)<autor2.charAt(i)) {
				return -1;
			}
			if (autor1.charAt(i)>autor2.charAt(i)) {
				return 1;
			}
			if (autor1.charAt(i)=='\0') {//Caracter nulo NULL
				return -1;
			}
			if (autor2.charAt(i)=='\0') {
				return 1;
			}
		}
		return 0;
	}
}
