package ejemplo;

//Ejercicio de serialización. Pág., 171 RAMA
//Lestura y escritura de objetos en un fichero. Similar a los ejercicios anteriores, pero en lugar de 
//datos escribimos y leemos OBJETOS (que en el fondo son datos).

public class amigo implements java.io.Serializable{
	protected String nombre;
	protected long telefono;
	
	public amigo(String n, long t){
			nombre = n;
			telefono = t;
	}
	
	public void print(){
		System.out.println("Nombre: " + nombre + ",  Teléfono: " + telefono);
	}
}

