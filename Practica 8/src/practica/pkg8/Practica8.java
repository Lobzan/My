/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*declara variables base y altura*/
        int base ; 
        int altura ;
   
        
            Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dame una base ");/*mensaje*/
            base=teclado.nextInt(); /*lectura teclado para base*/
            System.out.println("Dame una altura ");/*Imprime "texto"*/
            altura=teclado.nextInt(); /*lectura teclado para altura*/
            
        /*declara variable areatriangulo y su formula*/   
            int areatriangulo = base*altura/2 ;
        
        System.out.println("El area del triangulo es " + base + "*" +altura + "/2 = " +areatriangulo);
            // TODO code application logic here
    }
    
}
