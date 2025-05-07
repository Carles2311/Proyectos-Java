/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;



public class Exercise06 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        char a = (entrada.next().charAt(0));
        char b = (entrada.next().charAt(0));
        char c = (entrada.next().charAt(0)); 
        char d = (entrada.next().charAt(0));
        System.out.println("Ahora dime un nombre");
        String nombre = entrada.next();
        System.out.print("La frase completa es: ");
        System.out.println(a+""+b+""+c+""+d+" "+nombre);
        
    }
}
