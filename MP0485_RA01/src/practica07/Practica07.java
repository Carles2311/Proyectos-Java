/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica07;
import java.util.Scanner;

public class Practica07 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean ejercicios = true;
           do{
           System.out.println("");
           System.out.println("Menu:");
           System.out.println("1 - Exercise 1");
           System.out.println("2 - Exercise 2");
           System.out.println("3 - Exercise 3");
           System.out.println("4 - Exercise 4");
           System.out.println("5 - Exercise 5");
           System.out.println("6 - Exercise 6");
           System.out.println("7 - Exercise 7");
           System.out.println("Enter option:");
           String menu = entrada.next();
           System.out.println("");
           switch (menu) {
               case "1":
                   ejercicio01();
                   break;
               case "2":
                   ejercicio02();
                   break;
               case "3":
                   ejercicio03();
                   break;
               case "4":
                   ejercicio04();
                   break;
               case "5":
                   ejercicio05();
                   break;
                case "6":
                   ejercicio06();
                   break;
                case "7":
                   ejercicio07();
                   break;
               case "exit":
                   ejercicios = false;
                   break;
               default:
                   System.out.println("Entra un numero entre 1-5.");
           }
           }while(ejercicios);
       }  
    static void ejercicio01(){
        System.out.println("Enter a number:");
        int number = entrada.nextInt();
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        int  menu = entrada.nextInt();
        int i = 0;
        switch (menu) {
            case 1:
                for ( i = 1; number*i <= 100; i++) {
                    System.out.println(number*i); 
                }
                break;
            case 2:
            
                while (number*i < 100) {
                    
                    i++;
                    System.out.println(number*i);
                }
                break;
            case 3:
                do {
                    i++;
                    System.out.println(number*i);
                } while (number*i < 100);
                break;
            default:
                throw new AssertionError();
        }

    }
    //Fin ejercicio01
    static void ejercicio02(){
        int numMultiplo = 0;
        System.out.println("Entra un numero multiplo de 10 mayor que 0:");
        numMultiplo = entrada.nextInt();
        int i = 10;
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                for (i = 10; numMultiplo >= 0; numMultiplo = numMultiplo - i) {
                    System.out.println(numMultiplo);
                }
                break;
            case 2:
                while (numMultiplo >= 0) {
                    System.out.println(numMultiplo);
                    numMultiplo = numMultiplo - i;
                }
                break;
            case 3:
                do {
                    if (numMultiplo > 0) {
                        System.out.println(numMultiplo);
                        numMultiplo = numMultiplo - i;
                    }
                } while (numMultiplo > 0);

                break;
            default:
                throw new AssertionError();
        }
    }

    //Fin ejercicio02
    static void ejercicio03() {
        boolean pregunta = true;
        int numero;
        do {
            System.out.println("Entra un numero entre 1 y 10:");
            numero = entrada.nextInt();
            if (numero <= 10) {
                pregunta = false;
            } else {
                System.out.println("Entra de nuevo otro digito");
            }
        } while (pregunta);
        int i = 0;
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                for (i = 0; i <= 10; i++) {
                    System.out.println(numero + "x" + i + "= " + numero * i);
                }
                break;
            case 2:
                i = 1;
                while (i <= 10) {
                    System.out.println(numero + "x" + i + "= " + numero * i);
                    i++;
                }
                break;
            case 3:
                do {
                    System.out.println(numero + "x" + i + "= " + numero * i);
                    i++;
                } while (i <= 10);
                break;
            default:
                throw new AssertionError();
        }
    }
    //Final ejercicio 3.
    static void ejercicio04(){
        double numero = 100000;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        while(numero > 99999){
            System.out.println("Entra un numero de 5 digitos:");
            numero= entrada.nextDouble();
            if (numero < 100000) {
                num1 = (int) numero / 10000;
                num2 = (int) numero / 1000 - (num1 * 10);
                num3 = (int) numero / 100 - (num1 * 100) - (num2 * 10);
                num4 = (int) numero / 10 - (num1 * 1000) - (num2 * 100) - (num3 * 10);
                num5 = (int) numero - (num1 * 10000) - (num2 * 1000) - (num3 * 100) - (num4 * 10);
            }
            else {
                System.out.println("¡El numero es demasiado grande!");
            }
        }
        System.out.println( num1 +" "+ num2+" "+num3+" "+num4+" "+num5);
        System.out.printf("%-10s %-10s %-10s\n", "Base", "Square", "Cube");
        System.out.printf("%-10s %-10s %-10s\n", num1, num1*num1, num1*num1*num1);
        System.out.printf("%-10s %-10s %-10s\n", num2, num2*num2, num2*num2*num2);
        System.out.printf("%-10s %-10s %-10s\n", num3, num3*num3, num3*num3*num3);
        System.out.printf("%-10s %-10s %-10s\n", num4, num4*num4, num4*num4*num4);
        System.out.printf("%-10s %-10s %-10s\n", num5, num5*num5, num5*num5*num5);
    }
    // Fin ejercicio 4
    static void ejercicio05(){
        int multiplier = 10;
        int counter = 0;
        System.out.println("Entra un numero largo:");
        int numero = entrada.nextInt();
        while (numero >0) {
            numero = numero/multiplier;
            counter++;
        }
        System.out.println("Hay " + counter + " digitos en el numero");
    }
    // Fin ejercicio 5.
    static void ejercicio06(){
        double random = Math.random()*11;
        int guess = (int)random;
        int intentos = 3;
        int numero;
        while (intentos > 0) {
            System.out.println("Intenta adivinar el numero del 0 al 10 Tienes " + intentos + " intentos:");    
        numero = entrada.nextInt();
        if (numero == guess) {
            System.out.println("Correcto, lo lograste.");
            intentos = 0;
        }
        else{ 
            intentos = intentos-1;
            if (intentos == 0) {
                System.out.println("Lo siento amigo, intenta de nuevo el juego.");
            }
            else{System.out.println("Incorrecto, intenta de nuevo.");}
            }
        }
    }
    static void ejercicio07(){
        System.out.println("Entra el numero base:");
        int numeroInicial = entrada.nextInt();
        int numero = numeroInicial;
        System.out.println("Entra el exponente:");
        int exponente = entrada.nextInt();
        int ronda = 1;
        if (exponente == 0) {
            System.out.println(numeroInicial + "^" + exponente + "=" + numero);
        }
        else{
        while (ronda < exponente) {
            numero = numero*numeroInicial;
            ronda++;
        }
        System.out.println(numeroInicial + "^" + exponente + "= " + numero);
        }
    }
}
