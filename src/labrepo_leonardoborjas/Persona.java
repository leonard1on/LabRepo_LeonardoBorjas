/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrepo_leonardoborjas;

import java.io.Serializable;

/**
 *
 * @author Leonardo Borjas
 */
public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private String genero;
    private String raza;
    private int altura;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String genero, String raza, int altura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.raza = raza;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
     
}
