package tiposGenericas;

public class Nodo<T> {
	private T info;
	private Nodo<T> siguiente;
	
	public T getInfo() {
		return info;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
