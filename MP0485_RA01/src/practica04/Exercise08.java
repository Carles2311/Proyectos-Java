/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;
import java.util.Scanner;

public class Exercise08 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        int salarioHora = 12;
        
        System.out.println("Entra las horas trabajadas esta semana:");
        int horasTrabajadas = entrada.nextInt();
        System.out.print("Tu salario mensual es: ");
        System.out.println(horasTrabajadas*salarioHora);
    }
}
