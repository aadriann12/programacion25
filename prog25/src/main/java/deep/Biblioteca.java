/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deep;

/**
 *
 * @author adria
 */
public class Biblioteca {
   public  Material[] materiales=new Material[10];
    public int cont;

    public Biblioteca() {
        cont =0;
        
    }
    
    public void agregarMaterial(Material m){
        if (cont<10) {
           materiales[cont++]=m;
        } else {
            System.out.println("biblioteca llena");
        }
    }
    public void eliminarMaterial(String titulo ){
        try {
                boolean encontrado=false;
        if (cont!=0) {
            for (int i = 0; i < materiales.length; i++) {
                 if (materiales[i]!=null&&materiales[i].getTitulo().equalsIgnoreCase(titulo)) {
                    encontrado=true;
                     for (int j = i; j < materiales.length-1; j++) {
                         materiales[j]=materiales[j+1];
                   
                     }     
                     materiales[cont-1]=null;
                     cont--;
                }
            }
            if (!encontrado) {
                throw new ExcepcionAdri("no encontrado por el titulo"+titulo);
            }
        } else {
            System.out.println("esta vacio");
        }
        } catch (ExcepcionAdri e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
        }
    }
    public String mostrar(){
        String resultado="";
        if (cont!=0) {
            for (int i = 0; i < materiales.length; i++) {
                if (materiales[i]!=null) {
                    resultado+="\n"+materiales[i].toString(); 
                }
               
            }
        } else {
            resultado+="no0 hay valores";
        }
        return resultado;
    }
}
