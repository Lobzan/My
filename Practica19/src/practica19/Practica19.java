/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica19;

import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("Vamos a ver cuantas cifras tiene un numero entre 0 y 9999 ");
        System.out.println("¿cual quieres saber?");/*Imprime "texto"*/
        num = teclado.nextInt();
        
        if (num==0 || num<10) 
        /*si el numero es igual que 0 o menor que 10... (Esto trae problemas, cualquier numero menor que 10 dira que tiene una sola cifra, incluidos los negativos) */
        {
        System.out.println("Tiene una cifra");}
        else
        
        {
            if (num==10 || num<100)/*si el numero es igual a 10 o menor que 100...*/
            {  
            System.out.println("Tiene dos cifras");}
            else /*de lo contrario...*/
            {
                if (num==100 || num <1000)/*si el numero es igual que 100 o menor que 1000...*/
                {   
                System.out.println("Tiene tres cifras");}
                else
                {
                    if (num==1000 || num<10000)/*si el numero es igual que 1000 o menor que 10000...*/
                    {
                        System.out.println("Tiene cuatro cifras");
                    }
                                   
                }
            }
        
        
        }    
    
    
    
    
    }
    
    
}
