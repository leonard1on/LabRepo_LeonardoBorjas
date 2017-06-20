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
public class Hijo extends Persona{
    private String fechanacimiento;
    private String apodo;
    private String mara;
    private String musica;
    private String descripcion;
    private String vidasexual;

    public Hijo() {
    }

    public Hijo(String fechanacimiento, String apodo, String mara, String musica, String descripcion, String vidasexual, String nombre, String apellido, String genero, String raza, int altura, int edad) {
        super(nombre, apellido, genero, raza, altura, edad);
        this.fechanacimiento = fechanacimiento;
        this.apodo = apodo;
        this.mara = mara;
        this.musica = musica;
        this.descripcion = descripcion;
        this.vidasexual = vidasexual;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getMara() {
        return mara;
    }

    public void setMara(String mara) {
        this.mara = mara;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVidasexual() {
        return vidasexual;
    }

    public void setVidasexual(String vidasexual) {
        this.vidasexual = vidasexual;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
