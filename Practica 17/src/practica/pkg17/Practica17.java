/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg17;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        
        Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("¿Que año quieres saber si es bisiesto?");/*Imprime "texto"*/
        año = teclado.nextInt();
        
        
       if (año%400==0)
       {
           System.out.println(" Es bisiesto");
       }
       else
       {
           if (año%100==0)
           {
               System.out.println("No es bisiesto");
           }
           else
           {
               if (año%4==0)
               {
                    System.out.println("Es bisiesto");
               } 
               else 
               {
                    System.out.println("No es bisiesto");
               }
           }
       }
    
        
               // TODO code application logic here
    }
    
}
