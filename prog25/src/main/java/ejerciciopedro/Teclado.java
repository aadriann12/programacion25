/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopedro;

import java.util.Scanner;

/**
 *
 * @author DAW128
 */
public class Teclado {
     //voy a utilizar esta clase para validar las entradas
    
    public static int validarEdad(Scanner teclado){//el método es static
     int edad = 0;
        boolean valida = false;
        
        while(!valida){
            
            try{
                System.out.println("Escribe la edad del jugador");
                edad = Integer.parseInt(teclado.nextLine());
                if(edad < 0){
                    throw new ExcepcionPedro("La edad no puede ser negativa");
                }
                valida = true;
                
            }catch(NumberFormatException e2){
                System.out.println("Revisa el número que has introducido");
            }
            catch(ExcepcionPedro e1){
                System.out.println(e1.getMessage());
            }
            
            
        }
        
        
        return edad;
    }
    
    
    public static double validarAltura(Scanner teclado){
        double altura = 0;
        boolean valida = false;
        //código parecido al anterior
        while (!valida) {
            try {
                System.out.println("ponga su altura");
                altura=Double.parseDouble(teclado.nextLine());
                if (altura<0||altura>2.50) {
                    throw new ExcepcionPedro("numero incorrecto");
                } 
                  valida=true;
            }
            catch(NumberFormatException e2){
                System.out.println("Revisa el número que has introducido");
            }catch(ExcepcionPedro e){
                System.out.println(e.getMessage());
            }
            
            catch (Exception e) {
                System.out.println("error:"+e.getMessage());
            }
        } 
     
        return altura;
    }
    
    
}