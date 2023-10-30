package listaCircular;

public class ClienteMain {
	
	public static void main(String[] args) {
		try {
		ListaCircular<Integer> lista = new ListaCircular<Integer>();
		lista.agregar(12);
		lista.agregar(15);
		lista.agregar(20);
		System.out.println("Elemento 0: "+lista.getValor(0));
		System.out.println("Elemento 1: "+lista.getValor(1));
		System.out.println("Elemento 2: "+lista.getValor(2));
		lista.insertar(13, 1);
		lista.insertar(16, 3);
		for(int i=0;i<lista.getTamanio();i++) 
			System.out.println("Elemento "+ i + ": "+lista.getValor(i));
		lista.remover(0);
		for(int i=0;i<lista.getTamanio();i++)
			System.out.println("Elemento "+ i +": "+lista.getValor(i));
		lista.remover(3);
		for(int i=0;i<lista.getTamanio();i++)
			System.out.println("Elemento "+ i +": "+lista.getValor(i));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
