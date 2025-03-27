/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejchati;

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
        int cont=0;
        System.out.println("bienvenido al programa!");
        Persona[] p1=new Persona[10];
        boolean valido=false;
        boolean valido2=false;
        int opc;
        int opcion;
        while (!valido) {
            try {
                 System.out.println(Main.mostrar());
            opcion=Integer.parseInt(teclado.nextLine()); 
                if (opcion<=0||opcion>5) {
                    throw new ExcepcionesAdri("el numero es incorrecto");
                    
                }
                switch (opcion) {
                    case 1:
                     
                        while (!valido2) {
                       
                                if (cont<10) {     try {
                                     System.out.println("pintor(1) o musico(2)?");  
                             opc=Integer.parseInt(teclado.nextLine());
                             if (opc!=1||opc!=2) {
                                 throw new ExcepcionesAdri("num incorrecto");
                                
                            }
                             valido2=true;
                                System.out.println("pon nombre");
                                String nombre=teclado.nextLine();
                                
                                        System.out.println("pon apellidos");
                                String apellidos=teclado.nextLine();
                                
                                        System.out.println("pon dni");
                                String dni= Teclado.comprobarDNI(teclado);
                                
                                 System.out.println("pon edad");
                                int edad=Teclado.validarEdad(teclado);
                                
                                switch (opc) {
                                    case 1:
                                                System.out.println("pon estilo");
                                String estilo=teclado.nextLine();
                                
                                 System.out.println("pon num exposiciones");
                                int numExpo=Integer.parseInt(teclado.nextLine());
                                 
                                         p1[cont++]=new Musico(estilo,numExpo,nombre,apellidos,dni,edad);
                                        break;
                                    case 2:
                                                  System.out.println("pon instrumento");
                                String instrumento=teclado.nextLine();
                                
                                 System.out.println("pon numConc");
                                int numConc=Integer.parseInt(teclado.nextLine());
                                p1[cont++]=new Musico(instrumento,numConc,nombre,apellidos,dni,edad);
                                        break;
                                        
                                    default:
                                        throw new AssertionError();
                                }
                            } 
                             catch (ExcepcionesAdri e) {
                                 System.out.println(e.getMessage());
                            }
                             catch (NumberFormatException e) {
                                 System.out.println("error"+e.getMessage());
                            }catch (Exception e) {
                            }
                             
                        }
                       
                        
                                }
                                
                        break;
                        case 2:
                            for (int i = 0; i < p1.length; i++) {
                                System.out.println(i+". "+p1[i].toString());
                            }
                            
                        break;
                        case 3:
                        String dni=Teclado.comprobarDNI(teclado);
                            for (int i = 0; i < p1.length; i++) {
                                if (p1[i]!=null&&p1[i].getDni()==dni) {
                                    System.out.println("encontrado:"+p1[i].toString());
                                } else {
                                    System.out.println("no encontrado");
                                }
                            }
                        break;
                        case 4:
                           
                        break;
                        case 5:
                        valido=true;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            catch (ExcepcionesAdri e) {
                System.out.println("error"+e.getMessage());
                
            }
            catch (NumberFormatException e) {
                System.out.println("numero incorrecto");
            }
            catch (Exception e) {
            }
          
            
            
        }
        
        
        
    }
    
    public static String mostrar(){
        return "1. agregar un nuevo artista"+"\n 2.listar los artistas"+"\n 3.buscar artista por DNI"+"\n 4.realizar una accion de un artista"+"\n5.salir";
    }
    
}
