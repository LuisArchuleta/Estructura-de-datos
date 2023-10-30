package colas;

public class Estudiante {
    private int ID;
    private String nombres;
    private String apellidos;

    // Constructor
    public Estudiante(int ID, String nombres, String apellidos) {
        this.ID = ID;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    // Métodos de acceso para ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Métodos de acceso para nombres
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    // Métodos de acceso para apellidos
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
   
    public String toString() {
    return "ID: " + ID + ", Nombres: " + nombres + ", Apellidos: " + apellidos;
    }
}