/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase Pelicula, contiene datos generales 
 * sobre una pelicula, como el título, duracion y edad mínima
 * @author josea
 */
public class Pelicula{
    private String titulo;
    private int duracion; // base segundos
    private int edad;
    private String director;
    
    /**
     * Constructor por default para una película
     */
    public Pelicula() {
        this.titulo = "Desconocido";
        this.duracion = 0;
        this.edad = 0;
        this.director = "Desconocido";
    }
    /**
     * Constructor especifico para una película
     * @param titulo Cadena con el titulo de la película
     * @param duracion Entero para indicar al duracion de la película en segundos
     * @param edad Entero que indica la edad mínima para ver la película
     * @param director Nombre del director de la película
     */
    public Pelicula(String titulo, int duracion, int edad, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad = edad;
        this.director = director;
    }
    
    /**
     * Devuelve en la duración en formato HH:MM:SS
     * @param t
     * @return 
     */
    public String  Tiempo(int t){
        int hora;
        int min;
        int seg;
        int temp;
        hora=t/3600;
        temp = t%3600;
        min = temp/60;
        seg=temp%60;
        return hora+":"+min+":"+seg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public String Mostrar(){
        return "La pelicula "+this.titulo+"tiene una duracion de "+Tiempo(this.duracion)+" es para mayores de "+this.edad+" y es dirigida por el director "+this.director;
    }
}