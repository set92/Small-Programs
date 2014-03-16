package ejemplo;

//Tercer ejercicio de ficheros. P�g. 161-162 - Libro RAMA
//Usamos diversos m�todos de la clase "File" (para el manejo de directorios)
//Notar que las rutas en "windows" hay que ponerlas duplicando la "\" ya que coincide con el caracter "esc" de JAVA
//Tambien podemos poner como separador la "/" (como en LINUX). Lo que no podemos poner es "\"

import java.io.File;

public class TestFichero3{
	public static void main(String[] args){
		File dir = new File("D:/PROGRAMACI�N/PROYECTOS ECLIPSE/07_RAMA06/bin/paquete061");
		
		if (dir.exists()) {
			System.out.println("Existe el directorio "+dir.getName());
		}else{
			System.out.println("El directorio no existe");
		}
		if (dir.canRead())
		   System.out.println("El directorio existe y tiene permiso de lectura");
		if (dir.canWrite())
		   System.out.println("El directorio existe y tiene permiso de escritura");
		System.out.println("\n\nA continuaci�n listamos el contenido de dicho directorio \"" + dir.getAbsolutePath() + "\" :");
		File[] ficheros = dir.listFiles();
		for (File f : ficheros)
			System.out.println(f.getName());
	}
}

