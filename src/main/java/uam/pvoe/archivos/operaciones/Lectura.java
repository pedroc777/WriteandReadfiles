/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.archivos.clases.Alumno;

/**
 *
 * @author pedro
 */
public class Lectura {
    public void leer(String nombreArchivo){
        String cadenaLeida = "";
        FileReader fr;
        BufferedReader archivoLectura;
        
        try {
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            System.out.println("The student are: ");
            cadenaLeida = archivoLectura.readLine();
            
            while(cadenaLeida!=null){
                StringTokenizer st = new StringTokenizer(cadenaLeida,","/*separador*/);
                Alumno alumno = new Alumno();
                //esto es para asignarle los atributos a un objeto. Se puede usar con constructor
                alumno.setIdAlumno(Integer.parseInt/*convertir la cadena a un entero*/(st.nextToken()));//avanza hasta encontrar el separador
                alumno.setNombre(st.nextToken());
                alumno.setLicenciatura(st.nextToken());
                
                System.out.println("Student: " + alumno.toString());
                
                //System.out.println("Alumno: " + cadenaLeida);
                cadenaLeida = archivoLectura.readLine();
            }
            
            archivoLectura.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
