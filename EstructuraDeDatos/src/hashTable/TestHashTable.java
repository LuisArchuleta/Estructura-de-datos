package hashTable;
import java.util.Enumeration;
import java.util.Hashtable;
public class TestHashTable {
    public static void main(String[] args) {
        Persona p1= new Persona("Pablo",33,"Argentina");
        Persona p2= new Persona("Juan",25,"Mexicano");
        Persona p3= new Persona("Pedro",18,"Español");

        //creamos la tabla Hash
        Hashtable<String,Persona> tabla= new Hashtable<String,Persona>();
        //Agregar las personas a la tabla tomando su nombre como clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);

        //Acceso a cada elemento de la tabla
        System.out.println("Pablo");
        System.out.println("Juan");
        System.out.println("Pedro");

        System.out.println("Rolando");

        //*Obtener una enumeracion de las claves existentes en la tabla
        //La recorro y por cada una accedo al elemento asociado
        //mostrar clave= valor
        String aux;
        Enumeration<String> keys=tabla.keys();
        while (keys.hasMoreElements()) {
            aux=keys.nextElement();
            System.out.println(aux+"="+tabla.get(aux));
        }
    }
}
