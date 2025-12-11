/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package búsqueda.binaria;

/**
 *
 * @author miguvelito
 */
public class BúsquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A [] = {1,2,3,4,5,6,7,8,9,10};
        
        int pos = BusquedaBinaria(A,13);
        
        if(pos == -1){
           
            System.out.println("El dato no esta en el arreglo");
        }else{
            System.out.println("El dato se encuentra en la posicion: "+pos);
        }

    }
    
    public static int BusquedaBinaria(int [] A, int dato){
        int inicio,fin,mitad;
        inicio = 0;
        fin = A.length - 1;
        
        while(inicio < fin){
            mitad = (inicio + fin)/2;
            if (A [mitad] == dato){
                return mitad;
            }else if (A[mitad] < dato){
                return mitad;
            }else if (A[mitad] < dato){
                inicio = mitad +1;
            }else{
                fin = mitad -1;
            }
                
          }
        
        return -1;
        }
}
