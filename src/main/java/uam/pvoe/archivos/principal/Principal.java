/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos.principal;

import uam.pvoe.archivos.clases.Alumno;
import uam.pvoe.archivos.operaciones.Escritura;
import uam.pvoe.archivos.operaciones.Lectura;

/**
 *
 * @author pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno;
        //alumno = leerAlumno();
        //guardarAlumno(alumno);
        procesarArchivo();
    }
    
    /*public static Alumno leerAlumno(){
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(3);
        alumno.setNombre("Nombre Alumno 3");
        alumno.setLicenciatura("Licenciatura Alumno 3");
        
        return alumno;
    }*/
    
    public static void guardarAlumno(Alumno al){
        Escritura escritura = new Escritura();
        escritura.escribir("datosAlumnos.txt", al);
    }
    
    public static void procesarArchivo(){
        Lectura lectura = new Lectura();
        lectura.leer("datosAlumnos.txt");
    }
}
