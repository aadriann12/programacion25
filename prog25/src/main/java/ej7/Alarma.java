/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

import java.time.LocalDate;

/**
 *
 * @author adria
 */
public class Alarma extends Servicio{
    protected int numAlarmas;

    public Alarma(int numAlarmas, String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }

    public int getNumAlarmas() {
        return numAlarmas;
    }

    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }

 
    @Override
    public double costeManoObra() {
return(numAlarmas/3)*40;    }

    @Override
    public double costeTotal() {
return costeManoObra();
        }

    @Override
    public String detalleServicio() {
        return super.toString()+"Alarma{" + "numAlarmas=" + numAlarmas + '}';
    }

    @Override
    public double costeMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
