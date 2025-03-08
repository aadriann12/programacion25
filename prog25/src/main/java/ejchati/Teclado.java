/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Teclado {
    public static String comprobarDNI(Scanner teclado){
        int numero=0;
        String dni="";
        boolean valido=false;
        while (!valido) {
            System.out.println("pon el dni a continuacion");
            try {
                   dni=teclado.nextLine();
        for (int i = 0; i < dni.length(); i++) {
            numero++;
        }
        if (numero!=9) {
            throw new ExcepcionesAdri("dni incorrecto");
        }
        valido=true;
        
        }
           catch (ExcepcionesAdri e) {
           }
             catch (Exception e) {
                 System.out.println("error:"+e.getMessage());
           }
             }
       return dni;
    }
    public static int validarEdad(Scanner teclado){
       boolean valido=false;
       int edad=0;
       while (!valido) {
            System.out.println("pon la edad");
            try {
                  edad=Integer.parseInt(teclado.nextLine());
        if (edad<0) {
            throw new ExcepcionesAdri("edad negativa, tiene que ser positiva");
        }
       
     valido=true;
        }
           catch (ExcepcionesAdri e) {
               System.out.println("error"+e.getMessage());
           }
           
             catch (Exception e) {
                 System.out.println("error:"+e.getMessage());
           }
    
            
       } 
       return edad;
}
}
