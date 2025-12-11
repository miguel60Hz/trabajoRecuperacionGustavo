/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.promedio;

import java.util.Scanner;

public class CalculadoraDePromedio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        

        double suma = 0;
        int cantidadNumeros;
        
 
        System.out.print("Ingrese la cantidad de numeros a promediar (N): ");
        cantidadNumeros = entrada.nextInt();
        

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double numero = entrada.nextDouble();
            
            suma = suma + numero;
        }
       
        double promedio;
        
        if (cantidadNumeros > 0) {

            promedio = suma / cantidadNumeros; 
            

            System.out.println("\n--- Resultado ---");
            System.out.println("Suma total: " + suma);
            System.out.printf("El promedio de los %d numeros es: %.2f%n", cantidadNumeros, promedio);
        } else {
            System.out.println("No se puede calcular el promedio si no se ingresa ningun numero.");
        }


        entrada.close();
    }
}