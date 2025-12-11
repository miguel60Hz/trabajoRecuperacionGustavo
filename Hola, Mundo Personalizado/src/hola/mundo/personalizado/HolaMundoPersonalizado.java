/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo.personalizado;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class HolaMundoPersonalizado {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in); 
        
        System.out.println("ingrese su nombre: ");
        String nom;
        nom = Scanner.nextLine(); 
        
        System.out.println("!hola, " +nom+ " Bienvenido/a a la algoritmia");
    }
    
}