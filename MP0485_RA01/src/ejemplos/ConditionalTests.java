/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Scanner;

public class ConditionalTests {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
      
        String respuesta = "Paris";
        String respuestUser = entrada.next();
    
    if(respuestUser.equals(respuesta)){
        System.out.println("Correcto");
    }
    else{  
        System.out.println("Incorrecto");
    }
    }
}
