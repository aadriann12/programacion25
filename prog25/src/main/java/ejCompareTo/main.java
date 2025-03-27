/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejCompareTo;

import java.util.Arrays;

/**
 *
 * @author adria
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Producto[] prod={
          new Producto("cocacola",2),
          new Producto ("monster",2),
      new Producto ("ginebra",8.99),
      new Producto ("agua",0.80)
      };
      Arrays.sort(prod);
        System.out.println(Arrays.toString(prod));
    }
    
}
