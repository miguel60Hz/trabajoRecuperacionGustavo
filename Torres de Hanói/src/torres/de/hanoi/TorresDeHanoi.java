/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Torres.De.Hanoi;

/**
 *
 * @author miguvelito
 */
import java.util.Scanner;

public class TorresDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de discos: ");
        int nDiscos = scanner.nextInt();
        
        System.out.println("\n Pasos para resolver las Torres de Hanoi ");
        hanoi(nDiscos, 'A', 'C', 'B');
        
        long movimientosMinimos = (long) Math.pow(2, nDiscos) - 1;
        System.out.println("\nSolucion Completada");
        System.out.println("Numero minimo de movimientos: " + movimientosMinimos);
        
        scanner.close();
    }

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        hanoi(n - 1, origen, auxiliar, destino);

        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        hanoi(n - 1, auxiliar, destino, origen);
    }
}