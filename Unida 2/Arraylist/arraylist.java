package Arraylist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Comprobar el uso de la clase linkedlist y array list

public class DemoLinkedList{

    public static void main (String[]args){
        try{
            List<Integer> list = new LinkedList<Integer>();
            System.out.println("Linked List");
            list.add(12);
            list.add(15);
            list.add(23);
            
            System.out.println("Elemento 1: "+list.get(0));
            System.out.println("Elemento 2: "+list.get(1));
            System.out.println("Elemento 3: "+list.get(2));

            list.add(1,21);
            list.add(1,56);

            System.out.println("Elemento 1: "+list.get(0));
            System.out.println("Elemento 2: "+list.get(1));
            System.out.println("Elemento 3: "+list.get(3));
            System.out.println("Elemento 4: "+list.get(4));
           
            System.out.println("Recorro la lista :)))");
            System.out.println("");
            //Incrementa cada vez lalista en uno
            for(int i=0; i<list.size();i++){
                System.out.println("Elemento: "+i+":"+list.get(i));
            }
            System.out.println("");
            System.out.println("Recorriendo la lista utilizando literador ");
            for(Integer elm:list){
                System.out.println(elm);
            }
            list.remove(0);
            list.remove(3);

             System.out.println("");
            System.out.println("recorre despues de eliminar el primero y el utlimo:");
            for(Integer elm:list){
                System.out.println(elm);
            }

            list.set(0, 100);
            System.out.println("");
            System.out.println("recorre despues de Modificar el primero :");
            for(Integer elm:list){
                System.out.println(elm);
            }

            List<Integer> lista2 =new ArrayList<Integer>();
            

            list.add(12);
            list.add(15);
            list.add(33);

            System.out.println("Elemento 1: "+lista2.get(0));
            System.out.println("Elemento 2: "+lista2.get(1));
            System.out.println("Elemento 3: "+lista2.get(2));

            lista2.add(1,21);
            lista2.add(1,56);

            for(int i=0; i<lista2.size();i++){
                System.out.println("Elemento: "+i+":"+lista2.get(i));
            }
            lista2.remove(0);
            lista2.remove(2);

            System.out.println("");
            System.out.println("recorre despues de eliminar el primero y el utlimo:");
            for(Integer elm:lista2){
                System.out.println(elm);
            }
            lista2.set(0, 100);
            for(Integer elm :lista2){
                System.out.println(elm);         
            }


            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}