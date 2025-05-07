/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;
import java.util.Scanner;
/**
 *
 * @author carlessalfor
 */
public class UserDataValidations {
    
    
    public static boolean checkId(int typeDoc, String id){
        boolean idok = false;
        if(id.length() == 8){
        String numeros = id.substring(0, 7);
        idok = isNumeric(numeros);
        }
        else{
            idok = false;
        }
        
        return idok;
    }
    public static boolean checkFecha(String date){
        System.out.println(date);
        boolean stat = false;
        String numRef = "" + date.charAt(0) + date.charAt(1);
        String numRef2 = "" + date.charAt(3) + date.charAt(4);
        String numRef3 = "" + date.charAt(6) + date.charAt(7);
        boolean continuacion = isNumeric(numRef);
        if (continuacion == true){      
            continuacion = isNumeric(numRef2);
            if (continuacion == true){               
                continuacion = isNumeric(numRef3);
                if (continuacion ==true){
                stat = true;
                }
                else if (continuacion == false){
                stat = false;
                }
            }
            else if (continuacion == false){
            stat = false;
            }
        }
        else if (continuacion == false){
        stat = false;
        }
        if (stat == true){
            int num = Integer.parseInt(numRef);
            System.out.println(num);
            if(num <= 31){
                //System.out.println("Dia esta bien");
                stat = true;
            }
            else{
             stat = false;
                System.out.println("El dia es incorrecto");
            }
            int num2 = Integer.parseInt(numRef2);
            System.out.println(num);
            if(num2 <= 12){
                //System.out.println("Mes esta bien");
                if(stat == false){
                    stat = false;
                }
                else{
                stat = true;
                }
            }
            else{
             stat = false;
                System.out.println("El mes es incorrecto");
            }
        }
         return stat;
    }
    public static boolean checkPostalCode( String codigo){
        boolean stat = false;
        if (codigo.length() == 5){
            stat = isNumeric(codigo);
        }
    return stat;
    }
    public static boolean isNumeric(String numRef){
        boolean stat = false;
        
            if (numRef.matches("\\d+")){
            stat = true;
            }
        
            return stat;
    }
    public static boolean isAlphabetic( String texto){       
            boolean stat = true;
            for (int i = 0; i < texto.length(); i++) {
                if (!Character.isLetter(texto.charAt(i))) {
                    stat = false;
                }
        }
            return stat;
    }
}
