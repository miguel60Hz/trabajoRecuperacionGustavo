/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par.o.impar;

import java.util.Scanner;

public class ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" digite un numero: ");
        num= entrada.nextInt();
        
        //calculo
        
        if(num % 2 ==0){
            System.out.println(" El numero digitado es par.");
        }else{
            System.out.println(" El numero digitado es impar.");
        }
        
       }
       
    
}
