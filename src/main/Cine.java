/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase Cine controla las Salas y Peliculas
 *
 * @author josea
 */
public class Cine {

    private Pelicula[] peliculas;
    // ARREGLO DE SALAS (3 salas)
    private Sala[] salas;
    private float precio;
    private Procesador proc;

    public Cine() {
    }

    /**
     * Constructor simple
     *
     * @param precio precio general para cada pelicula en el cine
     */
    public Cine(float precio) {
        this.peliculas = new Pelicula[]{
            new Pelicula("Capitana Marvel", 100, 13, "Anna Boden, Ryan Fleck"),
            new Pelicula("Batman V Superman", 110, 13, ""),
            new Pelicula("Antman & The Wasp", 80, 13, ""),
            new Pelicula("Avengers Endgame", 125, 17, ""),
            new Pelicula("Deadpool 2", 120, 18, ""),
            new Pelicula("Avengers Infinity war", 130, 13, "")
        };
        proc = new Procesador();
        this.salas = new Sala[]{
            new Sala(peliculas, 0, proc),
            new Sala(peliculas, 1, proc),
            new Sala(peliculas, 2, proc)};
        this.precio = precio;
    }

    public boolean pararSala(int idSala) {
        if (proc.getSalaEnPausa() == idSala) {
            return false; // INDICA QUE YA ESTABA PAUSADA
        }
        proc.setSalaEnPausa(idSala);
        return true; // PAUSÓ EFECTIVAMENTE LA SALA
    }

    public void quitarPausaSiEstaPausado(int idSala) {
        if (proc.getSalaEnPausa() == idSala) {
            proc.setSalaEnPausa(-1);
            salas[idSala].avisarQueContinueLaSala();
        }
    }

    public void iniciarSalas() {
        if (salas.length <= 0) {
            return;
        }

        salas[0].start();
        salas[1].start();
        salas[2].start();
    }

    public void iniciarSala(int idx) {
        salas[idx].start();
    }

    /**
     * Constructro completo
     *
     * @param peliculas Arreglo de peliculas disponibles en el cine
     * @param sala Objeto sala donde se proyectan peliculas
     * @param precio Precio de cualquier función en el cine
     */
    public Cine(Pelicula[] peliculas, Sala[] salas, float precio) {
        this.peliculas = peliculas;
        this.salas = salas;
        this.precio = precio;
    }

    /**
     * Inserta un espectador en un asiento aleatorio
     *
     * @param e Espectador a insertar
     */
    public void insertarEspectador(Espectador e, int sala) {

        if (e.getDinero() >= precio && e.getEdad() >= peliculas[0].getEdad()
                && salas[sala].hayEspacio()) {

            e.setDinero(e.getDinero() - precio);
            salas[sala].insertNext(e);

        }
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public Sala getSala(int sala) {
        return salas[sala];
    }

    public void setSala(Sala sala, int idx) {
        this.salas[idx] = sala;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String str = "";
        for (Sala sala : salas) {
            str += "CineTecLaguna Nombre: " + peliculas + ", Sala: " + sala + ", Precio: $" + precio + "\n";
        }

        return str;
    }

    /**
     * Imprime la sala completa, marcando con "XX" los asientos que no están
     * disponible (están ocupados)
     */
    void imprimeSala() {
        for (Sala sala : salas) {
            sala.Print();
        }
    }

}
