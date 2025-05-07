/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import tipoEnum.MedioTransEnum;

/**
 *
 * @author carlessalfor
 */
public class Vehiculo extends Transporte {
    // ATRIBUTOS
    private String marca;
    private String matricula;
    private String modelo;
    private double potencia;
    private ColorEnum color;
    private MotoresEnum motor;
    private String tipoRuedas;
    private double velocidad;
    private LocalDate fechaFabricacion;
    
// CONSTRUCTOR
//    public Vehiculo(){}
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

    public Vehiculo(String marca, String matricula, String modelo, double potencia, ColorEnum color, MotoresEnum motor, String tipoRuedas, double velocidad, LocalDate fechaFabricacion, MedioTransEnum m, boolean esPublico) {
        super(m, esPublico);
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.motor = motor;
        this.tipoRuedas = tipoRuedas;
        this.velocidad = velocidad;
        this.fechaFabricacion = fechaFabricacion;
        
    }

    
//SETTERs

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setMotor(MotoresEnum motor) {
        this.motor = motor;
    }

    public void setVelocidad(double velocidad) {
        if (this.velocidad > 0){
            this.velocidad = this.velocidad + velocidad;
            if (this.velocidad < 0){this.velocidad = 0;}
        }
        
    }
    
    
    //GETTERs

    public double getVelocidad() {
        return velocidad;
    }
    
    
    
    public String getTipoRuedas() {
        return tipoRuedas;
    }
    

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public ColorEnum getColor() {
        return color;
    }

    public MotoresEnum getMotor() {
        return motor;
    }

    public void setTipoRuedas(String tipoRuedas) {
        this.tipoRuedas = tipoRuedas;
    }
    
    
    //TO STRING
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Coche:");
        if(marca != null){
        sb.append("marca = ").append(marca).append("\n");
        }
        if(matricula != null){
        sb.append("matricula = ").append(matricula).append("\n");
        }
        if(modelo != null){
        sb.append("modelo = ").append(modelo).append("\n");
        }
        if(potencia != 0){
        sb.append("potencia = ").append(potencia).append("\n");
        }
        if(color != null){
        sb.append("color = ").append(color).append("\n");
        }
        if(motor != null){
        sb.append("motor = ").append(motor).append("\n");
        }
        if(tipoRuedas != null){
        sb.append("ruedas = ").append(tipoRuedas).append("\n");
        }
        if(fechaFabricacion != null){
        sb.append("fecha = ").append(fechaFabricacion).append("\n");
        }
        return sb.toString();
    }
    
    //METODOS PROPIOS
    
    public  void frenar( ){
        double num = 10.00;
        if (velocidad > 0){
            velocidad = velocidad - num;
            if (velocidad < 0){velocidad = 0;}
        }
        }
    public  void frenar(double num ){
        if (velocidad > 0){
            velocidad = velocidad - num;
            if (velocidad < 0){velocidad = 0;}
        }
        }
    public  void accelerar( ){
        double num = 10.00;

            velocidad = velocidad + num;
        
        }
    public  void accelerar(double num ){
            velocidad = velocidad + num;
        
        }
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaFabricacion, fechaActual);
        return periodo.getYears();
    }

    @Override
    public double calcularPrecio() {
        double precio = 0;
        if(this.isEsPublico()){
            precio = 100;
        }
        return precio;
    }
    }
    
