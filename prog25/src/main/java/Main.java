
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
int[] copia = Arrays.copyOf(original, 5);  // Copia con tamaño 5
System.out.println(Arrays.toString(copia));  // [1, 2, 3, 0, 0]
    
}}
