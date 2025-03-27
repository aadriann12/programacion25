/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejclas2;

/**
 *
 * @author adria
 */
public class EmpleadoFijo extends Empleado{
    protected double salarioMensual;

    public EmpleadoFijo(double salarioMensual, String nombre, String apellidos, String DNI, double salario) {
        super(nombre, apellidos, DNI, salario);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
     return salarioMensual;
    }
    
}
