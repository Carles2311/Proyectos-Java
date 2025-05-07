/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise09 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Entra el radio en cm:");
        double r = entrada.nextDouble();
        System.out.println("Entra la altura en cm");
        double h = entrada.nextDouble();
        double v = (1.0/3.0)*3.14*r*r*h;
        System.out.print("El volumen es: ");
        System.out.println(v);
    }
    
}
