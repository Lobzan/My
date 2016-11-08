/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import java.util.Scanner;
import java.lang.Math ;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado;
        double area;
        double volumen;

         Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dame la distancia de un lado");/*Imprime "texto"*/
            lado=teclado.nextInt(); /*Asigna la proxima lectura de teclado a lado*/
            
            /*Formulas para area y volumen del circuloasd*/
         area = 6*Math.pow(lado, 2);
         volumen = Math.pow(lado, 3);
         
        
                 
                  System.out.println("El area de un cubo con lado "+lado + " es "+area);
                  System.out.println("El volumen de un cubo con lado "+lado + " es "+volumen);
           
    }
    
}
