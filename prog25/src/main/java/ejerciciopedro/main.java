/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopedro;

import java.util.Scanner;

/**
 *
 * @author DAW128
 */
public class main {

    /**
     * @param args the command line arguments
     */
  

 public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("VALIDANDO ALGUNAS ENTRADAS");
        System.out.println("Introduce el nombre de un jugador");
        String nombre = teclado.nextLine();
        
        int edad = Teclado.validarEdad(teclado);
        double altura=Teclado.validarAltura(teclado);
        
        System.out.println(edad);
        System.out.println(altura);
        
        
        
    }
    }
    