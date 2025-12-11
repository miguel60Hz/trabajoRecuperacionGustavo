/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrar.el.mayor;
import java.util.Scanner;

public class EncontrarElMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        int a,b,c;
        
        System.out.println("ingresa 3 numeros");
        
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        if (a != b && a != c && b != c){ 
            if (a > b){
                    if ( a > c){
                        System.out.println("El numero mayor es: "+a);
                    }
                    else{
                        System.out.println("El numero mayor es: "+c);
                    }
                }
            else{
                if (b > c){
                    System.out.println(" el numero mayor es: "+b);
                }
                else{
                    System.out.println("el numero mayor es: "+c);
                }
            }
          }
        else{
            System.out.println("Los numeros deben ser diferentes");
        }
        }
    }
    

