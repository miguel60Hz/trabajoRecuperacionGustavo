/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.de.dijkstra;

/**
 *
 * @author miguvelito
 */import java.util.Arrays;

public class Dijkstra {

    private static final int INF = 9999;

    public static void dijkstra(int[][] grafo, int inicio) {
        int numNodos = grafo.length;
        int[] distancias = new int[numNodos];
        boolean[] visitados = new boolean[numNodos];

        Arrays.fill(distancias, INF);
        distancias[inicio] = 0;

        for (int i = 0; i < numNodos; i++) {
            
            int u = encontrarNodoDistanciaMinima(distancias, visitados);

            if (u == -1) break; 
            
            visitados[u] = true;

            for (int v = 0; v < numNodos; v++) {
                if (!visitados[v] && grafo[u][v] != 0 && distancias[u] != INF 
                    && distancias[u] + grafo[u][v] < distancias[v]) {
                    
                    distancias[v] = distancias[u] + grafo[u][v];
                }
            }
        }

        System.out.println("Distancias más cortas desde el nodo " + inicio + ":");
        for (int i = 0; i < numNodos; i++) {
            System.out.println("Nodo " + i + ": " + (distancias[i] == INF ? "INF" : distancias[i]));
        }
    }

    private static int encontrarNodoDistanciaMinima(int[] distancias, boolean[] visitados) {
        int distMinima = INF;
        int nodoMin = -1;
        
        for (int v = 0; v < distancias.length; v++) {
            if (!visitados[v] && distancias[v] < distMinima) {
                distMinima = distancias[v];
                nodoMin = v;
            }
        }
        return nodoMin;
    }

    public static void main(String[] args) {
        int[][] grafoEjemplo = {
            {0, 10, 0, 5, 0},
            {0, 0, 1, 2, 0},
            {0, 0, 0, 0, 4},
            {0, 3, 9, 0, 2},
            {7, 0, 6, 0, 0}
        };

        int nodoInicio = 0;
        dijkstra(grafoEjemplo, nodoInicio);
    }
}