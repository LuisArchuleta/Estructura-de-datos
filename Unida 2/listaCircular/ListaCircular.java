package listaCircular;

public class ListaCircular<T> {
	//primer elemento de la lista
	private Nodo<T> cabeza;
	//Total de elementos de la lista
	private int tamanio;
	//Constructor por defecto
	public ListaCircular() {
		cabeza = null;
		tamanio = 0;
	}
	//Devolver el tamanio de la lista
	public int getTamanio() {
		return tamanio;
	}
	/**
	 * Consulta si la lista esta vacia
	 * @return true cuando esta vacia, false cuando no
	 */
	public boolean esVacia() {
		
		return (cabeza == null);
	}
	/**
	 * Agregar un nuevo nodo AL FINAL de la lista
	 * @param valor valo a agregar
	 */
	public void agregar(T valor) {
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setValor(valor);
		if(esVacia()) {
			nuevo.setSiguiente(nuevo);
			cabeza = nuevo;
		}
		else {
			//agregar al final de la lista
			Nodo<T> aux = cabeza;
			while (aux.getSiguiente() != cabeza) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setSiguiente(cabeza);
		}
		tamanio++;
	}
	/**
	 * inserta un nuevo nodo en la lista
	 * @param valor valor a agregar
	 * @param pos posicion donde se insertara el nodo
	 * @throw PosicionIlegalException excepcion en caso que la 
	 *    posición no exista
	 */
	public void insertar(T valor, int pos) throws PosicionIlegalException {
		if (pos>=0 && pos<=tamanio && tamanio>0) {
			Nodo<T> nuevo = new Nodo<T>();
			nuevo.setValor(valor);
			//el nodo a insertar esta al comienzo
			if (pos==0) { 
				//Buscar el ultimo nodo
				Nodo<T> ultimo = cabeza;
				while(ultimo.getSiguiente() != cabeza) {
					ultimo = ultimo.getSiguiente();
				}
				nuevo.setSiguiente(cabeza);
				cabeza= nuevo;
				ultimo.setSiguiente(cabeza);
		
			}else {
				//El nodo a inserta va al final de la lista
				if (pos==tamanio) {
					Nodo<T> aux =cabeza;
					while(aux.getSiguiente() != cabeza) {
						aux = aux.getSiguiente();
						nuevo.setSiguiente(cabeza);
					}
					aux.setSiguiente(nuevo);
				}
				
				//el nodo a insertar esta en medio
				else {
					Nodo<T> aux = cabeza;
					for (int i=0;i<=pos-2;i++){
						aux = aux.getSiguiente();
					}
					Nodo<T> siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
			}
			tamanio++;
			
		}
		else {
			throw new PosicionIlegalException();
		}
		
	}
	public T getValor(int pos) throws PosicionIlegalException{
		if (pos>=0 && pos<tamanio) {
			T valor;
			if (pos==0) {
				valor=cabeza.getValor();
				return valor;
			}
			else {
				Nodo<T> aux= cabeza;
				for(int i=0;i<=pos-1;i++) {
					aux=aux.getSiguiente();
				}
				valor = aux.getValor();
			}
			return valor;
			
		}
		else
		{
			throw new PosicionIlegalException();
		}
	}
	/**
	 * Elimina un nodo en una determinada posiciom
	 * @param pos posicion
	 * @throws PosicionIlegalException
	 */
	public void remover(int pos) throws PosicionIlegalException{
		if(pos>=0 && pos<tamanio) {
			if (pos==0) {				
				//El nodo a eliminar esta en la primera posicion
				Nodo<T> ultimo = cabeza;
				while(ultimo.getSiguiente() != cabeza) {
					ultimo = ultimo.getSiguiente();
				}
				cabeza = cabeza.getSiguiente();
				ultimo.setSiguiente(cabeza);
				tamanio--;
			}
			else {
				Nodo<T> aux = cabeza;
				for(int i=0;i<=pos-2;i++){
					aux = aux.getSiguiente();
				}
				Nodo<T>prox = aux.getSiguiente();
				aux.setSiguiente(prox.getSiguiente());
				tamanio--;	
			}
			
		}
		else {
			throw new PosicionIlegalException();
		}
	}
	public void limpiar() {
		cabeza = null;
		tamanio = 0;
	}

}