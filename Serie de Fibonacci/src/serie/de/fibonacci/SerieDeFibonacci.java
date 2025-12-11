/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie.de.fibonacci;

import java.util.Scanner;

/**
 *
 * @author miguvelito
 */
public class SerieDeFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" cuantos numeros desea generar?");
                int n = leer.nextInt();
                int f = 0;
                int t1 = 1;
                int t2;
                for (int i=1; i<=n; i++){
                    t2 = f;
                    f =  t1 + f;
                    t1 = t2;
                    System.out.println(t1);
                }
    }
    
}
