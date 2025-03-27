package figuras;

public class Rect�ngulo extends Figura{
private double base;
private double altura;

public Rect�ngulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}
 
public double getBase(){
return base;
}

public double getAltura(){
return altura;
}

public void setBase(double base){
this.base = base;
}

public void setAltura(double altura){
this.altura = altura;
}

public double per�metro (){
   return 2 * base + 2 * altura;
}

public double �rea (){ 
   return base * altura;
}
}
