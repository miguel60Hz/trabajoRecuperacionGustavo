/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.números.pares;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class SumaDeNúmerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Favor ingresar un numero: ");
        numero = entrada.nextInt();
        System.out.println("La suma de los primeros "+numero+ " numeros pares es de: "+ ((numero * numero) + numero));
    }
    
}
