/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase Cine controla las Salas y Peliculas
 * @author josea
 */
public class Cine {

    private Pelicula[] peliculas;
    private Sala sala;
    private float precio;

    public Cine() {
    }
    
    
    /**
     * Constructor simple
     * @param precio precio general para cada pelicula en el cine
     */
    public Cine(float precio){
        this.peliculas = new Pelicula[]{new Pelicula("Capitana Marvel", 125, 13, "Anna Boden, Ryan Fleck")};
        this.sala = new Sala();
        this.precio = precio;
    }
    
    
    /**
     * Constructro completo
     * @param peliculas Arreglo de peliculas disponibles en el cine
     * @param sala Objeto sala donde se proyectan peliculas 
     * @param precio Precio de cualquier función en el cine
     */
    public Cine(Pelicula[] peliculas, Sala sala, float precio) {
        this.peliculas = peliculas;
        this.sala = sala;
        this.precio = precio;
    }

    
    /**
     * Inserta un espectador en un asiento aleatorio
     * @param e Espectador a insertar
     */
    public void insertarEspectador(Espectador e) {

        if (e.getDinero() >= precio && e.getEdad() >= peliculas[0].getEdad()
                && sala.hayEspacio()) {

            e.setDinero(e.getDinero() - precio);
            sala.insertNext(e);

        }
    }
    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CineTecLaguna Nombre: " + peliculas + ", Sala: " + sala + ", Precio: $" + precio;
    }

    /**
     * Imprime la sala completa, marcando con "XX" los asientos que no están disponible (están ocupados)
     */
    void imprimeSala() {
        sala.Print();
    }

}