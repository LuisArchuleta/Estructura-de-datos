package pilas;

public class Nodo <T> {
	private T valor;
	Nodo<T>Siguiente;
	//Contructor por defecto
	
	public Nodo() {
		valor = null;
		Siguiente = null;
	}//Devuelve el valor

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo<T> getSiguiente() {
		return Siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.Siguiente = siguiente;
	}
	
	

}
