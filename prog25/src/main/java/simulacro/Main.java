/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  EmpresaAlquiler adrian=new EmpresaAlquiler();
  Vehiculo v1=new VehiculoTurismo(4,"renault","megane","s76am",3000);
    Vehiculo v2=new VehiculoFurgoneta(800,"kia","carnival","adrian",5000);
  adrian.agregarVehiculo(v1); adrian.agregarVehiculo(v2);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v1.calcularPrecioAlquiler(5));
         System.out.println(v2.calcularPrecioAlquiler(5));
 
        adrian.eliminarVehiculo("hols");
        adrian.eliminarVehiculo("s76am");
         
         
    }
    
}
