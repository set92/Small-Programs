package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectorF {
	private String fichero;
	
	public LectorF(String fileName) {
		fichero = fileName;
	}
	public int archivaBiblioteca(Biblioteca objBiblioteca) {
		FileWriter escribirFile;
		BufferedWriter bufferEscritura;
		try {
			escribirFile = new FileWriter(fichero);
			bufferEscritura = new BufferedWriter(escribirFile);
			objBiblioteca.archivaL(bufferEscritura);
			
			escribirFile.close();
			bufferEscritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int recuperaBiblioteca(Biblioteca objBiblioteca) {
		FileReader leerFile;
		BufferedReader bufferlectura;
		
		try {
			leerFile = new FileReader(fichero);
			bufferlectura = new BufferedReader(leerFile);
			objBiblioteca.recuperaLibros(bufferlectura);
			
			leerFile.close();
			bufferlectura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
