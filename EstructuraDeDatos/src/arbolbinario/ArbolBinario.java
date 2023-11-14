package arbolbinario;

public class ArbolBinario {

    protected Nodo raiz;
    public ArbolBinario(Nodo raiz){
       raiz=null; 
    }
    public Nodo getRaiz(){
        return raiz;
    }
    public void setRaiz(Nodo raiz){
        this.raiz=raiz;
    }
    //Implementacionrecursiva de los recorridos 
    /**
     * Invocaal metodo recursivo
     */
    public void preorden(){
        preorden(raiz);
    }
    /**
     * 
     * param aux
     */
    private void preorden(Nodo aux){
        if(aux!=null){
            visitar(aux);
            preorden(aux.getizquierdo());
            preorden(aux.getderecho());

        }
    }
    private void visitar(Nodo aux){
        System.out.println(aux.getValor()+" ");
    }
    /**
     * Invoca al metodo recursivo
     */
    public void inorden(){
        inorden(raiz);
    }
    /*
     * @param aux
     */
    private void inorden(Nodo aux){
        if (aux !=null) {
            inorden(aux.getizquierdo());
            visitar(aux);
            inorden(aux.getderecho());
        }
    }
    /**
     * Invoca al metodo recursivo
     */
    public void postorden(){
        postorden(raiz);
    }
    /**
     * 
     * @param aux referencia a un nodo
     */
    
     private void postorden(Nodo aux){
        if(aux!=null){
            postorden(aux.getizquierdo());
            postorden(aux.getderecho());
            visitar(aux);
        }
     }
     /**
      * Recorrido preorden version iterativa,utilizando una pila
      */

      public void preordenIterativo(){
        //usa la misma implementacion de pila de la unidad 
        //anterior
        pilas.Pila<Nodo> pila= new pilas.Pila<Nodo>();
        pila.apilar(raiz);
        while(!pila.esVacia()){
            Nodo aux=pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getderecho()!=null)
                pila.apilar(aux.getderecho());
            if(aux.getizquierdo()!=null)
                pila.apilar(aux.getizquierdo());
        }

      }

    /*
     * Recorrido inorden de la version iterativa, utilizando una
     */
    public void inordenIterativa(){
        pilas.Pila<Nodo> pila=new pilas.Pila<Nodo>();
        pila.apilar(raiz);
        Nodo aux=raiz.getizquierdo();
        while(aux !=null || !pila.esVacia()){
            if(aux!=null){
                pila.apilar(aux);
                aux= aux.getizquierdo();
            }else{
                aux=pila.cima();
                pila.retirar();
                visitar(aux);
                aux=aux.getderecho();
            }
        }
    }



}
