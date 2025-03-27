/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejCompareTo;

/**
 *
 * @author adria
 */
public class Producto implements Comparable<Producto> {
  protected String nombre;
protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
       int result =Double.compare(o.precio,this.precio);
        if (result==0) {
            result=this.nombre.compareTo(o.nombre);
            
        }
        return result;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
