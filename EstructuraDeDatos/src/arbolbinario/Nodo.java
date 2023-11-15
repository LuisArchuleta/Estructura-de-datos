/**
 * 
 */
package arbolbinario;

/**
 * @author lourdesarmenta
 *
 */
public class Nodo{
	//Atributo valor del tipo T. Almacena la referencia al objeto que se guarda en el nodo
	private Object valor;
	
	//Referencia al Izquierdo nodo enlazado
	Nodo Izquierdo;
	//Referencia al Izquierdo nodo enlazado
	Nodo Derecho;
	//constructor por defecto
	public Nodo() {
		valor = null;
		Izquierdo = null;
		Derecho=null;
	}
	public Nodo(Object valor) {
		this.valor = valor;
		Izquierdo = null;
		Derecho = null;
	}
	//devuelve el valor
	public Object getValor() {
		return valor;
	}
	//modifica el valor
	public void setValor(Object valor) {
		this.valor = valor;
	}
	//devuelve el atributo Izquierdo
	public Nodo getIzquierdo() {
		return Izquierdo;
	}
	//Modifica el atributo Izquierdo
	public void setIzquierdo(Nodo Izquierdo) {
		this.Izquierdo = Izquierdo;
	}
	public Nodo getDerecho() {
		return Derecho;
	}
	public void setDerecho(Nodo Derecho) {
		this.Derecho = Derecho;

	}
}
