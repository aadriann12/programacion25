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
        while (!salir) {
            try {
                main.mostrar();
                opcion=Integer.parseInt(teclado.nextLine());
                if (opcion<=0||opcion>6) {
                    throw new ExcepcionAdri("numero incorrecto");
                }
              
                switch (opcion) {
                    case 1:
                      
                       
                       
                        creado=true;
                        break;
                          case 2:
                              if (creado) {
                                  System.out.println("que quieres crear? Empleado por horas(1) o empleado fijo(2)");
                                  boolean valido2=false;
                                  int opcion2;
                                  while (!valido2) {
                                      opcion2=Integer.parseInt(teclado.nextLine());
                                      if (opcion2<1||opcion2>2) {
                                          throw new ExcepcionAdri("numero incorrecto");
                                      }
                                      switch (opcion2) {
                                          case 1:
//                                              EmpleadoFijo(double salarioMensual, String nombre, String apellidos, String DNI, double salario)
//                                              System.out.println("Introduce los datos del empleado por horas:");
//        System.out.print("Nombre: ");
//        String nombreHoras = teclado.nextLine();
//        System.out.print("Apellidos: ");
//        String apellidosHoras = teclado.nextLine();
//        System.out.print("DNI: ");
//        String dniHoras = teclado.nextLine();
//        System.out.print("Horas trabajadas: ");
//        int horasTrabajadas = teclado.nextInt();
//        System.out.print("Tarifa por hora: ");
//        double tarifaPorHora = teclado.nextDouble();
//        teclado.nextLine(); // Limpiar buffer
//        emp.agregarEmpleado(new EmpleadoPorHoras(nombreHoras, apellidosHoras, dniHoras, horasTrabajadas, tarifaPorHora));
//;
                                              break;
                                          case 2:
//                                              System.out.print("Nombre: ");
//        String nombre = teclado.nextLine();
//        System.out.print("Apellidos: ");
//        String apellidos = teclado.nextLine();
//        System.out.print("DNI: ");
//        String dni = teclado.nextLine();
//        System.out.print("Salario Mensual: ");
//        double salarioMensual = teclado.nextDouble();
//        emp.agregarEmpleado(new EmpleadoFijo());
                                              //(int horasTrabajadas, double tarifaPorHora, String nombre, String apellidos, String DNI, double salario) {
                                              break;
                                          default:
                                              throw new AssertionError();
                                      }
                                  }
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
