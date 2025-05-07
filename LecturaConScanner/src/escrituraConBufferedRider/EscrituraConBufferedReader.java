/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escrituraConBufferedRider;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carlessalfor
 */
public class EscrituraConBufferedReader {
    public static void main(String[] args) {
        try{
        File file = new File("src\\ficheros\\ejemplo2.txt");
        FileWriter fr = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("Primera linea\n");
        bw.write("Segunda linea");
        bw.write("esta linea esta junta a la segunda linea");
        bw.newLine();
        bw.write("nueva linea");
        bw.flush();
        }    
        catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
}
