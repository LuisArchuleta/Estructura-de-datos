package listasDoblementeLigadas;
import java.util.LinkedList;
import java.util.List;
public class DemoLinkedListArrayList{
    public static void main(String[] args){
        try{
            List<Integer> list= new LinkedList<Integer>();
            list.add(12);
            list.add(15);
            list.add(21);
            System.out.println("Elemento 0: "+list.get(0));
            System.out.println("Elemento 1: "+list.get(1));
            System.out.println("Elemento 2: "+list.get(2));
            list.add(1,13);
            list.add(3,16);
            System.out.println("Elemento 0:"+list.get(0) );
            System.out.println("Elemento 0:"+list.get(1) );
            System.out.println("Elemento 0:"+list.get(2) );
            System.out.println("Elemento 0:"+list.get(3) );
            System.out.println("Elemento 0:"+list.get(4) );
            System.out.println("Recorreo la lista:");
            for(int i=0;i<list.size();i++){
                System.out.println("Elemento:"+i+":"+list.get(i));
            }
            System.out.println("Recorreo la lista utilizando iterador:");
            for(Integer elm:list){
                System.out.println(elm);
            }
            list.remove(0);
            list.remove(3);
            System.out.println("Recorreo despues de eliminar el primero y ultimo");
            for


        }
        catch(Exception e){
            e.sprintStackTrace();
        }
    }
}