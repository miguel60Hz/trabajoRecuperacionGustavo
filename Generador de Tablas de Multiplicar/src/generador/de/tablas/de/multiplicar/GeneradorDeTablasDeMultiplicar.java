/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generador.de.tablas.de.multiplicar;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class GeneradorDeTablasDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tabla = new Scanner(System.in);
        
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("Digite el numero al que quiere generarle la tabla: ");
        
        int numero = tabla.nextInt();
        
        for (int i = 1; i <=10; i++){
            //numero*i = (numero*i)
            System.out.println(numero+"*"+i+"="+(numero*i));
        }
    }
    
}
