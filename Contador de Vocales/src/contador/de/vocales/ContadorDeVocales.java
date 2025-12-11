/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador.de.vocales;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class ContadorDeVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        
        int count = 0,i;
        char letra;
        
        System.out.println("Ingresa una frase: ");
        cadena = leer.nextLine();
        
        for(i=0;i<cadena.length();i++){
            letra = Character.toLowerCase(cadena.charAt(i));
            if(letra == 'a' || letra == 'e'||letra =='i'|| letra == 'o'|| letra == 'u'){
                count++;
            }
        }
        
        System.out.println("La cantidad de vocales en la frase es: "+count);
        
    }
    
}
