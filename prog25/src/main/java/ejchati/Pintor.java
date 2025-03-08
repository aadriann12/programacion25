/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati;


public class Pintor extends Persona {
    private String estilo;
    private int numExpo;

    public Pintor(String estilo, int numExpo, String nombre, String apellidos, String dni, int edad) {
        super(nombre, apellidos, dni, edad);
        this.estilo = estilo;
        this.numExpo = numExpo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getNumExpo() {
        return numExpo;
    }

    public void setNumExpo(int numExpo) {
        this.numExpo = numExpo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Pintor{" + "estilo=" + estilo + ", numExpo=" + numExpo + '}';
    }
    public void pintar(String nombre){
        System.out.println("estoy pintando el cuadro"+nombre);
    }
    
    
    
}
