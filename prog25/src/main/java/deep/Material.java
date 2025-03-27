/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deep;

/**
 *
 * @author adria
 */
abstract class Material {
    protected String titulo,autor;
    protected int añoPublicacion;
    protected double precioBase;

    public Material(String titulo, String autor, int añoPublicacion, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Material{" + "titulo=" + titulo + ", autor=" + autor + ", a\u00f1oPublicacion=" + añoPublicacion + ", precioBase=" + precioBase + '}';
    }
    public abstract double calcularPrecio();
}
