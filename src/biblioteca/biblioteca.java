package biblioteca;

import java.util.*;
import libro.Libro;
import sala.Sala;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private int horarioApertura;
    private int horarioCierre;
    private List<Libro> libros;
    private List<Sala> salas;

    public Biblioteca() {
        this.nombre = null;
        this.direccion = null;
        this.horarioApertura = 0;
        this.horarioCierre = 0;
        this.libros = new ArrayList<Libro>();
        this.salas = new ArrayList<Sala>();
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHorarioApertura() {
        return horarioApertura;
    }

    public int getHorarioCierre() {
        return horarioCierre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorarioApertura(int horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(int horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    // FUNCTIONS

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void removeLibro(Libro libro) {
        this.libros.remove(libro);
    }

    public void mostrarLibros() {
        if (this.libros == null || this.libros.size() == 0) {
            System.out.println("    No hay libros registrados.");
            return;
        }

        for (Libro libro : libros) {

            System.out.println("Nombre: " + libro.getTitulo() + ". \nEditorial: "
                    + libro.getEditorial()
                    + ". \nNúmero pags: " + libro.getNumPags() + ". \nAño: " + libro.getAno() + ". \nEditorial: "
                    + libro.getEditorial() + ". \nIdioma: " + libro.getIdioma() + ". \nCantidad disponible: "
                    + libro.getCantidad() + ". \nISBN: " + libro.getIsbn() + ".");
        }
    }

    public String mostrarLibroPorTitulo(String titulo) {
        if (this.libros == null || this.libros.size() == 0) {
            System.out.println("    No hay libros registrados.");
            return null;
        }

        for (Libro libro : libros) {
            if (libro.getTitulo().contains(titulo)) {
                System.out.println("Nombre: " + libro.getTitulo());
                return libro.getTitulo();
            }
        }

        System.out.println("\nNo se ha encontrado ningún libro con ese título.");
        return null;
    }

    // for (int i = 0; i < libros.size(); i++) {
    // Libro libro = libros.get(i);

    // System.out.println((i + 1) + "." + ". Nombre: " + libro.getTitulo() + ".
    // \nEditorial: " + libro.getEditorial()
    // + ". \nNúmero pags: " + libro.getNumPags() + ". \nAño: " + libro.getAno() +
    // ". \nEditorial: "
    // + libro.getEditorial() + ". \nIdioma: " + libro.getIdioma() + ". \nCantidad
    // disponible: "
    // + libro.getCantidad() + ". \nISBN: " + libro.getIsbn() + ".");

    // }

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }

    public void removeSala(Sala sala) {
        this.salas.remove(sala);
    }

    public void mostrarSalas() {
        if (this.salas == null || this.salas.size() == 0) {
            System.out.println("    No hay salas registradas.");
            return;
        }

        for (Sala sala : salas) {
            System.out.println("Nombre: " + sala.getNombre() + ". \nTipo: " + sala.getTipo() + ". \nCapacidad: "
                    + sala.getCapacidad() + ". \nPersonas en sala: " + sala.getPersonas());

        }
    }

    public void mostrarPersonasSalas() {
        int totalPersonas = 0;
        for (Sala sala : salas) {
            totalPersonas = totalPersonas + sala.getPersonas().size();
        }
    }

    public void mostrarSalasDisponibles() {
        for (Sala sala : salas) {
            if (sala.getPersonas().size() == 0) {
                sala.información();
            }
        }
    }

    public void estaAbierta(int hora) {
        if (hora > horarioApertura && hora < horarioCierre) {
            System.out.println("    ¿Está abierta?       -  Sí");
        } else {
            System.out.println("    ¿Está abierta?       -  No");
        }
    }

    public void mostrarBiblioteca() {
        System.out.println("-------------------------- -------------------------");
        System.out.println("    Biblioteca           -  " + this.nombre + " - " + this.direccion);
        System.out.println("    Abierto de           -  " + this.horarioApertura + " a " + horarioCierre);
        mostrarLibros();
        mostrarSalas();
    }
}