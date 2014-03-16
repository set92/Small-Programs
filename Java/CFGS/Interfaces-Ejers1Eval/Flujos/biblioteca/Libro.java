package biblioteca;

public class Libro {
	private String autor, libro, isbn;
	
	public String getAutor() {
		return autor;
	}

	public String getLibro() {
		return libro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Libro(String autor, String libro, String isbn) {
		this.autor=autor;
		this.libro=libro;
		this.isbn=isbn;
	}
	
	public String dameLibro() {
		return (getLibro().toUpperCase()+", "+getAutor().toUpperCase()+", "+getIsbn().toUpperCase());
	}
}
