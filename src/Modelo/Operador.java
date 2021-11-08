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
public class Operador extends Obrero{
    
    private String Id;
    private LinkedList<Maquinaria> maquinas;

    public Operador(String Id, LinkedList<Maquinaria> maquinas, String direccion, String telefono, String cedula, String nacionalidad, double horasExtra, double salario) {
        super(direccion, telefono, cedula, nacionalidad, horasExtra, salario);
        this.Id = Id;
        this.maquinas = maquinas;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public LinkedList<Maquinaria> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(LinkedList<Maquinaria> maquinas) {
        this.maquinas = maquinas;
    }
    
}
