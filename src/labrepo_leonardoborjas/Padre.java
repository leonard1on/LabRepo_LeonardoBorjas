/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrepo_leonardoborjas;

/**
 *
 * @author Leonardo Borjas
 */
public class Padre extends Hijo{
    private String trabajo;
    private String clasesocial;
    private String iq;
    private String carrera;
    private String estado;
    private String esposa;

    public Padre() {
    }

    public Padre(String trabajo, String clasesocial, String iq, String carrera, String estado, String esposa, String fechanacimiento, String apodo, String mara, String musica, String descripcion, String vidasexual, String nombre, String apellido, String genero, String raza, int altura, int edad) {
        super(fechanacimiento, apodo, mara, musica, descripcion, vidasexual, nombre, apellido, genero, raza, altura, edad);
        this.trabajo = trabajo;
        this.clasesocial = clasesocial;
        this.iq = iq;
        this.carrera = carrera;
        this.estado = estado;
        this.esposa = esposa;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getClasesocial() {
        return clasesocial;
    }

    public void setClasesocial(String clasesocial) {
        this.clasesocial = clasesocial;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEsposa() {
        return esposa;
    }

    public void setEsposa(String esposa) {
        this.esposa = esposa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
