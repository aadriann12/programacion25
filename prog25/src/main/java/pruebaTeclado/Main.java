/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaTeclado;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ponga el dni: ");
        String dni=TecLADO.validarDNI(teclado);
        System.out.println(dni);
        try {
            System.out.println("pon un numero ");
            int num=Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
        }
    }
    
}
