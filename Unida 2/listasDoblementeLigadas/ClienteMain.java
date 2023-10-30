package listasDoblementeLigadas;

public class ClienteMain {

	public static void main(String[] args) {
		try {
			ListasDoblementeLigadas<Integer> lista = new ListasDoblementeLigadas<Integer>();
		System.out.println(lista.esVacia());
			lista.agregar(5);
			lista.agregar(8);
			lista.insertar(7, 2);
			
			for( int i=0; i<lista.getTamanio(); i++) {
				System.out.println(lista.getValor(i));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
