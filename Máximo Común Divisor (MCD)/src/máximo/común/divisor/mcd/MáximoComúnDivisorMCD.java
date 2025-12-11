/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package máximo.común.divisor.mcd;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class MáximoComúnDivisorMCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividiendo;
        int divisor;
        int cociente;
        int resta;
        
        Scanner MCD = new Scanner(System.in);
        
        System.out.println("Escriba el primer numero: ");
        int a = MCD.nextInt();
        System.out.println("digite el segundo numero");
        int b = MCD.nextInt();
        System.out.println("\n");
        
        if (a>b){
            dividiendo=a;
            divisor=b;
        }else
        {
            
            dividiendo=b;
                divisor=a;
        }
        
        do
        {
            cociente=dividiendo/divisor;
            resta=dividiendo-(divisor*cociente);
            
            System.out.println("\n");
            System.out.println("El cociente es:  "+cociente);
            System.out.println("La resta es:  "+resta);
            dividiendo=divisor;
            divisor=resta;
           
        }while (resta!=0);
        
        System.out.println("El maximo comun divisor es:  "+dividiendo);
    }
    
}
