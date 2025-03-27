/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati3;

/**
 *
 * @author adria
 */
public class DVD extends Material{
    protected String director;
    protected int duracion;

    public DVD(String director,int duracion, String titulo, int añoPubli) {
        super(titulo, añoPubli);
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString()+"DVD{" + "director=" + director + ", duracion=" + duracion + '}';
    }
    
}
