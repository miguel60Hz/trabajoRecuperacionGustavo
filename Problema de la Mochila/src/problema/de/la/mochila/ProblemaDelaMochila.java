/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.de.la.mochila;

import java.util.ArrayList;
import java.util.List;

public class ProblemaDelaMochila {
    

    public static int mochila(int capacidad, int[] pesos, int[] valores) {

        if (pesos == null || valores == null || pesos.length != valores.length || capacidad < 0) {
            throw new IllegalArgumentException("Entrada invalida");
        }

        final int N = pesos.length;
        
        int[][] DP = new int[N + 1][capacidad + 1];

        for (int i = 1; i <= N; i++) {
            int pesoActual = pesos[i - 1];
            int valorActual = valores[i - 1];

            for (int c = 1; c <= capacidad; c++) {
                
                DP[i][c] = DP[i - 1][c];

                if (c >= pesoActual) {
                    int valorSiIncluye = DP[i - 1][c - pesoActual] + valorActual;
                    
                    if (valorSiIncluye > DP[i][c]) {
                        DP[i][c] = valorSiIncluye;
                    }
                }
            }
        }

        int c = capacidad;
        List<Integer> itemsSeleccionados = new ArrayList<>();

        for (int i = N; i > 0; i--) {
            if (DP[i][c] != DP[i - 1][c]) {
                int indiceItem = i - 1;
                itemsSeleccionados.add(indiceItem);
                c -= pesos[indiceItem];
            }
        }

        return DP[N][capacidad];
    }

    public static void main(String[] args) {
        
        int capacidad1 = 10;
        int[] V1 = {1, 4, 8, 5};
        int[] W1 = {3, 3, 5, 6};
        System.out.print("Valor Maximo (Capacidad 10): ");
        System.out.println(mochila(capacidad1, W1, V1));

        int capacidad2 = 7;
        int[] V2 = {2, 2, 4, 5, 3};
        int[] W2 = {3, 1, 3, 4, 2};
        System.out.print("Valor Maximo (Capacidad 7): ");
        System.out.println(mochila(capacidad2, W2, V2));
    }
}