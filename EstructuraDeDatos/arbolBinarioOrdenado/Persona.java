package EstructuraDeDatos.arbolBinarioOrdenado;

public class Persona implements Comparable {
    private int id;
    private String nombre;
    public Persona(int dato){
        super();
        this.id=id;
        this.nombre=nombre;
    }
  
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean esIgual(Object q){
        Persona per= (Persona)q;
        return (this.id==per.getId());
    }
    public boolean esMenor(Object q ){
        Persona per= (Persona)q;
        return (this.id<per.getId());
    }
    public boolean esMayor(Object q ){
        Persona per=(Persona)q;
        return(this.id>per.getId());
    }

    
    
}
