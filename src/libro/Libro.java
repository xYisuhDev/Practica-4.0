package libro;

public class Libro {

    /*
     * DECLARACION DE ATRIBUTOS DEL OBJETO
     */

    private String titulo;
    private String isbn;
    private String editorial;
    private String idioma;
    private int numPags;
    private int ano;
    private int cantidad;
    private String msgEstaDisponible;

    /*
     * DECLARACION DEL CONSTRUCTOR
     */

    public Libro() {
        this.titulo = null;
        this.isbn = null;
        this.editorial = null;
        this.idioma = null;
        this.numPags = 0;
        this.ano = 0;
        this.cantidad = 0;
        this.msgEstaDisponible = null;
    }

    // GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getNumPags() {
        return numPags;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getAno() {
        return ano;
    }

    public boolean getDisponibleReserva() {
        if (this.cantidad != 0) {
            return true;
        } else {
            return false;
        }
    }

    // SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void estaDisponible() {
        if (this.getDisponibleReserva() == false) {
            System.out.println("    ¿Está disponible?    -  No");
        } else {
            System.out.println("    ¿Está disponible?    -  Sí");
        }
    }

    public void esExtranjero() {
        if (this.idioma != "ES") {
            System.out.println("    ¿Es extranjero?               -  Sí");
        } else {
            System.out.println("    ¿Es extranjero?               -  No");
        }
    }

    public void información() {
        System.out.println("-------------------------- -------------------------");
        System.out
                .println("    Libro:               -  " + this.titulo + " - " + this.editorial + " (" + this.ano + ")");
        System.out.println("    Idioma               -  " + this.idioma);
        System.out.println("    Número de páginas    -  " + this.numPags);
        System.out.println("    Disponibilidad       -  " + this.msgEstaDisponible);
    }

}
