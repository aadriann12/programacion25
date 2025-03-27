/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejchati3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int cont=0,cont2=0;
        Material[] d1=new Material[10];

   int opcion,op2;
   boolean valido=false;
        while (!valido) {
            try {
               System.out.println("bienvenido a la app");
            System.out.println(main.mostrar(    )); 
            opcion=Integer.parseInt(teclado.nextLine()  );
                if (opcion<0&&opcion>4) {
                    throw new ValidacionesAdri("numero no disponible");
                }
                switch (opcion) {
                    case 1:
                 
                        boolean valid2=false;
                        while (!valid2) {
                            try {
                                      System.out.println("quieres crear dvd(1) o libro(2)");
                            op2=Integer.parseInt(teclado.nextLine());
                                if (op2!=1||op2!=2) {
                                    throw new ValidacionesAdri("debe ser o 1 o 2");
                                }
                                valid2=true;
                                switch (op2) {
                                    case 1:
                                        System.out.println("pon el director");
                                        String director=teclado.nextLine();
                                          System.out.println("pon el duracion");
                                        int duracion=Integer.parseInt(teclado.nextLine()  );
                                          System.out.println("pon el titulo");
                                        String titulo=teclado.nextLine();
                                          System.out.println("pon el añopubli");
                                        int añoPubli=Integer.parseInt(teclado.nextLine()  );
                                        d1[cont++]=new DVD(director,duracion,titulo,añoPubli);
                                        
                                        break;
                                         case 2:
                                           System.out.println("pon el director");
                                        String autor=teclado.nextLine();
                                          System.out.println("pon el duracion");
                                        String Titulo=teclado.nextLine();
                                          System.out.println("pon el titulo");
                                        int añopubli=Integer.parseInt(teclado.nextLine()  );
                                        
                                        d1[cont2++]=new Libro(autor,Titulo,añopubli);
                                        
                                        break;

                                    default:
                                        throw new AssertionError();
                                }
                            }catch (ValidacionesAdri e) {
                            } catch (NumberFormatException e) {
                                System.out.println("pon un njumero");
                            }catch (Exception e) {
                                
                                System.out.println("fallo");
                            }
                             
                        }
                       
                        case 2:
                            System.out.println("dvd: ");
                            for (int i = 0; i < d1.length; i++) {
                                if (d1[i]!=null) {
                                    System.out.println(d1[i].toString());
                                }
                            }System.out.println("libros:");
                                                        for (int i = 0; i < d1.length; i++) {
                                if (d1[i]!=null) {
                                    System.out.println(d1[i].toString());
                                }
                            }
                              
                        break;
                        case 3:
                        
                        break;
                        case 4:
                        valido=true;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            catch (ValidacionesAdri e) {
                
            }
            catch (NumberFormatException e) {
                System.out.println("debe ser numero");
            }catch (Exception e) {
                System.out.println("ajaj");
            }
            
            
        }
        
    }
    public static String mostrar(){
        return "1.añadir libro o dvd"+"\n 2.listar todos los productos"+"\n 3.buscar material por id"+"\n4.salir";
    }
  
    
}
