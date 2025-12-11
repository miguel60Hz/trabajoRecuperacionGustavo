/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.de.un.número;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class FactorialDeUnNúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n= leer.nextInt();
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial de: "+n+" Es: "+factorial);
    }
    
}
