package hashTable;
import java.util.Hashtable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;;

public class HashTable2<T> {
    private Hashtable<String,LinkedList<T>> tabla;
    private Vector<String> claves;
    public void put(String key, T elm){
        LinkedList<T>lst=tabla.get(key);
        if(lst==null){
            lst=new LinkedList<T>();
        }
    }

}
