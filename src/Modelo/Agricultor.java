/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author legion
 */
public class Agricultor extends Obrero {

    private int cantidadQuintales;
    private boolean relacionDependencia;

    public Agricultor(int cantidadQuintales, boolean relacionDependencia, String direccion, String telefono, String cedula, String nacionalidad, double horasExtra, double salario) {
        super(direccion, telefono, cedula, nacionalidad, horasExtra, salario);
        this.cantidadQuintales = cantidadQuintales;
        this.relacionDependencia = relacionDependencia;
    }

    public int getCantidadQuintales() {
        return cantidadQuintales;
    }

    public void setCantidadQuintales(int cantidadQuintales) {
        this.cantidadQuintales = cantidadQuintales;
    }

    public boolean isRelacionDependencia() {
        return relacionDependencia;
    }

    public void setRelacionDependencia(boolean relacionDependencia) {
        this.relacionDependencia = relacionDependencia;
    }

}
