/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

/**
 *
 * @author adria
 */
public class VehiculoFurgoneta extends Vehiculo {
    private double capacidadCarga;

    public VehiculoFurgoneta(double capacidadCarga, String marca, String modelo, String matricula, double precioBase) {
        super(marca, modelo, matricula, precioBase);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
       return precioBase*dias+(capacidadCarga*0.5);
    }
    
}
