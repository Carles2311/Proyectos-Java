/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author carlessalfor
 */
public class LecturaConBufferedReader {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "src\\ficheros\\ejemplo.txt";
        File fichero = new File(fileName);
        
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        String linea ="";
        linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
    }
    
}
