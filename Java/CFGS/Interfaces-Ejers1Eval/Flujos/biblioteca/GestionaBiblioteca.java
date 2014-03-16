package biblioteca;

public class GestionaBiblioteca {

	public static void main(String[] args) {
		int nMaxLibros = 10;
		Biblioteca estanteria = new Biblioteca(nMaxLibros);
		LectorTeclado teclado = new LectorTeclado();
		LectorF fichero = new LectorF("libros.txt");
		int numLibros = fichero.recuperaBiblioteca(estanteria);
		System.out.println("Recuperada la bibilioteca desde el archivo en disco, hay "+numLibros+" libros en la biblioteca");
		char opcion;
		Menu menu = new Menu();
		do {
			opcion = menu.dameOpcion();
			switch (opcion) {
			case '1':
				String autor = teclado.leeTexto("Autor");
				String titulo = teclado.leeTexto("Titulo");
				String isbn = teclado.leeTexto("ISBN");
				Libro l1 = new Libro(autor, titulo, isbn);
				if (estanteria.añadirLibro(l1)) {
					System.out.println("Libro añadido");
				}else {
					System.out.println("Estanteria llena");
				}	
				break;

			case '2':
				isbn = teclado.leeTexto("Teclea el ISBN");
				if (estanteria.borrarLibro(isbn)) {
					System.out.println("Libro borrado");
				}else {
					System.out.println("Libro no encontrado");
				}
				break;

			case '3':
				System.out.println("Lista libros");
				estanteria.listaLibros();
				break;

			case '4'://Modificar
				estanteria.listaLibros();
				isbn=teclado.leeTexto("Teclea el isbn");
				Libro l2 = estanteria.localizaLibro(isbn);
				if (l2!=null) {
					String temp = teclado.leeTexto("\nNuevo isbn");
					if (temp.length()>0) {
						l2.setIsbn(temp);
					}
					temp=l2.getAutor();

					temp=teclado.leeTexto(temp+"\nNuevo autor");
					if (temp.length()>0) {
						l2.setAutor(temp);
					}
					temp=l2.getLibro();

					temp=teclado.leeTexto(temp+"\nNuevo Titulo");
					if (temp.length()>0) {
						l2.setLibro(temp);
					}
				}else {
					System.out.println("No se ha encontrado");
				}
				break;
			case '5'://Busqueda
				isbn = teclado.leeTexto("Teclea el isbn");
				Libro l3 = estanteria.localizaLibro(isbn);
				if (l3 != null) {
					System.out.println(l3.dameLibro().toUpperCase());
				}else {
					System.out.println("Libro NO encontrado");
				}
				break;
			case '6'://Salir
				System.out.println("Salir");
				break;
			default:
				System.out.println("La opcion es incorrecta");
				break;
			}
		} while (opcion != '6');
		numLibros = fichero.archivaBiblioteca(estanteria);
		System.out.println("Archivada la biblioteca, se han guardado "+numLibros+" libros en el archivo.");

	}
}
