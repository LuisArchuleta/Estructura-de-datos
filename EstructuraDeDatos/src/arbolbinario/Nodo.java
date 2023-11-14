/**
 * 
 */
package arbolbinario;

/**
 * @author lourdesarmenta
 *
 */
public class Nodo <T>{
	//Atributo valor del tipo T. Almacena la referencia al objeto que se guarda en el nodo
	private Object valor;
	
	//Referencia al izquierdo nodo enlazado
	Nodo izquierdo;
	//Referencia al izquierdo nodo enlazado
	Nodo derecho;
	//constructor por defecto
	public Nodo() {
		valor = null;
		izquierdo = null;
		derecho=null;
	}
	//devuelve el valor
	public Object getValor() {
		return valor;
	}
	//modifica el valor
	public void setValor(Object valor) {
		this.valor = valor;
	}
	//devuelve el atributo izquierdo
	public Nodo getizquierdo() {
		return izquierdo;
	}
	//Modifica el atributo izquierdo
	public void setizquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Nodo getderecho() {
		return derecho;
	}
	public void setderecho(Nodo derecho) {
		this.derecho = derecho;

	}
}
