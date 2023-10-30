package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * proposito: comprobar el uso de las clases
 * LinkedList y ArrayList
 */

public class DemoLinkedListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<Integer> list = new LinkedList<Integer>();
			list.add(12);
			list.add(15);
			list.add(21);
			System.out.println("Dato en la posicion 0: " + list.get(0));
			System.out.println("Dato en la posicion 1: " + list.get(1));
			System.out.println("Dato en la posicion 2: " + list.get(2));
			list.add(1, 13);
			list.add(3, 16);
			System.out.println("Dato en la posicion 0: " + list.get(0));
			System.out.println("Dato en la posicion 1: " + list.get(1));
			System.out.println("Dato en la posicion 2: " + list.get(2));
			System.out.println("Dato en la posicion 3: " + list.get(3));
			System.out.println("Dato en la posicion 4: " + list.get(4));
			
			System.out.println("Recorre la lista: ");
			for(int i = 0; i < list.size(); i++) {
				System.out.println("Elemento " + i + ": " + list.get(i));
			}
			
			System.out.println("Recorre la lista utilizando uniterador");
			for(Integer elm:list) {
				System.out.println(elm);
			}
			
			list.remove(0);
			list.remove(3);
			System.out.println("Recorre la lista despues de eliminar el primero y el ultimo");
			for(Integer elm:list) {
				System.out.println(elm);
			}
			
			list.set(0, 100);
			System.out.println("Recorre la lista despues de modificar el primero");
			for(Integer elm:list) {
				System.out.println(elm);
			}
			
			List<Integer> lista2 = new ArrayList<Integer>();
			lista2.add(12);
			lista2.add(15);
			lista2.add(21);
			System.out.println("Dato en la posicion 0: " + lista2.get(0));
			System.out.println("Dato en la posicion 1: " + lista2.get(1));
			System.out.println("Dato en la posicion 2: " + lista2.get(2));
			lista2.add(1, 13);
			lista2.add(3, 16);
			System.out.println("Dato en la posicion 0: " + lista2.get(0));
			System.out.println("Dato en la posicion 1: " + lista2.get(1));
			System.out.println("Dato en la posicion 2: " + lista2.get(2));
			System.out.println("Dato en la posicion 3: " + lista2.get(3));
			System.out.println("Dato en la posicion 4: " + lista2.get(4));
			
			System.out.println("Recorre la lista: ");
			for(int i = 0; i < lista2.size(); i++) {
				System.out.println("Elemento " + i + ": " + lista2.get(i));
			}
			
			System.out.println("Recorre la lista utilizando uniterador");
			for(Integer elm:lista2) {
				System.out.println(elm);
			}
			
			lista2.remove(0);
			lista2.remove(3);
			System.out.println("Recorre la lista despues de eliminar el primero y el ultimo");
			for(Integer elm:lista2) {
				System.out.println(elm);
			}
			
			lista2.set(0, 100);
			System.out.println("Recorre la lista despues de modificar el primero");
			for(Integer elm:lista2) {
				System.out.println(elm);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
