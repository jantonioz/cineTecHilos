/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author josea
 */
public class Procesador {
    int SalaEnPausa = -1;

    synchronized int getSalaEnPausa() {
        return SalaEnPausa;
    }

    synchronized void setSalaEnPausa(int SalaEnPausa) {
        this.SalaEnPausa = SalaEnPausa;
    }
}
