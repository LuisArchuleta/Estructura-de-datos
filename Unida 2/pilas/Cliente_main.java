package pilas;

public class Cliente_main {

	public static void main(String[] args) {
		//Crear una nueva pila de enteros
		Pila<Integer> pila2 = new Pila<Integer>();
		//Apilar elementos
		pila2.apilar(2);
		pila2.apilar(5);
		pila2.apilar(7);
		System.out.println("El tope de la pila es: "+pila2.cima());
		//Desapilar
		pila2.retirar();
		System.out.println("El tope de la pila es: "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es: "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es: "+pila2.cima());

	}

}
