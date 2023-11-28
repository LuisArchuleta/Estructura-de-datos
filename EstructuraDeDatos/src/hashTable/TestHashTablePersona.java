package hashTable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

public class TestHashTablePersona {
    public static void main(String[] args) {
        HashTable2<Persona> ht= new HashTable2<Persona>();

        Persona p1= new Persona("Pablo",33,"Argentina");
        Persona p2= new Persona("Juan",25,"Mexicano");
        Persona p3= new Persona("Pedro",18,"Español");
        Persona p4= new Persona("Pablo",33,"Italiano");
        Persona p5= new Persona("Pablo",25,"Cubano");
        Persona p6= new Persona("Juan",18,"Frances");

        //creamos la tabla Hash
        Hashtable<String,Persona> tabla= new Hashtable<String,Persona>();
        //Agregar las personas a la tabla tomando su nombre como clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);
        tabla.put(p1.getNombre(),p4);
        tabla.put(p2.getNombre(),p5);
        tabla.put(p3.getNombre(),p6);

        LinkedList<Persona> conjunto=ht.get("Pablo");
        for(Persona i:conjunto){
            System.out.println(i);
        }
          LinkedList<Persona> conjunto2=ht.get("");
        for(Persona i:conjunto){
            System.out.println(i);
        }
          LinkedList<Persona> conjunto3=ht.get("Pablo");
        for(Persona i:conjunto){
            System.out.println(i);
        }

        Collection <String> keys=ht.keys();
        for(String k:keys){
            System.out.println(k);
        }
        System.out.println("*******");
        String aux;
        Enumeration<String> llave = ht.llave();
        while(llave.hasMoreElements()){
            aux= llave.nextElement();
            System.out.println(aux+" = "+ht.get(aux));
        }



    }
}
