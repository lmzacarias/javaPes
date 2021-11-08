/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cooperativa;
import Modelo.Obrero;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author legion
 */
public class FileHandler {

    public void SaveAdministrativo(Cooperativa cooperativa) throws FileNotFoundException, IOException {
        ObjectOutputStream sv = new ObjectOutputStream(new FileOutputStream("administrativo.dat"));
        LinkedList<Obrero> componentes = cooperativa.getAdministrador();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }

    public LinkedList<Obrero> LoadObrero() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream load = new ObjectInputStream(new FileInputStream("administrativo.dat"));
        LinkedList<Obrero> componentes_cargados = (LinkedList<Obrero>) load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }

}
