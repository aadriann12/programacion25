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
public class Pintura extends Servicio {//grrkgfnkfjnh
 protected double superficie, precioPintura;

    public Pintura(double superficie, double precioPintura, String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
  //      this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    @Override
    public double costeMaterial() {
        
        return (superficie/7.8)*precioPintura;
    }
    @Override
    public double costeManoObra() {
        return (superficie/7.8)*9.5;
    }

    @Override
    public double costeTotal() {
        if (superficie>50) {
                    return (costeMaterial()+this.costeManoObra())+(0.15*costeMaterial()+this.costeManoObra());

        } else {
        }
        return costeMaterial()+this.costeManoObra();
    }

    @Override
    public String detalleServicio() {//hola
       return super.toString()+"Pintura{" + "superficie=" + superficie + ", precioPintura=" + precioPintura + '}';
    }


 
}
