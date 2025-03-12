/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deep;

/**
 *
 * @author adria
 */
public class Revista extends Material{
    protected int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, String autor, int añoPublicacion, double precioBase) {
        super(titulo, autor, añoPublicacion, precioBase);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularPrecio() {
        return precioBase+2.5; 
    }

    @Override
    public String toString() {
        return super.toString()+"Revista{" + "numeroEdicion=" + numeroEdicion + '}';
    }

    
}
