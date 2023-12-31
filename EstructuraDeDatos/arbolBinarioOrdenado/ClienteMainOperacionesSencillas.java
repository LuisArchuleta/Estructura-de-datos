package EstructuraDeDatos.arbolBinarioOrdenado;

public class ClienteMainOperacionesSencillas {
    public static void main(String[] args){
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));

             System.out.println("Recorridos Recrusivos: ");
            System.out.println("PreOrden");
            arbol.preorden();
            System.out.println("\nIndorden");
            arbol.inorden();
            System.out.println("\nPostOrden");
            arbol.postorden();
            System.out.println("\nPor niveles");
            arbol.recorridoPorNiveles();
            System.out.println("");
            //Imprimir el arbol
            BTreePrinter.printNode(arbol.getRaiz());
            //buscar de forma iterativa un nodo del arbol
            Nodo aux=arbol.buscar(new Entero(30));
            if (aux==null)
                System.out.println("\n Dato no encontrado");
            else
                System.out.println("\n Se encontro el dato: "+aux.getValor());
            //busqueda recursiva
            aux=arbol.buscar(new Entero(15));
            if (aux==null)
                System.out.println("\n Dato no encontrado");
            else
                System.out.println("\n Se encontro el dato: "+aux.getValor());

            arbol.eliminar(new Entero(1));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.eliminar(new Entero(30));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(3));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.eliminar(new Entero(2));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.eliminar(new Entero(2));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.eliminar(new Entero(5));
            BTreePrinter.printNode(arbol.getRaiz());

            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(20));
            arbol.insertar(new Entero(18));
            arbol.insertar(new Entero(5));
            BTreePrinter.printNode(arbol.getRaiz());
            arbol.eliminar(new Entero(10));
            BTreePrinter.printNode(arbol.getRaiz());


        }catch(Exception e){
            System.out.println("Error: " +e.getMessage());
        }

       
    }
}
