/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author carlessalfor
 */
public class LecturaConScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String fileName = "src\\ficheros\\ejemplo.txt";
        try{
            System.out.println(leerFichero(fileName));
        } catch(FileNotFoundException ex){
            System.out.println(ex.toString());
        }
        
    }
    private static String leerFichero(String fileName) throws FileNotFoundException{
        File fichero = new File(fileName);
        Scanner scan = new Scanner(fichero);
        String palabra = "";
        while(scan.hasNext()){
            palabra += scan.next() + " ";
        }
        scan.close();
        return palabra;
    }
}
