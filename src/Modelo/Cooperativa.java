/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author legion
 */
public class Cooperativa {

    private LinkedList<Obrero> obreros;
    private LinkedList<Maquinaria> maquinas;

    public Cooperativa(LinkedList<Obrero> obreros, LinkedList<Maquinaria> maquinas) {
        this.obreros = obreros;
        this.maquinas = maquinas;
    }

    public Cooperativa() {
        this.obreros = new LinkedList<>();
        this.maquinas = new LinkedList<>();
    }

    public LinkedList<Obrero> getObreros() {
        return obreros;
    }

    public void setObreros(LinkedList<Obrero> obreros) {
        this.obreros = obreros;
    }

    public LinkedList<Maquinaria> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(LinkedList<Maquinaria> maquinas) {
        this.maquinas = maquinas;
    }

    public double costoPromedioMaquinarias() {
        double promedio = 0;
        for (Maquinaria maquina : maquinas) {
            promedio += maquina.getCostoMaquinaria();
        }
        return promedio;
    }

    public LinkedList<Agricultor> agricultores() {

        LinkedList<Agricultor> agricultores = new LinkedList<>();

        for (Obrero obrero : obreros) {
            if (obrero.getClass().getSimpleName().equals("Agricultor")) {
                if (obrero.getNacionalidad().equals("ecuatoriana") || obrero.getNacionalidad().equals("peruana")) {
                    Agricultor agricultor = (Agricultor) obrero;
                    if (agricultor.isRelacionDependencia()) {
                        agricultores.add(agricultor);
                    }
                }
            }

        }

        return agricultores;
    }

    public LinkedList<Administrativo> devuelveAdministratvos() {

        LinkedList<Administrativo> adminitrativos = new LinkedList<>();

        for (Obrero obrero : obreros) {
            if (obrero.getClass().getSimpleName().equals("Administrativo")) {
                if (obrero.getSalario() > 2000) {
                    Administrativo administrativo = (Administrativo) obrero;
                    if (administrativo.getOperadores().size() <= 5 && administrativo.getOperadores().size() > 0) {
                        for (Operador operador : administrativo.getOperadores()) {
                            if (operador.getHorasExtra() <= 200) {
                                adminitrativos.add(administrativo);
                            }
                        }
                    }
                }
            }
        }

        return adminitrativos;
    }

    public LinkedList<Double> devuelveSalarios() {
        LinkedList<Double> salarios = new LinkedList<>();
        double salarioAdinistrativos = 0;
        double salarioOperaradores = 0;
        double salarioAgricultores = 0;

        for (Obrero obrero : obreros) {
            if (obrero.getClass().getSimpleName().equals("Administrativo")) {
                salarioAdinistrativos += obrero.getSalario();
            }
            if (obrero.getClass().getSimpleName().equals("Operador")) {
                salarioOperaradores += obrero.getSalario();
            }
            if (obrero.getClass().getSimpleName().equals("Agricultor")) {
                salarioAgricultores += obrero.getSalario();
            }
        }
        salarios.add(salarioAgricultores);
        salarios.add(salarioOperaradores);
        salarios.add(salarioAdinistrativos);

        return salarios;
    }

    public LinkedList<Obrero> getAdministrador() {
        LinkedList<Obrero> retorno = new LinkedList<>();
        System.out.println("Grabando");
        for (Obrero o : obreros) {
            if (o.getClass().getSimpleName().equals("Administrativo")) {
                retorno.add(o);
            }
        }
        System.out.println("getAdministrador" + retorno);
        return retorno;
    }

    public void addObrero(Obrero o) {
        System.out.println("ENTRO PRINCIPAL" + o);
        obreros.add(o);
    }

    public void setPushObrero(LinkedList<Obrero> ob) {
        for (Obrero o : ob) {
            this.obreros.add(o);
        }
    }

    public void prueba() {
        System.out.println("ESTO es una prueba");
    }

    public void ImpresionCuentasBanco() {
        System.out.println("----> Imprimiendo cuentas ");
        for (Obrero o : obreros) {
            System.out.println("Obrero" + o);
        }
        System.out.println("_-------------------------");
    }

    public void Ordenada() {
        Collections.sort(obreros, (Obrero p1, Obrero p2) -> new Double(p1.getSalario()).compareTo(new Double(p2.getSalario())));
        Collections.reverse(obreros);
        for (Obrero obrero : obreros) {
            System.out.println("");
        }
    }
}
