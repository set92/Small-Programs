package ejemplo;

//Cuarto ejercicio de ficheros. P�g. 163-164 - Libro RAMA
//Usamos las clases "FileWriter" y "FileReader" que trabajan con flujos de caracteres sobre ficheros de la clase "File".
//Me permite escribir strings de un tir�n.

import java.io.*;

public class TestFichero4{
	
	public static void main(String[] args){
		String []amigos={"Andr�s Rosique","Pedro Ruiz","Isaac Sanchez","Juan Serrano"};
		
		File fs = new File("amigos.txt");
		try{
			FileWriter fw = new FileWriter(fs);
			for (String s : amigos){
				fw.write(s,0,s.length()); //esto es lo que pone el libro. Si pusi�ramos "fw.write(s)" tambi�n funcionar�a
				fw.write("\r\n");
			}
			if (fw != null) fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		File fe = new File("amigos.txt");
		if (fe.exists()){
			try{
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String s;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				} 				
				if (fr != null) fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

