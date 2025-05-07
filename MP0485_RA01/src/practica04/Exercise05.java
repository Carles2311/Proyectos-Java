/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise05 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int ivaPorcentaje = 21;
        int iva;
        System.out.print("Introduzca un precio:");
        int precio = entrada.nextInt();
        iva = precio * ivaPorcentaje/100;
        System.out.print("El precio final es: ");
        System.out.println(precio + iva);
    }
}
