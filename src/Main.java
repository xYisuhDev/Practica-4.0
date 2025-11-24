import java.time.LocalTime;

import biblioteca.Biblioteca;
import libro.Libro;
import persona.Persona;
import sala.Sala;

public class Main {
    public static void main(String[] args) {

        int hora = LocalTime.now().getHour();
        Persona p1 = new Persona();
        Libro l1 = new Libro();
        Biblioteca b1 = new Biblioteca();
        Sala s1 = new Sala();

        p1.setNombre("Jesús");
        p1.setApellidos("Palma González");
        p1.setEdad(17);
        p1.setDni("12345678X");
        p1.setDireccion("Bulería, 34");
        p1.setEmail("jpalgon397@g.educaand.es");
        p1.setTlf("+34 123 45 67 89");
        p1.setProfesion("Back-End Developer");
        p1.setAñosExperiencia(0);

        p1.mostrarInformación();
        p1.estaJubilado();

        l1.setIsbn("9788498386332");
        l1.setTitulo("Harry Potter y el prisionero de Azkaban");
        l1.setEditorial("Salamandra");
        l1.setAno(2015);
        l1.setIdioma("ES");
        l1.setNumPags(360);
        l1.setCantidad((int) (Math.random() * 2));
        l1.estaDisponible();
        l1.información();

        b1.setNombre("Biblioteca Pública Municipal 'Ráfael Esteban Poullet'");
        b1.setDireccion("C/ Virgen de Los Milagros, 89");
        b1.setHorarioApertura(9);
        b1.setHorarioCierre(20);
        b1.mostrarBiblioteca();
        b1.estaAbierta(hora);
        b1.addLibro(l1);
        System.out.println("\nLibros registrados en la biblioteca: ");
        b1.mostrarLibros();
        System.out.println("");

        s1.setNombre("1ºB");
        s1.setTipo("");
        s1.setCapacidad(hora);
        s1.setPizarra(false);
        s1.setDisponibleReserva(false);

        s1.información();
        s1.estaDisponible();
        s1.tienePizarra();

        b1.addSala(s1);
        System.out.println("\nSalas registradas en la biblioteca: ");
        b1.mostrarSalas();
        System.out.println("");

        b1.mostrarLibroPorTitulo("Bridgerton");
        b1.mostrarLibroPorTitulo("Harry");

    }
}
