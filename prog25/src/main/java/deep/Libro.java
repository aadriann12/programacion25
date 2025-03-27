/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deep;

/**
 *
 * @author adria
 */
public class Libro extends Material{
protected int numPaginas;
protected String tipoTapa;

    public Libro(int numPaginas, String tipoTapa, String titulo, String autor, int añoPublicacion, double precioBase) {
        super(titulo, autor, añoPublicacion, precioBase);
        this.numPaginas = numPaginas;
        this.tipoTapa = tipoTapa;
    }

    @Override
    public double calcularPrecio() {
        if (tipoTapa.equalsIgnoreCase("dura")) {
            return precioBase+(numPaginas*0.05);
        } else {if (tipoTapa.equalsIgnoreCase("BLANDA")) {
                return precioBase+(numPaginas*0.03);
            } else {
            System.out.println("error");
            }
        
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "numPaginas=" + numPaginas + ", tipoTapa=" + tipoTapa + '}';
    }

}
