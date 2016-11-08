/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        
        System.out.println("Si quieres sacarte el carné de autobus tienes que cumplir un requisito");/*Imprime "texto"*/
        Scanner teclado = new Scanner(System.in); /*Entrada por teclado*/
        System.out.println("¿Que edad tienes?");/*Imprime "texto"*/
        edad = teclado.nextInt();
        /*lectura teclado para edad*/
        
        if (edad>=21) { 
            System.out.println("Tienes la edad necesaria");
        } else { 
            System.out.println("No tienes la edad necesaria, necesitas tener al menos 21 años");
        }

// TODO code application logic here
    }

}
