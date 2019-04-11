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
    // ARREGLO DE SALAS (3 salas)
    private Sala[] salas;
    private float precio;

    public Cine() {
    }
    
    
    /**
     * Constructor simple
     * @param precio precio general para cada pelicula en el cine
     */
    public Cine(float precio){
        this.peliculas = new Pelicula[]{new Pelicula("Capitana Marvel", 125, 13, "Anna Boden, Ryan Fleck")};
        this.salas = new Sala[]{new Sala(), new Sala(), new Sala()};
        this.precio = precio;
    }
    
    public void iniciarSalas(){
        if (salas.length <= 0)
            return;
    
        salas[0].start();
        salas[1].start();
        salas[2].start();
    }
    
    public void iniciarSala(int idx){
        salas[idx].start();
    }
    
    
    /**
     * Constructro completo
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
        for (Sala sala : salas)
            str += "CineTecLaguna Nombre: " + peliculas + ", Sala: " + sala + ", Precio: $" + precio + "\n";
        
        return str;  
    }

    /**
     * Imprime la sala completa, marcando con "XX" los asientos que no están disponible (están ocupados)
     */
    void imprimeSala() {
        for (Sala sala : salas)
            sala.Print();
    }

}
