/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 * Clase Espectador para indicar una persona que mira una película en un cine
 * @author josea
 */
public class Espectador {

    
    
    // Atributos del espectador
    private String nombre;
    private int edad;
    private double dinero;
    private Asiento asiento;// = new Asiento();
           
    /**
     * Construcor por default
     */
    public Espectador(){
        nombre="Nombre no introducido";
        edad=0;
        dinero=0;   
        asiento=null;
    }
    
    /**
     * Constructor especifico
     * @param n Indica el nombre del espectador
     * @param e Indica la edad del espectador
     * @param d Indica el dinero del espectador
     */
    public Espectador(String n, int e, double d){
        nombre=n;
        edad=e;
        dinero=d;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = new Asiento(asiento.getFila(), asiento.getColumna());
    }
    
    public void setAsiento(int fila, char columna) {
        this.asiento = new Asiento(fila, columna);
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    /**
     * Genera un espectador aleatoriamente
     * @return 
     */
    public static Espectador GenerarEspectador(){
        
        Random rnd = new Random();
        String[] nombres = {"Antonio", "Jesus", "Marcos", "Daniel", "Jose", "Eluney",
            "Angel", "Salma", "Salvador", "Josue", "German", "Oswaldo",
            "Roberto"};
        
        return new Espectador(
                nombres[rnd.nextInt(nombres.length)], 10 + rnd.nextInt(81), 
                (rnd.nextInt(1000 - 40) + 40));
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", asiento=" + asiento + '}'+"\n";
    } 
    
}
