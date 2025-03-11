/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati3;

/**
 *
 * @author adria
 */
public class Libro extends Material{
    protected String autor;
    public  String ISBN;

    public Libro(String autor, String titulo, int añoPubli) {
        super(titulo, añoPubli);
        this.autor = autor;
        this.ISBN = Teclado.validarISBN();
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "autor=" + autor + ", ISBN=" + ISBN + '}';
    }
    
}
