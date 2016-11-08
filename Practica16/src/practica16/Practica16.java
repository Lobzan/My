/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float nota;
       
       
       Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("¿Cual es la nota?");/*Imprime "texto"*/
        nota = teclado.nextFloat();
        
        /*Condicionales para cada nota*/
        if (nota<5)
        {
            System.out.println(" Tienes un " + nota + " , Suspenso");
        }
        else
        {
        if (nota== 5 || nota < 6.5 )
        {
            System.out.println(" Tienes un " + nota + " , Aprobado");
        }
        else
        {
        if (nota== 6.5 || nota < 8.5)
        {
            System.out.println(" Tienes un " + nota + " , Notable");
        }
        else
        {
        if (nota== 8.5 || nota < 10)
        {
            System.out.println(" Tienes un " + nota + " , Sobresaliente");
        }
        else
        {
         if (nota== 10 )
        {
            System.out.println(" Tienes un " + nota + " , Matricula");
        }   
         else
         {
             System.out.println(" Eso no es una nota, maximo 10");
         }
        }
        }
        }        
        }
    }
    
}
