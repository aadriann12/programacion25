/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adria
 */
public class Vehiculo {
    protected String marca,modelo,matricula;
    protected double precioBase;
    LocalDate fabricacion;
     DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public Vehiculo(String marca, String modelo, String matricula, double precioBase, LocalDate fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioBase = precioBase;
        this.fabricacion = fabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", precioBase=" + precioBase + ", fabricacion=" + fabricacion.format(f) + '}';
    }
    
   
}
