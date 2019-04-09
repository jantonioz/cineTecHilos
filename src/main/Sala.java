/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 * Clase Sala contiene un arreglo de asientos, otro de espectadores
 * @author josea
 */
public class Sala {
    
    private Asiento[][] asientos;
    private Asiento[] asientosRnd;
    private int nAsiento;
    /**
     * Construcor simple para una Sala
     * Genera un arreglo de asientos con medida especificada de 8X9
     * Genera un vector con los elementos del arreglo de asientos de forma desordenada
     * Con este vector se asegura de no insertar Espectadores en un mismo asiento
     */
    public Sala() {
        asientos = new Asiento[8][9];
        asientosRnd = new Asiento[72];
        nAsiento = 0;
        Random rnd = new Random();
        String[] nombres = {"Antonio", "Jesus", "Marcos", "Daniel", "Jose", "Eluney",
            "Angel", "Salma", "Salvador", "Josue", "German", "Oswaldo",
            "Roberto"};
        int[] edades = new int[86];
        
        int k = 0;
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {
                Asiento asiento = new Asiento(i + 1, Asiento.columna(j + 1));
                asientos[i][j] = asiento;
                asientosRnd[k++] = asiento;
                //System.out.print(asientos[i][j] + " ");
            }
            //System.out.println("");
        }
        
        //Desordenar xd
        for (int i = 0; i < asientosRnd.length; i++) {
            Asiento aux = new Asiento(asientosRnd[i]);
            int j = rnd.nextInt(asientosRnd.length);
            asientosRnd[i] = asientosRnd[j];
            asientosRnd[j] = aux;
        }
        
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    
    /**
     * Inserta un asiento al objeto espectador, según el proximo asiento disponible del vector asientosRnd
     * @param e Objeto donde se va a insertar el proximo asiento disponible
     */
    public void insertNext(Espectador e){
        asientosRnd[nAsiento].setOcupado(true);
        e.setAsiento(asientosRnd[nAsiento++]);
        
        // ESTABLECER OCUPADO
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < asientosRnd.length; k++) {
                    if (asientosRnd[k].isOcupado() && asientos[i][j].getFila() == asientosRnd[k].getFila()
                            && asientos[i][j].getColumna() == asientosRnd[k].getColumna()
                            ){
                        asientos[i][j].setOcupado(true);
                    }
                }
            }
        }
    }
    /**
     * Retorna true si la sala tiene espacio suficiente
     * Retorna falso si la sala no cuenta con más espacio
     * @return 
     */
    public boolean hayEspacio(){
        return nAsiento <= asientosRnd.length;
    }
    
    /**
     * Imprime la sala completa indicando si está ocupada o no
     */
    public void Print(){
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {
                if (!asientos[i][j].isOcupado())System.out.print(asientos[i][j] + " ");
                else System.out.print("XX ");
            }
            System.out.println("");
        }
    }

}