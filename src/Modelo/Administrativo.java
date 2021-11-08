/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author legion
 */
public class Administrativo extends Obrero {

    private int cantidadSanciones;
    private LinkedList<Operador> operadores;

    public Administrativo(int cantidadSanciones,
            LinkedList<Operador> operadores,
            String direccion, String telefono,
            String cedula, String nacionalidad,
            double horasExtra,
            double salario) {
        super(direccion, telefono, cedula, nacionalidad, horasExtra, salario);
        this.cantidadSanciones = cantidadSanciones;
        this.operadores = operadores;
    }

    public int getCantidadSanciones() {
        return cantidadSanciones;
    }

    public void setCantidadSanciones(int cantidadSanciones) {
        this.cantidadSanciones = cantidadSanciones;
    }

    public LinkedList<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(LinkedList<Operador> operadores) {
        this.operadores = operadores;
    }

}
