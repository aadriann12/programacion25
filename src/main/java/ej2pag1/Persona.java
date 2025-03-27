/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2pag1;

import java.time.LocalDate;

/**
 *
 * @author DAW128
 */
public class Persona {
    protected String nombre,DNI;
    protected LocalDate fechaNac;

    public Persona(String nombre, String DNI, LocalDate fechaNac) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaNac=" + fechaNac + '}';
    }
    
}
