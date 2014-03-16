package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaFicheroTexto {

	public static void main(String[] args) throws IOException {
		String texto;
		File file = new File("archivo.txt");

		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		File fileCopia = new File("archivo1.txt");
		FileWriter fileWriter = new FileWriter(fileCopia);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		while(bufferedReader.ready()){
			texto=bufferedReader.readLine();
			bufferedWriter.write(texto);
			bufferedWriter.newLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}