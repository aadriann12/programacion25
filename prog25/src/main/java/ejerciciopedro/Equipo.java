/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopedro;

/**
 *
 * @author DAW128
 */

public class Equipo {
    private Jugador[] equipo;
    private int contador = 0;

    public Equipo(int cuantos) {
        equipo = new Jugador[cuantos];
        
    }

    public Jugador[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador[] equipo) {
        this.equipo = equipo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}

