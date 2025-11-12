package persona;

public class Persona {

    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;
    private String dni;
    private String email;
    private String tlf;
    private String profesion;
    private int añosExperiencia;

    public Persona() {
        this.nombre = null;
        this.apellidos = null;
        this.edad = 0;
        this.dni = null;
        this.direccion = null;
        this.email = null;
        this.tlf = null;
        this.profesion = null;
        this.añosExperiencia = 0;
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public String getTlf() {
        return this.tlf;
    }

    public int getAñosExperiencia() {
        return this.añosExperiencia;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    // CONDICIONAL estaJubilado

    public void estaJubilado() {
        if (edad >= 67) {
            System.out.println("    ¿Está jubilado?      -  Sí");
        } else {
            System.out.println("    ¿Está jubilado?      -  Sí");
        }

    }

    // MOSTRAR INFORMACIÓN DEL OBJETO

    public void mostrarInformación() {
        System.out.println("-------------------------- -------------------------");
        System.out.println("    Nombre               -  " + this.nombre);
        System.out.println("    Apellidos            -  " + this.apellidos);
        System.out.println("    Edad                 -  " + this.edad);
        System.out.println("    DNI                  -  " + this.dni);
        System.out.println("    Dirección            -  " + this.direccion);
        System.out.println("    Email                -  " + this.email);
        System.out.println("    Teléfono             -  " + this.tlf);
        System.out.println("    Profesión            -  " + this.profesion);
        System.out.println("    Año/s de experiencia -  " + this.añosExperiencia);
    }

}
