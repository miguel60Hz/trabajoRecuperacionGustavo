/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminación.de.duplicados;

/**
 *
 * @author miguvelito
 */
public class EliminaciónDeDuplicados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] A = {1,2,3,4,5,2};
        int [] B = new int[A.length];
        
        int j,top = 0;
        boolean repetido;
        
        for(int i = 0; i< A.length; i++){
            repetido = false;
            j=0;
            while(!repetido && (j<top) ){
                if(A[i] == B[j]){
                    repetido = true;
                }
                j++;
            }
            
            if(!repetido){
                B[top] = A[i];
                top++;
            }
        }
        System.out.println("Arreglo original: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + "");
        }
        
        System.out.println("");
        
        System.out.println("Arreglo sin repetido: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(B[i] + "");
        }
    }
    
}
