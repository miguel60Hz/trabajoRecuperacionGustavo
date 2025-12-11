/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.dos.números;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class SumaDeDosNúmeros {

    public static void main(String[] args) {

        Scanner num =new Scanner(System.in);
        
        int num1;
        int num2;
        int Resultado;
        
        System.out.println("ingrese el primer numero a sumar: ");
        
        num1 = num.nextInt();
        
        System.out.println("ingrese el segundo numero a sumar: ");
        
        num2 = num.nextInt();
        
        Resultado = num1 + num2;
        
        System.out.println("El Resultado final: "+Resultado);
    
       }
}