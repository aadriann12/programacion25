/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

/**
 *
 * @author adria
 */
public class VehiculoTurismo extends Vehiculo {
    private int numPlazas;

    public VehiculoTurismo(int numPlazas, String marca, String modelo, String matricula, double precioBase) {
        super(marca, modelo, matricula, precioBase);
        this.numPlazas = numPlazas;
    }


    @Override
    public double calcularPrecioAlquiler(int dias) {
    return precioBase*dias+(numPlazas*2);
    }
    
    
}
