/**
 * 
 */
package listasDoblementeLigadas;

/**
 * @author lourdesarmenta
 *
 */
public class Nodo <T>{
	//Atributo valor ded tipo T.Almacena al referencia al objeto
	private T valor;
	//Referencia al siguiente nodo enlazado
	Nodo<T> siguiente;
	//Referencia al anterior nodo enlazado
	Nodo<T> anterior;
	//constructor por defecto
	public Nodo() {
		valor = null;
		siguiente = null;
		anterior = null;
	}
	//devuelve el valor
	public T getValor() {
		return valor;
	}
	//modifica el valor
	public void setValor(T valor) {
		this.valor = valor;
	}
	//devuelve el atributo siguiente
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	//Modifica el atributo siguiente
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
	
}
