/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica06;
import java.util.Scanner;

public class Practica06 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1 - Exercise 1");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("4 - Exercise 4");
        System.out.println("5 - Exercise 5");
        System.out.println("6 - Exercise 6");
        System.out.println("Enter option:");
        int menu = entrada.nextInt();
        System.out.println("");
        switch (menu) {
            case 1:
                ejercicio01();
                break;
            case 2:
                ejercicio02();
                break;
            case 3:
                ejercicio03();
                break;
            case 4:
                ejercicio04();
                break;
            case 5:
                ejercicio05();
                break;
            default:
                throw new AssertionError();
        }
    }
    static void ejercicio01(){
        int score = 0;
        System.out.println("Question 1: What is the output of \'System.out.println(5 + 3);\'");
        System.out.println("a) 53");
        System.out.println("b) 8");
        System.out.println("c) 5+3");
        System.out.println("d) Error");
        System.out.println("Answer:");
        char answer = (entrada.next()).charAt(0);
        if(answer == 'B'){
            score ++;
            System.out.println("");
            
        }
        System.out.println("Question 2: Which keyword is used to create a class in Java");
        System.out.println("a) class");
        System.out.println("b) create");
        System.out.println("c) new");
        System.out.println("d) method");
        System.out.println("Answer:");
        answer = (entrada.next()).charAt(0);
        if(answer == 'A'){
            score ++;
            System.out.println("");
        }
        System.out.println("Question 3: What data type is used to create a variable that should store text?");
        System.out.println("a) myString");
        System.out.println("b) String");
        System.out.println("c) Txt");
        System.out.println("d) Text");
        System.out.println("Answer:");
        answer = (entrada.next()).charAt(0);
        if(answer == 'B'){
            score ++;
            System.out.println("");
        }
        System.out.println("Question 4: How do you start the main method in Java?");
        System.out.println("a) public void main()");
        System.out.println("b) public static void main()");
        System.out.println("c) main()");
        System.out.println("d) static void main()");
        System.out.println("Answer:");
        answer = (entrada.next()).charAt(0);
        if(answer == 'B'){
            score ++;
            System.out.println("");
        }
        System.out.println("Question 5: What is the correct way to create a variable of type int?");
        System.out.println("a) int num = 5");
        System.out.println("b) integer num = 5");
        System.out.println("c) num int = 5");
        System.out.println("d) num = int 5");
        System.out.println("Answer:");
        answer = (entrada.next()).charAt(0);
        if(answer == 'A'){
            score ++;
            System.out.println("");
        }
        System.out.println("Final Grade: " + score + "/5");
    }
    static void ejercicio02(){
        int num = 0;
        System.out.println("Enter a 3-digit number:");
        num = entrada.nextInt();
        System.out.println("");
        int residuo = num%10;
        int numInvertido = num/100;
        if(residuo == numInvertido){
            System.out.println("The number is capicua");
        }
        else{
            System.out.println("The number is not capicua");
        }
    }
    static void ejercicio03(){
        int  num = 0;
        System.out.println("Enter a number:");
        num = entrada.nextInt();
        if(num < 10 && num > -10){
            System.out.println("The number has 1 digit");
        }
        else{
        if( num > 9 && num <= 99 || num <-9 && num  >= -99){ 
            System.out.println("The number has 2 digits");
        }
        else{
            if( num > 99 && num <= 999 || num < -99 && num >= -999){
                System.out.println("The number has 3 digits");
            }
            else{
                if( num > 999 && num <= 9999 || num < -999 && num >= -9999){
                    System.out.println("The number has 4 digits");
                }
            }
        }
        }
    }
    static void ejercicio04(){
        String day;
        int time = 0;
        System.out.println("Enter day of the week:");
        day = entrada.next();
        System.out.println("Enter time (HH MM)");
        int hour =entrada.nextInt();
        int minutes = entrada.nextInt();
        switch (day) {
            case "Monday":
                time = 24 - hour;
                minutes = minutes + (hour*60);
                time = minutes + (1440*4);
                System.out.println("Minutes until weekeng: " + time);
                break;
            case "Tuesday":
                time = 24 - hour;
                minutes = minutes + (hour*60);
                time = minutes + (1440*3);
                System.out.println("Minutes until weekeng: " + time);
                break;
            case "Wednesday":
                time = 24 - hour;
                minutes = minutes + (hour*60);
                time = minutes + (1440*2);
                System.out.println("Minutes until weekeng: " + time);
                break;
            case "Thursday":
                time = 24 - hour;
                minutes = minutes + (hour*60);
                time = minutes + (1440*1);
                System.out.println("Minutes until weekeng: " + time);
                break;
            case "Friday":
                time = 24 - hour;
                minutes = minutes + (hour*60);
                System.out.println("Minutes until weekeng: " + minutes);
                break;
            default:
                throw new AssertionError();
        }
    }
        static void ejercicio05(){
            System.out.println("Enter the taxable base:");
            float basePrice = entrada.nextFloat();
            System.out.println("Enter the TAX type (general, reduced, super-reduced):");
            float taxePrice = 0;
            String taxe = entrada.next();
            float taxeValue = 0;
            int porcentaje = 0;
            switch (taxe) {
                case "general":
                    taxePrice = basePrice + (basePrice*21/100);
                    taxeValue = basePrice*21/100;
                    porcentaje = 21;
                    break;
                case "reduced":
                    taxePrice = basePrice + (basePrice*10/100);
                    taxeValue = basePrice*10/100;
                    porcentaje = 10;
                    break;
                case "super-reduced":
                    taxePrice = basePrice + (basePrice*4/100);
                    taxeValue = basePrice*4/100;
                    porcentaje = 4;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Enter the promo code (noPromo, half, fixDiscount, percentage):");
            String discountCode = entrada.next();
            float promoDiscount = 0;
            switch (discountCode) {
                case "half":
                    promoDiscount = taxeValue*50/100;
                    break;
                case "fixDiscount":
                    promoDiscount = taxeValue*5/100;
                    break;
                case "percentage":
                    promoDiscount = taxeValue*5/100;
                    break;
                default:       
            }
            System.out.printf("%-25s    %6.2f\n","Taxable base: ", basePrice);
            System.out.printf("%-25s    %6.2f\n","Tax("+porcentaje+"): ", taxeValue);
            System.out.printf("%-25s    %6.2f\n","Price with taxes: ", taxePrice);
            System.out.printf("%-25s    %6.2f\n","Promo code("+discountCode+"): ", promoDiscount);
            System.out.printf("%-25s    %6.2f\n","TOTAL: ", taxePrice - promoDiscount);
        }   
        
}
