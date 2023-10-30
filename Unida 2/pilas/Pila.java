package pilas;

public class Pila <T> {
	//Atributo cabeza, que apunta al tope de la pila
	private Nodo<T> cabeza;
	//almacena el total de elementos de la pila
	private int tamaño;
	//Constructor por defecto
	public void pila() {
		cabeza = null;
		tamaño = 0;
	}
	
	//Devuelve el tamaño de la pila
	public int getTamaño() {
		return tamaño;
	}
	
	//Verificar si la pila esta vacio
	public boolean esVacia() {
		return (cabeza ==null);
	}
	
	//apilar un nuevo elemento
	public void apilar(T valor) {
		//Crear un nuevo nodo
		Nodo<T> nuevo = new Nodo<T>();
		//Fijar el valor al dentro del nodo
		nuevo.setValor(valor);
		if(esVacia()) {
			//Cabeza apunta al nuevo nodo
			cabeza = nuevo;
		}
		else{
			//Se enlaza el campo siguiente al nuevo 
			nuevo.setSiguiente(cabeza);
			//La nueva cabeza de la pila pasa a ser el nuevo
			cabeza = nuevo;
		}
		tamaño++;
	}
	
	public void retirar() {
		if(!esVacia()) {
			cabeza = cabeza.getSiguiente();
			tamaño--;
		}
	}
	
	public T cima() {
		if(!esVacia()) {
			return cabeza.getValor();
		}
		else {
			return null;
		}
	}
	
	public boolean search(T elemento) {
        Nodo<T> actual = cabeza;
        int posicion = 1;

        while (actual != null) {
            if (actual.getValor().equals(elemento)) {
                System.out.println("El elemento " + elemento + " se encuentra en la posición " + posicion + " de la pila.");
                return true;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        System.out.println("El elemento " + elemento + " no se encuentra en la pila.");
        return false;
    }

}
