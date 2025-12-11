/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package números.primos;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class NúmerosPrimos {

    private static int divisores;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Numeros Primos");
        System.out.println("Digite el limite hasta donde quiere encontrar numeros primos: ");
        
        int limiteInferior = 1;
        int limiteSuperior = leer.nextInt();
        
        for (int i = limiteInferior; i <= limiteSuperior; i++ ) {
        /*String arg = args[i];*/
        int Divisores = 0 ;
         for (int j = 1; j <= i/2; j++) {
             if(i%j==0){
                 Divisores+=2;
             }
             if (Divisores>2){
                 break;
             }
         }
         
        if (Divisores==2){
            System.out.println(i);
    }
        }
                        
    }
    
}
