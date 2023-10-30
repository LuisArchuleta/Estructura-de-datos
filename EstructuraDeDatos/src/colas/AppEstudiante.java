package colas;
public class AppEstudiante{

    public static void main(String[] args){
        Cola<Integer> cola = new Cola<Integer>();
        Estudiante estudiante1= new Estudiante(1, "Luis Enrique", "Archuleta Izabal");
        Estudiante estudiante2= new Estudiante(2, "Carlos Esteban", "Perez Paz");
        Estudiante estudiante3= new Estudiante(3, "Jesus Eduardo", "Lizarraga Valenzuela");
        cola.encolar(estudiante1.getID());
        cola.encolar(estudiante2.getID());
        cola.encolar(estudiante3.getID());
        while(!cola.esVacia()){
            for(i=){

            
            int i=0;
            System.out.println();
            cola.desencolar();
            }
        }
        System.out.println("La cola esta vacia");
    }
}