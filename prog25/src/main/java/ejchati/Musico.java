/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati;

/**
 *
 * @author adria
 */
public class Musico extends Persona{
    private String instrumento;
    private int numeroConciertos;

    public Musico(String instrumento, int numeroConciertos, String nombre, String apellidos, String dni, int edad) {
        super(nombre, apellidos, dni, edad);
        this.instrumento = instrumento;
        this.numeroConciertos = numeroConciertos;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getNumeroConciertos() {
        return numeroConciertos;
    }

    public void setNumeroConciertos(int numeroConciertos) {
        this.numeroConciertos = numeroConciertos;
    }

    @Override
    public String toString() {
        return super.toString()+"Musico{" + "instrumento=" + instrumento + ", numeroConciertos=" + numeroConciertos + '}';
    }
    public void tocar(String nombre ){
        System.out.println("estoy tocando"+nombre);
    }
}
