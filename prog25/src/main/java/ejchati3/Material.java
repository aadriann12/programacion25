/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati3;

/**
 *
 * @author adria
 */
abstract class Material {
    protected static int id=0;
    protected String titulo;
    protected int añoPubli;

    public Material(String titulo, int añoPubli) {
        this.titulo = titulo;
        this.añoPubli = añoPubli;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    @Override
    public String toString() {
        return "Material{" + "id=" + id + ", titulo=" + titulo + ", a\u00f1oPubli=" + añoPubli + '}';
    }
    
}
