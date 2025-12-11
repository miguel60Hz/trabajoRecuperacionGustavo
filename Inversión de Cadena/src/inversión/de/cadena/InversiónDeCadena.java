/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversión.de.cadena;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class InversiónDeCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int longitud = 0;
        String cadenaActual;
        String cadenaInvertida = "";
        
        
        System.out.println("Digite una cadena: ");
        cadenaActual = teclado.next();
        
        longitud = cadenaActual.length();
        
        
        while(longitud != 0){
            cadenaInvertida += cadenaActual.substring(longitud - 1, longitud);
            longitud --;
        }
        
        
        System.out.println("La cadena actual es: "+cadenaActual);
        System.out.println("La cadena actual es: "+ cadenaInvertida);
    }   
    
}
