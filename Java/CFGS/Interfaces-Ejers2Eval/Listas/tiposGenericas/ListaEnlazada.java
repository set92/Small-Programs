package tiposGenericas;


public class ListaEnlazada<T> {
	//Referencia al primer nodo de la lista(que en principio esta vacia)
	private Nodo<T>	p = null;

	public void agregarAlFinal(T v) {
		//Creamos un nuevo nodo
		Nodo<T> nuevo = new Nodo<T> ();
		nuevo.setInfo(v);
		nuevo.setSiguiente(null);
		//Si la lista esta todavia vacia el nuevo nodo sera el primero
		if (p==null) {
			p=nuevo;
			return;
		}
		//Si no esta vacia la recorro hasta que "aux" apunte al ultimo nodo
		Nodo<T> aux;
		for (aux = p; aux.getSiguiente() != null; aux=aux.getSiguiente()) {
			//Ahora hago que el ultimo nodo de la lista que apunte al nuevo que acabo
			//de crear/insertar (que pasara a ser el ultimo)
			aux.setSiguiente(nuevo);
		}
	}
	
	public void agregarAlPrincipio(T v) {
		// Ahora no hay que recorrer la lista, simplemente hacer que el nuevo nodo apunte a la lista
		//y la lista apunte ahora al nuevo nodo (que sera el primero). Hay que hacerlo en orden o peta
		Nodo<T> nuevo  = new Nodo<T> ();
		nuevo.setInfo(v);
		nuevo.setSiguiente(p);
		p= nuevo;
	}
	
	public Nodo<T> buscar(T v) {
		//Para buscar, recorremos la lista, con un puntero auxiliar, mientras no lo encontremos y no hayamos llegado al final de la lista
		Nodo<T> aux = p;
		while (aux != null && !aux.getInfo().equals(v)) {
			aux.getSiguiente();
		}
		return aux;
	}
	
	public Nodo<T> eliminar(T v) {
		//Para eliminar un nodo recorremos la lista busacando el primer nodo cuya info coincide con la que la queremos eliminar. Como en estas
		//listas solo tenemos el puntero al siguiente nodo, para poder desenlazar el nodo a eliminar tenemos que mantener todo el rato un puntero
		//al nodo anterior al nodo en curso (Que es el que se va a eliminar)
		Nodo<T> act=p, ant=null;
		while (act!=null && !act.getInfo().equals(v)) {
			ant=act;
			act=act.getSiguiente();
		}
		//Si lo encontramos al principio
		if (act!=null && ant==null) {
			Nodo<T> eliminado = act;
			p=act.getSiguiente();
			return eliminado;
		}
		//Si lo encontramos por el medio
		if (act!=null && ant!=null) {
			Nodo<T> eliminado = act;
			ant.setSiguiente(act.getSiguiente());
			return eliminado;
		}
		//Si no estaba no lo podemos eliminar, asi que devolvemos null
		return null;
	}
	
	public String toString() {
		String x="";
		Nodo<T> aux=p;
		while (aux!=null) {
			x+=""+aux.getInfo()+(aux.getSiguiente()!=null?",)":"");
			aux=aux.getSiguiente();
		}
		return x;
	}
}
