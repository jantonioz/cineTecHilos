/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase Asiento indica un asiento dentro de una sala, con número y columna
 * @author josea
 */
public class Asiento {
    private char columna;
    private int fila;
    private boolean ocupado;
    
    /**
     * Constructor especifico para un Asiento
     * @param f Fila del asiento
     * @param c Columna del asiento
     */
    public Asiento(int f, char c){
        columna = c;
        fila = f;
        ocupado = false;
    }
    
    /**
     * Constructor de copia
     * @param asiento Objeto a copiar
     */
    public Asiento(Asiento asiento){
        columna = asiento.getColumna();
        fila = asiento.getFila();
        ocupado = false;
    }
    
    public char getColumna(){
        return columna;
    }
    
    public int getFila(){
        return fila;
    }
    
    public boolean isOcupado(){
        return ocupado;
    }
    
    public void setOcupado(boolean o){
        ocupado = o;
    }
    
    
    /**
     * Convierte un entero al equivalente en columa de la sala de un cine
     * @param n entero indicando el numero de columna
     * @return 
     */
    public static char columna(int n){
        return n >= 1 && n <= 9 ? (char)(n + 'A' - 1) : (char) 0;
    }
    
    @Override
    public String toString(){
        return "" + fila + columna;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.columna;
        hash = 59 * hash + this.fila;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asiento other = (Asiento) obj;
        if (this.columna != other.columna) {
            return false;
        }
        if (this.fila != other.fila) {
            return false;
        }
        return true;
    }
    
    
}