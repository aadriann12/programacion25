/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejchati3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Teclado {
    public static String validarISBN(){
        Scanner teclado=new Scanner(System.in);
        boolean valido=false;
        String respuesta,h="";
        while (!valido) {
            try {
                 System.out.println("pon el ISBN ");
                 respuesta=teclado.nextLine();
                 if (respuesta.length()!=13) {
                     throw new ValidacionesAdri("debe tener 13 digitos");
                    
                }
                 valido=true;
                 return respuesta;
            } catch (ValidacionesAdri e) {
                
            }catch (Exception e) {
            }
    
        }
       return h;
    }
    public static int validarDuracion (){
         Scanner teclado=new Scanner(System.in);
      boolean valido=false;
        int respuesta,h=0;
        while (!valido) {
            try {
                 System.out.println("pon la duracion ");
                 respuesta=Integer.parseInt(teclado.nextLine());
                 if (respuesta<0) {
                     throw new ValidacionesAdri("debe ser positivo");
                    
                }
                 valido=true;
                 return respuesta;
            } catch (ValidacionesAdri e) {
                
            }catch (Exception e) {
            }
    
        }
       return h;
}
}