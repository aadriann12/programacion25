/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Prog25 {

    public static void main(String[] args) {
     Scanner n=new Scanner(System.in);
     DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("pon la fecha");
     LocalDate result=LocalDate.parse(n.nextLine(), f);
        System.out.println("la fecha es "+result.format(f));
     
    }
}
