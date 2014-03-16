package ejemplo;

//Quinto ejercicio de ficheros. P�g. 166-167 - Libro RAMA
//Usamos las clases "DataOutputStream" y "DataInputStream" que permiten escribir en los ficheros tipos primitivos
//ya que realizan una transformacion desde estos al formato UTF-8 que se puede escribir en los archivos
//Estas clases no acceden directamente a los archivos en disco, si no que lo hacen a trav�s de objetos de las clases
//"FileOutputStream" y "FileInputStream" que hacen de intermediarios.

import java.io.*;

public class TestFichero5{
	
	public static void main(String[] args){
		String []amigos={"Andr�s Rosique","Pedro Ruiz","Isaac Sanchez","Juan Serrano"};
		long []telefonos={653364787,627463746,644567346,623746348};
		
		//escritura del fichero
		try{
			FileOutputStream fs = new FileOutputStream("amigos2.txt");
			DataOutputStream d = new DataOutputStream(fs);
			for (int i=0;i<4;i++){
				d.writeUTF(amigos[i]);
				d.writeLong(telefonos[i]);
			}
			if (d != null){ 
				d.close();
				fs.close();
			}
		}catch(IOException e){
				e.printStackTrace();
		}
		
		//lectura del fichero
		try{
			File f=null;
			FileInputStream fe = null;
			DataInputStream d = null;
			try{
				f = new File("amigos2.txt");
				if (f.exists()){
					fe = new FileInputStream(f);
					d = new DataInputStream(fe);
					String s;
					Long l;
					//Para hacer la lectura, el libro plantea un bucle infinito hasta que el programa lance
					//una excepci�n de tipo "EOFException" que ser� tratada en el bloque "catch" correspondiente
					while(true){	
						s = d.readUTF();
						System.out.print(s+" -> ");
						l = d.readLong();
						System.out.println(l);
					} 				
				}
				else System.out.println("El fichero no se puede leer porque no existe.");
			}
			//La primera execpci�n es precisamente la del fin de fichero (que indicar� que todo ha ido bien y 
			//el fichero se ha leido sin problemas. El resto ya, son situaciones de error. 
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
				if (d != null) {
					d.close();
					fe.close();
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

