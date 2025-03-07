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
abstract class Servicio {
    protected String trabajador;
    protected LocalDate fechaInicio;
    protected String cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public abstract double costeMaterial();
      protected abstract double costeManoObra();
        protected abstract double costeTotal();
        protected abstract String detalleServicio();

    @Override
    public String toString() {
        return "Servicio{" + "trabajador=" + trabajador + ", fechaInicio=" + fechaInicio + ", cliente=" + cliente + '}';
    }
        
    
}
