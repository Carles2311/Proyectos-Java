/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Scanner;
public class Bucles {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        entrada.useDelimiter("\n");
        double sumaNotas = 0;
        System.out.println("Introduce la nota del alumno 1: ");
        double nota = entrada.nextDouble();
        sumaNotas = sumaNotas + nota;
        
        System.out.println("Introduce la nota del alumno 2 : ");
        nota = entrada.nextDouble();
        sumaNotas = sumaNotas + nota;
        
        System.out.println("Introduce la nota del alumno 3 : ");
        nota = entrada.nextDouble();
        sumaNotas = sumaNotas + nota;
        
        System.out.println("La media de todas las notas de los alumnos es: " + (sumaNotas/3));
    }
}
