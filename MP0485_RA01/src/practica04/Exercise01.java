/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise01 {
     static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("Introduce un n�mero:");
        int x = entrada.nextInt();
        System.out.println("Introduce un segundo n�mero:");
        int y = entrada.nextInt();
        
        System.out.print("Suma: ");
        System.out.println(x + y);
        
        System.out.print("Resta: ");
        System.out.println(y - x);
        
        System.out.print("Divisi�n: ");
        System.out.println(x/y);
        
        System.out.print("Multiplicaci�n: ");
        System.out.println(x * y);
        
    }
}
