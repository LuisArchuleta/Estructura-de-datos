package listas;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente_Main2 {

	public static void main(String[] args) {
		try {
			List<Integer> lista = new LinkedList<Integer>();
			List<Integer> lista2 = new ArrayList<Integer>();
			lista.add(12);
			lista.add(15);
			lista.add(20);
			System.out.println("Datos en la posicion 0: "+ lista.get(0));
			System.out.println("Datos en la posicion 1: "+ lista.get(1));
			System.out.println("Datos en la posicion 2: "+ lista.get(2));
			/* system.out.println("Datos en la posicion 3: " + lista.get(3)); */
			lista.add(1,13);
			lista.add(3,16);
			System.out.println();
			System.out.println("===============================");
			System.out.println("Datos en la posicion 0: "+ lista.get(0));
			System.out.println("Datos en la posicion 1: "+ lista.get(1));
			System.out.println("Datos en la posicion 2: "+ lista.get(2));
			System.out.println("Datos en la posicion 3: "+ lista.get(3));
			System.out.println("Datos en la posicion 4: "+ lista.get(4));
			
			lista.remove(0);
			lista.remove(3);
			System.out.println();
			System.out.println("===============================");
			System.out.println("Datos despues de la eliminacion");
			System.out.println("Datos de la posicion 0: "+ lista.get(0));
			System.out.println("Datos de la posicion 1: "+ lista.get(1));
			System.out.println("Datos de la posicion 2: "+ lista.get(2));
			
			lista.add(10);
			lista.add(15);
			lista.add(24);
			System.out.println();
			System.out.println("===============================");
			System.out.println("Datos de ArrayList");
			System.out.println("Datos de la posicion 0: "+ lista.get(0));
			System.out.println("Datos de la posicion 1: "+ lista.get(1));
			System.out.println("Datos de la posicion 2: "+ lista.get(2));
			
			System.out.println();
			System.out.println("========================================");
			System.out.println("Datos de ArrayList utilizando iteradores");
			for(Integer aux:lista2) {System.out.println("Elemento: "+ aux);}
			
			System.out.println();
			System.out.println("=======================================");
			System.out.println("Datos Lunked List utilizando iteradores");
			for(Integer aux:lista) {System.out.println("Elemento: "+ aux);}


		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
