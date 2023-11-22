package EstructuraDeDatos.arbolBinarioOrdenado;

/**
 * Representa un árbol binario ordenado. Tiene las operaciones
 * básicas: insertar, eliminar, buscar y recorridos
 */

public class ArbolBinarioBusqueda  {
	/**
	 * Raiz del arbol
	 */
	private Nodo raiz;
	
	/**
	 * Constructor por defecto
	 */
	
	public ArbolBinarioBusqueda() {
		raiz = null;
	}
	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
		//Implementación recursiva de los recorridos
		/**
		 * Invoca al método recursivo
		 */
		public void preorden() {
			preorden(raiz);
		}
		/**
		 * 
		 * @param aux
		 */
		private void preorden(Nodo aux) {
			if(aux !=null) {
				visitar(aux);
				preorden(aux.getIzquierdo());
				preorden(aux.getDerecho());
			}
		}
		private void visitar(Nodo aux) {
			System.out.print(aux.getValor()+" ");
		}
		/**
		 * Invoca al método recursivo
		 */
		public void inorden() {
			inorden(raiz);
		}
		/**
		 * 
		 * @param aux referencia a un nodo
		 */
		private void inorden(Nodo aux) {
			if(aux !=null) {
				inorden(aux.getIzquierdo());
				visitar(aux);
				inorden(aux.getDerecho());
			}
		}
		/**
		 * Invoca al método recursivo
		 */
		public void postorden() {
			postorden(raiz);
		}
		/**
		 * 
		 * @param aux referencia a un nodo
		 */
		
		private void postorden(Nodo aux) {
			if(aux !=null) {
				postorden(aux.getIzquierdo());
				postorden(aux.getDerecho());
				visitar(aux);
			}
			
			
		}
		/**
		 * Recorrido preorden version iterativa, utilizando una pila
		 */
		public void preordenIterativo() {
			//Usa la misma implementacion de Pila de la unidad 
			//anterior
			pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
			pila.apilar(raiz);
			while (!pila.esVacia()) {
				Nodo aux = pila.cima();
				visitar(aux);
				pila.retirar();
				if(aux.getDerecho() !=null)
					pila.apilar(aux.getDerecho());
				if(aux.getIzquierdo() !=null)
					pila.apilar(aux.getIzquierdo());
			}
			
		}
		
		/**
		 * Recorrido inorden version iterativa, utilizando una pila
		 */
		public void inordenIterativa() {
			pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
			pila.apilar(raiz);
			Nodo aux = raiz.getIzquierdo();
			while (aux !=null || !pila.esVacia()) {
				if(aux !=null) {
					pila.apilar(aux);
					aux = aux.getIzquierdo();
				}else {
					aux = pila.cima();
					pila.retirar();
					visitar(aux);
					aux = aux.getDerecho();
				}
				
			}
		}
		
		/**
		 * Recorrido postorden version iterativa, utilizando una pila
		 */
		public void postOrdenIterativo() {
			pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
			Nodo aux = raiz;
			Nodo q = raiz;
			while (aux != null) {
				//Avanza por la izquierda y apila los nodos
				while(aux.getIzquierdo() !=null) {
					pila.apilar(aux);
					aux  = aux.getIzquierdo();
				}
				while (aux !=null && (aux.getDerecho() ==null 
						|| aux.getDerecho()==q)) {
					visitar(aux);
					q = aux;
					if (pila.esVacia())
						return;
					aux = pila.cima();
					pila.retirar();
				}
				pila.apilar(aux);
				aux = aux.getDerecho();
			}
		} 
		/**
		 * Recorrido por nivels
		 * 
		 */
		public void recorridoPorNiveles() {
			colas.Cola<Nodo> cola = new colas.Cola<Nodo>();
			cola.encolar(raiz);
			while (!cola.esVacia()){
				Nodo aux = cola.frente();
				System.out.print(aux.getValor().toString()+" ");
				if(aux.getIzquierdo() !=null)
					cola.encolar(aux.getIzquierdo());
				if(aux.getDerecho() !=null)
					cola.encolar(aux.getDerecho());
				cola.desencolar();
			}
			
		}
		

	
	/**
	 * Inserta un nodo en el árbol binario
	 * @param valor
	 * @throws Exception
	 */
	
	public void insertar(Object valor) throws Exception{
		Comparable dato = (Comparable) valor;
		Nodo nuevo = new Nodo();
		nuevo.setValor(dato);
		
		if(raiz==null)
			raiz=nuevo;
		else {
			//anterior: referencia al padre de aux
			Nodo anterior = null;
			//aux: auxiliar para recorrer los nodos, desde la raiz
			Nodo aux = raiz;
			while (aux!=null) {
				anterior = aux;
				if(dato.esMenor(aux.getValor()))
					aux = aux.getIzquierdo();
				else if (dato.esMayor(aux.getValor()))
					aux = aux.getDerecho();
				else
					throw new Exception("Dato duplicado");
				
			}
			if(dato.esMenor(anterior.getValor()))
				anterior.setIzquierdo(nuevo);
			else
				anterior.setDerecho(nuevo);
			
			
		}
		
		
	}
	/**
	 * 
	 */
	public void insertar2(Object valor) throws Exception{
		Comparable dato = (Comparable) valor;
		raiz = insertarRec(raiz,dato);
	}
	private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
		if (raizSub == null) {
			//Caso Base, termina la recursividad
			raizSub = new Nodo(dato);
		}
		else {
			if(dato.esMenor(raizSub.getValor())) {
				Nodo iz = insertarRec(raizSub.getIzquierdo(),dato);
				raizSub.setIzquierdo(iz);
			}else {
				if(dato.esMayor(raizSub.getDerecho())) {
					Nodo dr = insertarRec(raizSub.getDerecho(),dato);
					raizSub.setDerecho(dr);
				}else {
					//Dato duplicado
					throw new Exception("Nodo Duplicado");
				}
			}
		}
		return raizSub;
	}
	/**
	 * Busca un dato en el árbol comenzando desde la raiz
	 * 
	 */

	 public Nodo buscar(Object valor){
		Comparable dato=(Comparable) valor;
		if(raiz==null)
			return raiz;
		else{
			//aux: auxiliar que vaya reccoriendo los nodos desde la raiz
			Nodo aux= raiz;
			while (aux!=null){
				if(dato.esIgual(aux.getClass()))
					return aux;
				if(dato.esMenor(aux.getValor()))
					aux=aux.getIzquierdo();
				else
					aux = aux.getDerecho();
			}
			return null;
		}
	 }

	 /*
	  * Interfaz de buscar que invoca al metodo recursivo
	 	@param valor buscado
		@return Nodo buscado si lo encuentra, si no retorna null
	  */
	  public Nodo buscar2(Object buscado){
		Comparable dato = (Comparable) buscado;
		if(raiz==null)
			return null;
		else
			return localizar(raiz,dato);
	  }
	  
	  public Nodo localizar(Nodo raizSub, Comparable buscado){
		if(raizSub==null)
			return null;
		else if(buscado.esIgual(raizSub.getValor()))
			return raizSub;
		else if(buscado.esMenor(raizSub.getValor()))
			return localizar(raizSub.getIzquierdo(),buscado);
		else
			return localizar(raizSub.getDerecho(),buscado);
	  }

	  

}
