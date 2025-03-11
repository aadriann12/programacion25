/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejclas2;

/**
 *
 * @author adria
 */
public class EmpleadoPorHoras extends Empleado {
    protected int horasTrabajadas;
    protected double tarifaPorHora;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora, String nombre, String apellidos, String DNI, double salario) {
        super(nombre, apellidos, DNI, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
       return horasTrabajadas*tarifaPorHora;
    }
   
}
