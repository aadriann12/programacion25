package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

public static void main(String[] args) {
int opci�n;
Scanner teclado = new Scanner (System.in);
do { 
   opci�n = mostrarMen�();
   if (opci�n != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();
   switch (opci�n)
	   {  case 1:
	         System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
        	 double lado1 = teclado.nextDouble();
	         System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
        	 double lado2 = teclado.nextDouble();
        	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
        	 double lado3 = teclado.nextDouble();
        	 Tri�ngulo t = new Tri�ngulo(x, y, Color.red, lado1, lado2, lado3);
        	 System.out.println ("El per�metro es " + t.per�metro());
        	 System.out.println ("El �rea es " + t.�rea());
        	 break;
         case 2:
	         System.out.print ("Introduzca la base del rect�ngulo: ");
        	 double base = teclado.nextDouble();
	         System.out.print ("Introduzca la altura del rect�ngulo: ");
        	 double altura = teclado.nextDouble();
        	 Rect�ngulo r = new Rect�ngulo(x, y, Color.red, base, altura);
        	 System.out.println ("El per�metro es " + r.per�metro());
        	 System.out.println ("El �rea es " + r.�rea());
        	 break;
         case 3:
	         System.out.print ("Introduzca el lado del cuadrado: ");
        	 double lado = teclado.nextDouble();
	         Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	         System.out.println ("El per�metro es " + c.per�metro());
	         System.out.println ("El �rea es " + c.�rea());
	         break;
        }
   }
}while (opci�n != 4); 
teclado.close();
}
 
public static int mostrarMen�(){
int opci�n;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opci�n = teclado.nextInt();
    if (opci�n < 1 || opci�n > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opci�n < 1 || opci�n > 4);
return opci�n;
}
}
