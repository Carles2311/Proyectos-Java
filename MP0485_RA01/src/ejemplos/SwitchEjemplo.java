/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Scanner;
public class SwitchEjemplo {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("Entra un numero:");
        int numero1 = entrada.nextInt();
        System.out.println("Entra otro numero:");
        int numero2 = entrada.nextInt();
        System.out.println("Que opción quieres hacer?");
        System.out.println("----------------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("----------------------------");
        System.out.println("Selecciona una opción de las posteriores!");
        int opcionMenu = entrada.nextInt();
        System.out.println("----------------------------");
        switch (opcionMenu) {
            case 1:
                System.out.println("Has elejido SUMAR");
                resultado = numero1 + numero2;
                break;
            case 2:
                System.out.println("Has elejido RESTAR");
                resultado = numero1 - numero2;
                break;
            case 3:
                System.out.println("Has elejido MULTIPLICAR");
                resultado = numero1 * numero2;
                break;
            case 4:
                System.out.println("Has elejido DIVIDIR");
                resultado = numero1/numero2;
                break;
            default:
                System.out.println("Opcion no prevista");
        }
        System.out.println("----------------------------");
        System.out.print("El resultado es: ");
        System.out.println(resultado);
    }
}
