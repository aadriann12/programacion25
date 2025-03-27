/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deep;

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Biblioteca n1=new Biblioteca();
        crear(n1);
              System.out.println(mostrar(n1));
              borrar(n1);
              System.out.println("ahora sin uno ");   System.out.println(mostrar(n1));
              
    }
   public static void crear(Biblioteca n1){
       System.out.println("creando");
     n1.agregarMaterial(new Libro(33,"blanda","tituloadrian","adrian",2004,44.80));
         n1.agregarMaterial(new Libro(33,"dura","el principito","adrian",2006,44.80));
     n1.agregarMaterial(new Revista(22,"muy interesante","adrian",2005,22));
     
   }
   public static String mostrar(Biblioteca n1){
     return   n1.mostrar();
   }
   public static void borrar (Biblioteca n1){
       System.out.println("borrando");
       n1.eliminarMaterial("tituloadrian");
          n1.eliminarMaterial("de");
   }
   public static void calcular(Biblioteca n1){
       System.out.println(n1.materiales[0].calcularPrecio());
           System.out.println(n1.materiales[1].calcularPrecio());
   }
}
