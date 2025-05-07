/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Vehiculo;
import model.Coche;
import model.Moto;
import model.Bus;
import model.ColorEnum;
import model.MotoresEnum;
/**
 * @author carlessalfor
 */
public class main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static void main(String[] args) {
        //Coche car1 = new Coche( "Toyota", "1234", "Corolla", 123, ColorEnum.NEGRO, MotoresEnum.MotorV, "Redondas", 0, LocalDate.of(2015, 5, 15), 4);

        boolean menu = true;
        while(menu){
            System.out.println("");
            System.out.println("Carles Salvany Fornons");
            System.out.println("------------------------");
            System.out.println("[1] Crear coche");
            System.out.println("[2] Crear moto");
            System.out.println("[3] Crear bus");
            System.out.println("[4] Mostrar vehiculos");
            System.out.println("[5] Mostrar Matriculas");
            System.out.println("[6] Pedir Matricula");
            System.out.println("[7] Mostrar Coches");
            System.out.println("[8] Mostrar Motos");
            System.out.println("[9] Mostrar Buses");
            System.out.println("[10] Eliminar por matricula");
            System.out.println("[11] Salir");
            System.out.print("Entra tu eleccion: ");
            int eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    crearVehiculo("coche");
                    break;
                case 2:
                    crearVehiculo("moto");
                    break;
                case 3:
                    crearVehiculo("bus");
                    break;
                case 4:
                    printVehiculos("all");
                    break;
                case 5:
                    printMatriculas();
                    break;
                case 6:
                    pedirMatricula();
                    break;
                case 7:
                    printVehiculos("Coche");
                    break;
                case 8:
                    printVehiculos("Moto");
                    break;
                case 9:
                    printVehiculos("Bus");
                    break;
                case 10:
                    eliminarVehiculo();
                    break;
                case 11:
                    menu = false;
                    break;
                default:
                    throw new AssertionError();
            }
            
        }     
    }
    static void crearVehiculo(String tipo){
        System.out.println("");
        System.out.print("Entra la marca: ");
        String marca = entrada.next();
        System.out.print("Entra la matricula: ");
        String matricula = entrada.next();
        System.out.print("Entra el modelo: ");
        String modelo = entrada.next();
        System.out.print("Entra la potencia: ");
        double potencia = entrada.nextDouble();
        System.out.print("Entra el color(VERDE, ROJO, AZUL, NEGRO): ");
        String input = entrada.next();
        ColorEnum color = ColorEnum.valueOf(input.toUpperCase());
        System.out.print("Entra el motor(MotorV, MotorW, MotorVertical): ");
        input = entrada.next();
        MotoresEnum motor = MotoresEnum.valueOf(input);
        System.out.print("Entra el tipo de rueda: ");
        String ruedas = entrada.next();
        System.out.print("Entra la potencia: ");
        double velocidad = entrada.nextDouble();    
        if(tipo.equals("coche")){
            System.out.print("Entra el numero de puertas: " );
            int numPuertas = entrada.nextInt();
            Coche coche = new Coche( marca, matricula, modelo, potencia, color, motor, ruedas, velocidad, LocalDate.of(2015, 5, 15), numPuertas);
            vehiculos.add(coche);
        }
        if(tipo.equals("moto")){
            System.out.print("Tiene sidecar?(true/false): " );
            boolean sidecar = entrada.nextBoolean();
            Moto moto = new Moto( marca, matricula, modelo, potencia, color, motor, ruedas, velocidad, LocalDate.of(2015, 5, 15), sidecar);
            vehiculos.add(moto);
        }
        if(tipo.equals("bus")){
            System.out.print("Entra el numero de asientos: " );
            int numAsientos = entrada.nextInt();
            System.out.print("Entra el precio de los asientos: " );
            double precio = entrada.nextDouble();
            Bus bus = new Bus( marca, matricula, modelo, potencia, color, motor, ruedas, velocidad, LocalDate.of(2015, 5, 15), numAsientos, precio);
            vehiculos.add(bus);
        }
    }
    static void printVehiculos(String type){
        switch (type) {
            case "all":
                for (Vehiculo vehi:vehiculos){
                System.out.println(vehi.toString());
                }
                break;
            case "Coche":
                for (Vehiculo vehi:vehiculos){
                    if( vehi instanceof Coche){
                        System.out.println(vehi.toString());
                    }

                }
                break;
            case "Moto":
                for (Vehiculo vehi:vehiculos){
                    if( vehi instanceof Moto){
                        System.out.println(vehi.toString());
                    }

                }
                break;
            case "Bus":
                for (Vehiculo vehi:vehiculos){
                    if( vehi instanceof Bus){
                        System.out.println(vehi.toString());
                    }

                }
                break;
            default:
                throw new AssertionError();
        }
        
    }
    static void printMatriculas(){
        for (Vehiculo vehi:vehiculos){
            System.out.println(vehi.getMatricula());
        }
    }
    static void pedirMatricula(){
        System.out.println("");
        System.out.print("Entra la matricula que buscas: ");
        String matricula = entrada.next();
        for (Vehiculo vehi:vehiculos){
           if(matricula.equals(vehi.getMatricula())){
               System.out.println(vehi.toString());
           }
        }
        
    }
    static void eliminarVehiculo(){
        System.out.println("");
        System.out.print("Entra la matricula que deseas eliminar: ");
        String matricula = entrada.next();
        for (Vehiculo vehi:vehiculos){
           if(matricula.equals(vehi.getMatricula())){
               vehiculos.remove(vehi);
           }
        }
    }
    }

