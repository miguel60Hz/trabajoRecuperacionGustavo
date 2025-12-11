/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.básica;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class CalculadoraBásica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner calculadora=new Scanner(System.in);
        
        int numero1, numero2, opcion;
        
        System.out.println("ingrese numero 1: ");
        numero1 = calculadora.nextInt();
        System.out.println("ingrese Numero 2: ");
        numero2 = calculadora.nextInt();
        
        do{
        System.out.println("1.- Sumar.");
        System.out.println("2.- Restar.");
        System.out.println("3.- Multiplicar.");
        System.out.println("4.- Dividir.");
        System.out.println("Ingrese una opcion");
        opcion = calculadora.nextInt();
        }while (opcion < 1|| opcion > 4);
        switch (opcion){
            case 1:
                System.out.println(numero1+numero2);
                break;
            case 2:
                System.out.println(numero1-numero2);
                break;
            case 3:
                System.out.println(numero1*numero2);
                break;
            case 4:
                System.out.println(numero1/numero2);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("gracias");
        }
    }
    
}
