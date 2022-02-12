/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos.operaciones;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.archivos.clases.Alumno;

/**
 *
 * @author pedro
 */
public class Escritura {
    
    public void escribir(String nombreArchivo, Alumno alumno){
        
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true);
            //esto es por si no podemos escribir en el archivo
            //el true espara agregar. False es crear y si existe, bórralo
            BufferedWriter archivoEscritura = new BufferedWriter(fw);//unión archivo lógico archivo físico
            archivoEscritura.write(alumno.getIdAlumno() 
            + ", " + alumno.getNombre() + ", " + alumno.getLicenciatura() 
                    + "\n");
            archivoEscritura.flush();//para que se refleje lo que mandamos a escribir
            archivoEscritura.close();//cerrar el archivo una vez que acabos de escribir
            //para cuando ya no lo vamos a ocupar
        } catch (IOException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
