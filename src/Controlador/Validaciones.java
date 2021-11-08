/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author legion
 */
public class Validaciones {
    
    public void validacionCostoMaquinaria(double costo) throws MisExcepciones {
        if (costo > 100000.0) {
            throw new MisExcepciones("El promedio es mayor a 100000");
        }
    }
    
}
