/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica08;
import java.util.Scanner;

public class Practica08 {
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
        System.out.println("Entra un numero:");
        int datos= entrada.nextInt();
        int progresiveNum = 0;
        int stored = 0;
        while(datos > 0){
            progresiveNum = datos/10 *10;
            stored = stored +(datos-progresiveNum);
            datos = datos/10;
            System.out.println("La suma de todos los digitos es: "+ stored);
        }    
    }
    static void ejercicio02(){
        entrada.useDelimiter("\n");
        String charac = entrada.next();
        String buscar = entrada.next();
        buscar = "" + buscar;
        int y = charac.length();
        int i =0;
        String contada;
        int score = 0;
   for( i=0;i<y;i++){
      contada = ""+charac.charAt(i);
      if(contada == buscar){
          System.out.println("cuento" + score);
          score++;
      }

   }
    }
    static void ejercicio03(){
        String space = "";
        entrada.useDelimiter("\n");
        System.out.println("Entra una palabra o frase: ");
        String charac = entrada.next();
        int y = charac.length();
   for(int i=0;i<y;i++){
      System.out.println(space + charac.charAt(i));
      space = space + "   ";
    }}
    static void ejercicio04(){
        int resultado = 0;
        int numero = 1;
        int multiplicador = 0;
        for (multiplicador = 1; resultado < 100; multiplicador++) {
            System.out.printf("%-4s", numero * multiplicador+ " ");
            resultado = numero*multiplicador;
            if (resultado == (numero*10)) {
                System.out.print("\n");
                numero++;
                multiplicador = 0;
            }
        }
    }
    static void ejercicio05(){
        gameMenu();
        gameSkills();
        fight();
    }
    static void gameMenu(){
        System.out.println("______		            ______	");
        System.out.println("|    |		            |    |");
        System.out.println("|    |		            |    |");
        System.out.println("|    |		            |    |");
        System.out.println("|    |		_________   |    |");
        System.out.println("|    |______	|  ___  |   |    |______");
        System.out.println("|	    |	|  |_|  |   |	        |");
        System.out.println("|___________|	|_______|   |___________|");
        System.out.println("           Enter something to start:");
        String menu1 = entrada.next();
        
    }
    static void gameSkills(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("==========================================================");
        System.out.print("Quieres ver las habilidades de tu personaje? (yes/no):");
        String seleccion =entrada.next();
        switch (seleccion) {
            case "yes":
                System.out.println("[1] Corte estelar: Maestro Yi lanza un corte de katana diagonal que inflinge 20 de daño adaptable al enemigo.");
                System.out.println("[2] Meditación: Maestro Yi canaliza su energía para reponer su salud, no puede lanzar ningún ataque al enemigo pero recupera 30 de vida.");
                System.out.println("[3] Grito de guerra: Maestro Yi lanza un grito de guerra que augmenta el daño de Corte estelar 10 puntos.(Esto se reinicia cada vez que Maestro Yi utiliza Corte estelar.)");
                System.out.println("[4] Renacer: Maestro Yi lanza un ataque de doble filo que resta 20 puntos de su vida pero inflinge un daño de 35 puntos.");
                break;
            case "no":
                System.out.println("no");
                break;
            default:
                throw new AssertionError();
        }
      System.out.println("Pres Enter to start game:");
        String menu1 = entrada.next();
        switch (menu1) {
            case "":
                
                break;
            default:
                for (int i = 0; i < 50; i++) {
                    System.out.println("");
                }
        }  
    }
    static void fight(){
        int vida = 100;
        int vidaEnemigo = 100;
        int daño = 20;
        boolean game = true;
        while (game) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Vida: " + vida + "      Enemigo: " + vidaEnemigo);
            System.out.println("=================================");
            System.out.println("[1] Corte estelar");
            System.out.println("[2] Meditación");
            System.out.println("[3] Grito de guerra");
            System.out.println("[4] Renacer");
            System.out.println("=================================");
            int accion = entrada.nextInt();
            switch (accion) {
                case 1:
                    System.out.println("Has elegido Corte estelar, la vida del enemigo ha caido " + daño + " puntos."); 
                    vidaEnemigo = vidaEnemigo - daño;
                    daño = 20;
                    break;
                case 2:
                    System.out.println("Has elegido Meditación.");
                    vida = vida +30;
                    break;
                case 3:
                    System.out.println("Has eslegido Grito de guerra, este turno no atacas.");
                    daño = daño + 10;
                    break;
                case 4:
                    System.out.println("Has elegido Renacer.");
                    vidaEnemigo = vidaEnemigo -30;
                    vida = vida -20;
                    break;
                    default:
                    throw new AssertionError();
            }
            if (vidaEnemigo <= 0 ) {
                game = false;
                System.out.println("=================================");
                System.out.println("HAS GANADO");
            }
            else{
                System.out.println("=================================");
                System.out.println("Blitzcranck ha elegido gancho, esto resta 25 putos a tu salud.");
                vida = vida -25;
            }
            if (vida <= 0 ) {
                game = false;
                System.out.println("=================================");
                System.out.println("Has muerto");
            }
        }
    }
    static void ejercicio06(){
        int numAlumno = 0;
        int sumaNotas = 0;
        int maximo = 5;
        while (numAlumno<maximo) {
            System.out.print("Introduce la nota del alumno: ");
            int nota = entrada.nextInt();
            sumaNotas = sumaNotas + nota;
            numAlumno++;
        }
        int media = sumaNotas/numAlumno;
        System.out.println("La nota media de los alumnos es " + media);
    }
    static void ejercicio07(){
        int num = 0;
         num = entrada.nextInt();
         int division = num/2;
        boolean esPrimo = true;
        for (int i = 2; division == 0; num = num-1) {
           esPrimo = false;
           division = num/i;
            System.out.println(i + " es divisible entre " + num);
        }
        if (esPrimo) {
            System.out.println("El numero " + num + " es primo");
        }
        else{ System.out.println("El numero " + num + "NO es primo");}
    }
}
