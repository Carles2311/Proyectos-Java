/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;



public class Exercise07 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Deletrea una palabra de 5 letras: ");
        char a = (entrada.next().charAt(0));
        char b = (entrada.next().charAt(0));
        char c = (entrada.next().charAt(0)); 
        char d = (entrada.next().charAt(0));
        char e = (entrada.next().charAt(0));
        String nombre;
        nombre = a+""+b+""+c+""+d+""+ e;
        System.out.print("La palabra completa es: ");
        System.out.println(nombre);
        System.out.println("¿La has deletreado bien?");
        
    }
}
