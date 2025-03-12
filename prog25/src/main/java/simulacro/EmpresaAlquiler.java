/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

/**
 *
 * @author adria
 */
public class EmpresaAlquiler {
    Vehiculo[] flotaVehiculo=new Vehiculo[10];
private int cont;
    public EmpresaAlquiler() {
        cont=0;
    }
    public void agregarVehiculo(Vehiculo v){
        System.out.println("añadiendo vehiculo.....");
        if (cont<=10) {
            flotaVehiculo[cont++]=v;
        } else {
            System.out.println("ya se ha llenado la flota");
        }
        
    }
    public void eliminarVehiculo(String matricula){
        
        try {
             boolean encontrado=false;
        if (cont!=0) {
            for (int i = 0; i < flotaVehiculo.length; i++) {
                if (flotaVehiculo[i]!=null&&flotaVehiculo[i].getMatricula().equalsIgnoreCase(matricula)) {
                    encontrado=true;
                    for (int j =i ; j <flotaVehiculo.length; j++) {
                        flotaVehiculo[j]=flotaVehiculo[j+1];
                        if (flotaVehiculo[j]==null) {
                            flotaVehiculo[j-1]=null;
                        }
                        
                        
                        
                    }
                    
                }
            }
        } else {
            System.out.println("no hay vehiculos");
        }
        if (!encontrado) {
           throw new EcepcionAdri("no encontrado dni");
        }
        } catch (EcepcionAdri e) {
        }catch (Exception e) {
        }
 
    }

    @Override
    public String toString() {
        return "EmpresaAlquiler{" + "flotaVehiculo=" + flotaVehiculo + ", cont=" + cont + '}';
    }
    public String mostrar(){ 
        String resultado="";
        if (cont!=0) {
           
        for (int i = 0; i < flotaVehiculo.length; i++) {
            resultado+="\n"+flotaVehiculo.toString();
        }
        
        }else{
                System.out.println("no hay nada para mostrar");
                }
        return resultado;
    }
}
