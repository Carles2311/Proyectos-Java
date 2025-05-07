/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Scanner;

public class NumerosPar {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        int numero = entrada.nextInt();
        if((numero) == 0){
         System.out.println("Par");
        }
        else{
            System.out.println("no par");
        }
        }
    }

