package biblioteca;

public class Menu {
	LectorTeclado teclado;
	char opcion;
	public Menu() {
		teclado= new LectorTeclado();
	}
	
	public char dameOpcion() {
		System.out.println("Opciones a realizar con la biblioteca: " +
				"\n 1. Altas" + 
				"\n 2. Bajas" +
				"\n 3. Listados" +
				"\n 4. Modificacion" +
				"\n 5. Busqueda" +
				"\n 6. Salir");
		opcion = teclado.leeCaracter("Seleccion una opcion");
		return opcion;
	}
}
