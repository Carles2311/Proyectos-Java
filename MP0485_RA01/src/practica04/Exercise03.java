/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise03 {
    
    static Scanner entrada = new Scanner(System.in);
    

    public static void main(String[] args) {
     
       entrada.useDelimiter("\n"); 
       
       System.out.println("Introduce tu nombre completo");
       String name = entrada.next();
       System.out.println("Introduce su dirección");
       String adress = entrada.next();
       System.out.println("Introduce su numero de contacto");
       String phoneNumber = entrada.next();
       
       System.out.println("Nombre: " + name);
      System.out.println("Dirección: " + adress);
      System.out.println("Telefono: " + phoneNumber);
    
    }
    
}
