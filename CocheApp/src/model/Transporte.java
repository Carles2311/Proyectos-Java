/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import tipoEnum.MedioTransEnum;

/**
 *
 * @author carlessalfor
 */
public abstract class Transporte {
    private MedioTransEnum tipo;
    private boolean esPublico;
    
    public abstract double calcularPrecio();

    public Transporte(MedioTransEnum tipo, boolean esPublico) {
        this.tipo = tipo;
        this.esPublico = esPublico;
    }

    
    public MedioTransEnum getTipo() {
        return tipo;
    }

    public void setTipo(MedioTransEnum tipo) {
        this.tipo = tipo;
    }

    public boolean isEsPublico() {
        return esPublico;
    }

    public void setEsPublico(boolean esPublico) {
        this.esPublico = esPublico;
    }
    
    
}
