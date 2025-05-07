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
public class Camion extends Vehiculo{
    // ATRIBUTOS
   private double cargaMax;
   private double altura;
    
// CONSTRUCTOR
    public Camion(){
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

    public Camion(String marca, String matricula, String modelo, double potencia, ColorEnum color, MotoresEnum motor, String tipoRuedas, double velocidad, LocalDate fechaFabricacion, double cargaMax, double altura) {        
        super(marca, matricula, modelo, potencia, color, motor, tipoRuedas, velocidad, fechaFabricacion);
        this.cargaMax = cargaMax;
        this.altura = altura;
    }

    
//SETTERs

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //GETTERs

    public double getCargaMax() {
        return cargaMax;
    }

    public double getAltura() {
        return altura;
    }
    
    //TO STRING
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("CargaMax:").append(cargaMax);
    sb.append("altura:").append(altura);    
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
    
