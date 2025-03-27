/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamen;

import java.time.LocalDate;

/**
 *
 * @author adria
 */
public class VehiculoFurgoneta extends Vehiculo implements Alquilable {
    protected double capacidadCarga;

    public VehiculoFurgoneta(double capacidadCarga, String marca, String modelo, String matricula, double precioBase, LocalDate fabricacion) {
        super(marca, modelo, matricula, precioBase, fabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
       return precioBase * dias + (capacidadCarga * 0.5);
    }
    
}
