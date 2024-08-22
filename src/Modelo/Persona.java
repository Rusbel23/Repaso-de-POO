package Modelo;
public class Persona {
    private long Id;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Edad = edad;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
    public  String Caminar() {
        return "Persona";
    }
    public int Edad(int edad){
        return edad;

    }
}

