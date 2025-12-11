/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador.de.dígitos;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class ContadorDeDígitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        int num = leer.nextInt();
        int contador = 0;
        while(num >= 1){
            contador++;
            num /= 10;
        }
        System.out.println("el numero ingresadotiene: "+contador+" digitos.");
    }
    
}
