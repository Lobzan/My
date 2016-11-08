/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg18;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long año;
        long mes;
        
        Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("¿Dime un año?");/*Imprime "texto"*/
        año = teclado.nextLong();
        System.out.println("¿Dime un mes?");/*Imprime "texto"*/
        mes = teclado.nextLong();
        
       if (mes==02)
            {
       if (año%400==0)
       {
           System.out.println(" Tiene 29 dias");
       }
       else
       {
           if (año%100==0)
           {
               System.out.println("Tiene 28 dias");
           }
           else
           {
               if (año%4==0)
               {
                    System.out.println("Tiene 29 dias");
               } 
               else 
               {
                    System.out.println("Tiene 28 dias");
               }
           }
       }
             }
       else
       {
           if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes== 12)
           {
               System.out.println("Tiene 31 dias");
           }
           else
           {
           if (mes==4 || mes==6 || mes==9 || mes==11)
           {
               System.out.println("Tiene 30 dias");
           }
           else
           {
               System.out.println("No es un valor valido de mes");
           }
           }
       }
       
        
    }
    
}
