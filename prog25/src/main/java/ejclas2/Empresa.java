/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejclas2;

/**
 *
 * @author adria
 */
public class Empresa {
    Empleado[] e1;
  int cont;


    public Empresa() {
        this.e1=new Empleado[10];
        this.cont=0;
              }
    
    public void agregarEmpleado(Empleado e2){
        if (cont<e1.length) {
            e1[cont++]=e2;
            
            
        }else{
            System.out.println("no se pueden añair mas");
        }
     
    }
    public void eliminarEmpleado(String DNI){
        try {
              boolean encontrado=false;
        for (int i = 0; i < e1.length; i++) {
            if (e1[i]!=null&&e1[i].getDNI().equalsIgnoreCase(DNI)) {
           
                encontrado=true;
                for (int j = e1.length-1; j >= i; j--) {
                    e1[j]=e1[j-1];
                }
        
            }
            }
        if (!encontrado) {
           throw new EmpleadoNOEncontrado("no se ha encontrado");
            
        }else{
                System.out.println("encontrado, elliminando....");
                System.out.println("eliminado");
        }
        } catch (EmpleadoNOEncontrado e) {
        }catch (Exception e) {
        }
   
      
        }
    
    
    
}
