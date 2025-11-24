package sala;

import persona.*;
import java.util.*;

public class Sala {

    private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponibleReserva;
    private List<Persona> personas;

    public Sala() {
        this.nombre = null;
        this.capacidad = 0;
        this.pizarra = false;
        this.tipo = null;
        this.disponibleReserva = false;
        this.personas = new ArrayList<Persona>();
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPizarra(boolean pizarra) {
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo) {
        if (!tipo.equalsIgnoreCase("estudio") && !tipo.equalsIgnoreCase("lectura")
                && !tipo.equalsIgnoreCase("infantil")) {
            this.tipo = ("El tipo no es válido");
        } else {
            this.tipo = tipo;
        }
    }

    public void setDisponibleReserva(boolean disponibleReserva) {
        this.disponibleReserva = disponibleReserva;
    }

    // FUNCTIONS

    public void entrarPersona(Persona p) {
        if (personas.size() < this.capacidad) {
            personas.add(p);
        } else {
            System.out.println("\nLa sala ya está llena.");
        }
    }

    public void salirPersona(Persona p) {
        personas.remove(p);
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            persona.mostrarInformación();
        }
    }

    public void estaDisponible() {
        if (!this.disponibleReserva) {
            System.out.println("    Disponibilidad       -  No está disponible para reservar");
        } else {
            System.out.println("    Disponibilidad       -  Está disponible para reservar");
        }
    }

    public void tienePizarra() {
        if (!this.pizarra) {
            System.out.println("    Pizarra              -  La sala no tiene pizarra");
        } else {
            System.out.println("    Pizarra              -  La sala tiene pizarra");
        }
    }

    public void información() {
        System.out.println("-------------------------- -------------------------");
        System.out.println("    Sala                 -  " + this.nombre + " - " + this.capacidad + " personas");
        System.out.println("    Tipo                 -  " + this.tipo);
    }
}
