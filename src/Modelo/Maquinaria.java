/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author legion
 */
public class Maquinaria implements Serializable {
    private int nSerie;
    private double costoMaquinaria;
    private int añosUso;

     public Maquinaria(int nSerie, double costoMaquinaria, int añosUso) {
        this.nSerie = nSerie;
        this.costoMaquinaria = costoMaquinaria;
        this.añosUso = añosUso;
    }
    
    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public double getCostoMaquinaria() {
        return costoMaquinaria;
    }

    public void setCostoMaquinaria(double costoMaquinaria) {
        this.costoMaquinaria = costoMaquinaria;
    }

    public int getAñosUso() {
        return añosUso;
    }

    public void setAñosUso(int añosUso) {
        this.añosUso = añosUso;
    }
    
}
