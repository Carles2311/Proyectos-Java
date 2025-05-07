/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica05;
import java.util.Scanner;

public class Practica05 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Practica 5 - Estructuras condicionales.");
        System.out.println("=======================================");
        System.out.println("1. Exercise 01 - SubjectOfTheDay");
        System.out.println("2. Exercise 02 - Greetings");
        System.out.println("3. Exercise 03 - DaysOfWeek");
        System.out.println("4. Exercise 04 - Overtime");
        System.out.println("5. Exercise 05 - Horoscope");
        System.out.println("=======================================");
        System.out.print("Please select an exercise (1-5): ");
        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                System.out.println("");
                ejercicio01();
                break;
            case 2:
                System.out.println("");
                ejercicio02();
                break;
            case 3:
                System.out.println("");
                ejercicio03();
                break;
            case 4:
                System.out.println("");
                ejercicio04();
                break;
            case 5:
                System.out.println("");
                ejercicio05();
                break;
            default:
                throw new AssertionError();
        }
    }
    static void ejercicio01(){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Exercise 01");
        System.out.println("--------------------------");
        System.out.print("Enter a day of the week: ");
        String diaSemana = entrada.next();
        System.out.println("--------------------------");
        switch (diaSemana) {
            case "Monday":
                System.out.println("The first subject of the day is HTML");
                break;
            case "Thesday":
                System.out.println("The first subject of the day is HTML");
                break;
            case "Wednesday":
                System.out.println("The first subject of the day is ANG");
                break;
            case "Thursday":
                System.out.println("The first subject of the day is PROG");
                break;
            case "Friday":
                System.out.println("The first subject of the day is SO");
                break;
            default:
                System.out.println("Intenta de nuevo otro dia");
                ejercicio01();
        }
    }
    static void ejercicio02(){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Exercise 02");
        System.out.println("--------------------------");
        System.out.print("Enter the hour: ");
        int hora = entrada.nextInt();
        if( (hora >= 6) && (hora < 13) ){
            System.out.println("Good morning");
        }
        else if( (hora >= 13) && (hora < 21) ){
            System.out.println("Buenas tardes");
        }
        else if ((hora >= 21) && (hora < 24)){
            System.out.println("Good afternoon");
        }
        else if((hora >= 0) && (hora < 6)) {
            System.out.println("Good evening");  
        }
    }
    static void ejercicio03(){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Exercise 03");
        System.out.println("--------------------------");
        System.out.print("Enter a number (1-7): ");
        int numeroSemana = entrada.nextInt();
        switch (numeroSemana) {
            case 1:
                System.out.println("The corresponding day is Monday");
                break;
            case 2:
                System.out.println("The corresponding day is Tuesday");
                break;
            case 3:
                System.out.println("The corresponding day is Wednesday");
                break;
            case 4:
                System.out.println("The corresponding day is Thursday");
                break;
            case 5:
                System.out.println("The corresponding day is Friday");
                break;
            case 6:
                System.out.println("The corresponding day is Saturday");
                break;
            case 7:
                System.out.println("The corresponding day is Sunday");
                break;    
            default:
                throw new AssertionError();
        }
    }
    static void ejercicio04(){
        int diferenciaHoras;
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Exercise 04");
        System.out.println("--------------------------");
        System.out.print("Enter the number of hours worked: ");
        int horasSemanales = entrada.nextInt();
        if(horasSemanales>40){
            diferenciaHoras = horasSemanales - 40;
            System.out.print("The total weekly wage is ");
            System.out.println((diferenciaHoras*12)+ 400 + ".");
        }
        else{
            System.out.print("El salario de esta semana es: ");
            System.out.println(horasSemanales*10);
        }
    }
    static void ejercicio05(){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Exercice 05");
        System.out.println("--------------------------");
        System.out.print("Enter the day of birth:  ");
        int dia = entrada.nextInt();
        System.out.print("Enter the month of birth: ");
        String mes = entrada.next();
        switch (mes) {
            case "January":
                if(dia>=21){
                    System.out.println("Your horoscope is Aquarius.");
                }
                else{
                    System.out.println("Your horoscope is Capricornio.");
                }
                break;
            case "February":
                if(dia>=20){
                    System.out.println("Your horoscope is Piscis.");
                }
                else{
                    System.out.println("Your horoscope is Aquarius.");
                }
                break;
            case "March":
                if(dia>=21){
                    System.out.println("Your horoscope is Aries.");
                }
                else{
                    System.out.println("Your horoscope is Piscis.");
                }
                break;
            case "April":
                if(dia>=21){
                    System.out.println("Your horoscope is Taurus.");
                }
                else{
                    System.out.println("Your horoscope is Aries.");
                }
                break;
            case "May":
                    if (dia>=22) {
                        System.out.println("Your horoscope is Geminis.");
                    }
                    else{
                        System.out.println("Your horoscope is Taurus.");
                    }
                break;
            case "June":
                if(dia>=22){
                    System.out.println("Your horoscope is Cáncer.");
                }
                else{
                    System.out.println("Your horoscope is Geminis.");
                }
                break;
            case "July":
                if(dia>=23){
                    System.out.println("Your horoscope is Leo.");
                }
                else{
                    System.out.println("Your horoscope is Cancer.");
                }
                break;
            case "August":
                if(dia>=23){
                    System.out.println("Your horoscope is Virgo.");
                }
                else{
                    System.out.println("Your horoscope is Leo.");
                }
                break;
            case "September":
                if(dia>=23){
                    System.out.println("Your horoscope is Libra.");
                }
                else{
                    System.out.println("Your horoscope is Virgo.");
                }
                break;
            case "Octuber":
                if(dia>=23){
                    System.out.println("Your horoscope is Escorpio");
                }
                else{
                    System.out.println("Your horoscope is Libra");
                }
                break;
            case "November":
                if(dia>=23){
                    System.out.println("Your horoscope is Sagitario");
                }
                else{
                    System.out.println("Your horoscope is Escorpio");
                }
                break;
            case "December":
                if(dia>=22){
                    System.out.println("Your horoscope is Capricornio");
                }
                else{
                    System.out.println("Your horoscope is Sagitario");
                }
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}