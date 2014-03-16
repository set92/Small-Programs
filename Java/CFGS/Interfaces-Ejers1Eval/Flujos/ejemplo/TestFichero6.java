package ejemplo;

//Ejercicio de serializaci�n. P�g., 171-172 RAMA
//Lestura y escritura de objetos en un fichero. Similar a los ejercicios anteriores, pero en lugar de 
//datos escribimos y leemos OBJETOS (que en el fondo son datos).

//Usamos los m�todos "writeObject" y "readObject", m�todos de objetos de la clase "ObjectOutputStream". As� mismo,
//para crear los objetos de esta clase hay que hacerlos como asociados a objetos "FileOutputStream".

import java.io.*;

public class TestFichero6{
public static void main(String[] args){
	String []amigos={"Andr�s Rosique","Pedro Ruiz","Isaac Sanchez","Juan Serrano"};
	long []telefonos={653364787,627463746,644567346,623746348};
	
	//escritura del fichero
	try{
		FileOutputStream fs = new FileOutputStream("amigos3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		for (int i=0;i<4;i++){
			amigo a = new amigo(amigos[i],telefonos[i]);
			oos.writeObject(a); //Escribo "de golpe" un objeto de la clase "amigo".
		}
		if (oos != null){ 
			oos.close();
			fs.close();
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
	//lectura del fichero:
	/* Primero hay que establecer una conexi�n con el fichero real "amigos3.txt".  Posteriormente el flujo
	 * con capacidad de leer informaci�n de dicho fichero "FileInputStream" deber� asociarse al flujo capaz
	 * de transformar esos datos en objetos "ObjectInputStream" para poder ser utilizados en el programa. */
	try{
		File f=null;
		FileInputStream fe = null;
		ObjectInputStream ois = null;
		try{
			f = new File("amigos3.txt");
			if (f.exists()){
				fe = new FileInputStream(f);
				ois = new ObjectInputStream(fe);
				//Para hacer la lectura, el libro plantea un bucle infinito hasta que el programa lance
				//una excepci�n de tipo "EOFException" que ser� tratada en el bloque "catch" correspondiente
				while(true){
					amigo a = null;
					a = (amigo)ois.readObject(); //Leo "de golpe" un objeto de la clase "amigo". Hacemos un "casting" para ello
					a.print();
					System.out.println("");
				} 				
			}
		}
		catch (EOFException eof) {
			System.out.println(" --------------------------");
		}
		catch (FileNotFoundException fnf) {
			System.err.println("Fichero no encontrado " + fnf);
		}
		catch(IOException e){
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}
		catch (Throwable e) {
			System.err.println("Error de programa: " + e);
			e.printStackTrace();
		}
		finally{
			if (ois != null) {
				ois.close();
				fe.close();
			}
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}

