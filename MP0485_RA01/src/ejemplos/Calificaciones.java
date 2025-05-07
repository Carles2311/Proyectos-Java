/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Scanner;

public class Calificaciones {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Entra tu nota: ");
        double nota = entrada.nextDouble();
        if (nota < 5) {
            System.out.println("Suspendido");
        }
        else if( 7 >= nota){
            System.out.println("Bien");
        }
        else if (9 > nota) {
            System.out.println("notable");
        }
        else {
            System.out.println("Excelente");
        }
    }
}
