/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos.clases;

/**
 *
 * @author pedro
 */
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String licenciatura;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = idAlumno + " " + nombre + " " + licenciatura;
        return cadena;
    }
    
    
}
