/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifrado.césar;

import java.util.Scanner;

/**
 *
 * @author migvelito
 */
public class CifradoCésar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"; 
        
        System.out.println("Dame una frase");
        String frase = sn.next();
        
        String texto = codificar(letras,frase);
        System.out.println("Texto codificado"+texto );
        
        texto = Descodificado(letras,frase);
        System.out.println("Texto descodificado");

    }
    
    public static String codificar(String letras, String texto){
        
        String textoCodificado = "";
        
        texto = texto.toUpperCase();
        
        char caracter;
        for (int i = 0; i < texto.length(); i++){
            caracter = texto.charAt(i);
            
            int pos= letras.indexOf(caracter);
            
            if (pos == -1) {
                textoCodificado += caracter;
            }else {
                textoCodificado += letras.charAt( (pos +3 ) % letras.length());
            }
            
        }
        
        return textoCodificado;
        
    }
    
    public static String Descodificado(String letras, String texto){
        
                String textoDescodificado = "";
        
        texto = texto.toUpperCase();
        
        char caracter;
        for (int i = 0; i < texto.length(); i++){
            caracter = texto.charAt(i);
            
            int pos= letras.indexOf(caracter);
            
            if (pos == -1) {
                textoDescodificado += caracter;
            }else {
                if (pos -3 <0){
                    textoDescodificado += letras.charAt(letras.length() + (pos -3));
                }else{
                textoDescodificado += letras.charAt( (pos +3 ) % letras.length());
            }
            
        }
        
        return textoDescodificado;
        
    }
        /* return null;
    

