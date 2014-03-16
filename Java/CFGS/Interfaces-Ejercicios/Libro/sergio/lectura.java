package sergio;
/*
 */

import java.io.*;
class lectura {
public static void main(String[]args)throws IOException {
BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
String nombre;
System.out.println("Ingrese su nombre: ");
nombre = lectura.readLine();
System.out.println ("Bienvenido " +nombre);
}
}
