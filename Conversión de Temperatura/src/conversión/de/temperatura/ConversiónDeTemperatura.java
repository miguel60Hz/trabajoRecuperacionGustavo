/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversión.de.temperatura;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class ConversiónDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double F, C;
        
        System.out.println("Ingrese la cantidad de grados celsius a convertir: ");
        
        C = lector.nextDouble();
        
        F = (9/5) * C + 32;
        
        System.out.println(C+"grados Celsius eqivalen a "+F+" grados Fahrenheit");
        
    }
    
}
