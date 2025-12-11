/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento.burbuja;

import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            

            for (int j = 0; j < n - i - 1; j++) {
                

                if (arreglo[j] > arreglo[j + 1]) {
                    
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] datos = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Arreglo original: " + Arrays.toString(datos));

        ordenarBurbuja(datos);

        System.out.println("Arreglo ordenado: " + Arrays.toString(datos));
    }
}