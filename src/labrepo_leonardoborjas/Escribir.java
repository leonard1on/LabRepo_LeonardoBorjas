/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrepo_leonardoborjas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Leonardo Borjas
 */
public class Escribir {

    private File archivo = null;
    private DefaultTreeModel m;

    public Escribir(DefaultTreeModel m, File archivo) {
        this.m = m;
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public DefaultTreeModel getM() {
        return m;
    }

    public void setM(DefaultTreeModel m) {
        this.m = m;
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(m);
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void cargarArchivo(JTree arbol) {
        try {
            DefaultTreeModel temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                DefaultTreeModel m=(DefaultTreeModel)objeto.readObject();
                arbol.setModel(m);
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
}
