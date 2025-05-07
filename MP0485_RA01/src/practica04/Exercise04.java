/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise04 {
    static Scanner entrada = new Scanner(System.in);
    public static void main (String args[]){
    
        double moneyValue = 166386;
        System.out.println("Introduce la cantidad a calcular:");
        double money1 = entrada.nextDouble();
        System.out.print("El calculo es: " );
        System.out.println(money1 * moneyValue);
    }
    
}
