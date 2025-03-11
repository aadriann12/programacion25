/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejchati2;

/**
 *
 * @author adria
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Juan", 25); // Misma info que p1
        System.out.println("equals");
        p1.equals(p2);//debe dar falso
               p1.equals(p3);//debe dar falso
        System.out.println("hash");
p1.compareTo(p2);
    }
    
}
