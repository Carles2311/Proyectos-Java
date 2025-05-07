/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

import java.util.Scanner;

public class Exercise02 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

       entrada.useDelimiter("\n"); 
        System.out.println("edad: ");
        int edad = entrada.nextInt();
        System.out.println(edad);
        System.out.println("Introduce tu nombre completo");
        String nombre = entrada.next();
        System.out.println("Tu nombre es: " + nombre + "?");

        System.out.println("FIN");

    }

}
