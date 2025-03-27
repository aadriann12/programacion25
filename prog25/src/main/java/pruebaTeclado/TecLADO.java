/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaTeclado;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class TecLADO {
    public static String validarDNI(Scanner teclado){
        boolean valido=false;
        String resultado="";
        while (!valido) {
            try {
          resultado=teclado.nextLine();
                if (resultado.length()!=9) { 
                    throw new ExcepcionAdri("dni incorrecto, repitalo");
                    
                }
                valido=true;
                
            }  catch (ExcepcionAdri e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                 System.out.println(e.getMessage());
            }
            
        }
        return resultado;
    }
}
