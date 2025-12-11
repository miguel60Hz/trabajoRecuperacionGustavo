/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificación.de.palíndromo;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class VerificaciónDePalíndromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("ingresa una palabra: ");
        
        String palabra = entrada.next();
        
        if (palindromo(palabra)== true){
            System.out.println("Es palindromo");
        }else {
            System.out.println("NO es palindromo");
        }
    }
    
    public static boolean palindromo(String s){
        
        for (int i=0, j=s.length()-1; i<j; ++i,--j){
        if (s.charAt(i) != s.charAt(j)){
            return false;
        }
        
    }
        return false;
  }
    
}
