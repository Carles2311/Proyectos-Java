/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author carlessalfor
 */
public class Coche extends Vehiculo{
    // ATRIBUTOS
   private int numPuertas;
    
// CONSTRUCTOR
    public Coche(){
     super();
    }
//    public Coche(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String tipoRuedas){
//    this.marca = marca;
//    this.matricula = matricula;
//    this.modelo = modelo; 
//    this.potencia = potencia;
//    this.color = color;
//    this.motor = motor;
//    }
//    public Coche(String marca, String modelo, double potencia, String motor, String tipoRuedas){
//    this.marca = marca;
//    this.modelo = modelo; 
//    this.potencia = potencia;
//    this.motor = motor;
//    }

    public Coche(String marca, String matricula, String modelo, double potencia, ColorEnum color, MotoresEnum motor, String tipoRuedas, double velocidad, LocalDate fechaFabricacion, int numPuertas) {        
        super(marca, matricula, modelo, potencia, color, motor, tipoRuedas, velocidad, fechaFabricacion);
        this.numPuertas = numPuertas;
    }

    
//SETTERs

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    //GETTERs

    public int getNumPuertas() {
        return numPuertas;
    }
    
    //TO STRING
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("numPuertas:").append(numPuertas).append("\n");
        
        return sb.toString();
    }
    
    //METODOS PROPIOS
    
//    public  void frenar( ){
//        double num = 10.00;
//        if (velocidad > 0){
//            velocidad = velocidad - num;
//            if (velocidad < 0){velocidad = 0;}
//        }
//        }
//    public  void frenar(double num ){
//        if (velocidad > 0){
//            velocidad = velocidad - num;
//            if (velocidad < 0){velocidad = 0;}
//        }
//        }
//    public  void accelerar( ){
//        double num = 10.00;
//
//            velocidad = velocidad + num;
//        
//        }
//    public  void accelerar(double num ){
//            velocidad = velocidad + num;
//        
//        }
//    public int calcularEdad(){
//        LocalDate fechaActual = LocalDate.now();
//        Period periodo = Period.between(fechaFabricacion, fechaActual);
//        return periodo.getYears();
//    }
    
    }
    
