/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejclas2;

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
        Scanner teclado=new Scanner(System.in);
        System.out.println("bienvenido al programa!");
        boolean salir=false;
        int opcion;
        boolean creado=false;  
        Empresa emp=new Empresa();
        boolean creado2=false;
        while (!salir) {
            try {
                System.out.println( main.mostrar());
                opcion=Integer.parseInt(teclado.nextLine());
                if (opcion<=0||opcion>6) {
                    throw new ExcepcionAdri("numero incorrecto");
                }
              
                switch (opcion) {
                    case 1:
                      
                        if (creado) {
                            System.out.println("ya se ha creado una empresa, tiene "+emp.cont +"empleados");
                        } else {
                               System.out.println("empresa creada");
                        creado=true;
                        }
                    
                        break;
                          case 2:
                             if (creado) {
                            System.out.println("¿Qué tipo de empleado quieres crear? (1) Por horas, (2) Fijo");
                            int opcion2 = Integer.parseInt(teclado.nextLine());
                            if (opcion2 < 1 || opcion2 > 2) {
                                throw new ExcepcionAdri("Número incorrecto");
                            }
                            
                            System.out.print("Nombre: ");
                            String nombre = teclado.nextLine();
                            System.out.print("Apellidos: ");
                            String apellidos = teclado.nextLine();
                            System.out.print("DNI: ");
                            String dni = teclado.nextLine();
                            
                            if (opcion2 == 1) {
                                System.out.print("Horas trabajadas: ");
                                int horasTrabajadas = Integer.parseInt(teclado.nextLine());
                                System.out.print("Tarifa por hora: ");
                                double tarifaPorHora = Double.parseDouble(teclado.nextLine());
                                emp.agregarEmpleado(new EmpleadoPorHoras(horasTrabajadas, tarifaPorHora, nombre, apellidos, dni, 0));
                            } else {
                                System.out.print("Salario mensual: ");
                                double salarioMensual = Double.parseDouble(teclado.nextLine());
                                emp.agregarEmpleado(new EmpleadoFijo(salarioMensual, nombre, apellidos, dni, 0));
                            }
                            System.out.println("Empleado añadido correctamente.");
                        } else {
                            System.out.println("Primero debes instanciar la empresa.");
                        }
                        break;
                    
                          case 3:
                              if (creado) {
                                  for (int i = 0; i < emp.e1.length; i++) {
                                      System.out.println(emp.e1[i].toString());
                                  }
                              }
                        break;
                          case 4:
                              System.out.println("`pon dni");
                              String DNI=teclado.nextLine();
                        emp.eliminarEmpleado(DNI);
                        break;
                          case 5:
                              for (int i = 0; i < emp.e1.length; i++) {
                                  if (emp.e1[i]!=null) {
                                       System.out.println(emp.e1[i].calcularSalario()); 
                                  }
                                 
                              }
                        break;
                          case 6:
                       salir=true;
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (ExcepcionAdri e) {
                
            }catch (NumberFormatException e) {
            }catch (Exception e) {
            }
            
        }
        
        
    }
    public static String mostrar(){
        return "estas son las opciones: "+"\n1.instanciar una empresa"+"\n2.añadir empleados a la empresa"+"\n 3.mostrar info de los empleados"+"\n 4.eliminar empleados y mostrar excepciones si un empleado no existe"+"\n 5. calcular y mostrar el salario de cada empleado"+"\6.salir";
    }
    
}
