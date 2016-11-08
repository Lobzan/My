/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28while;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica28while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int i=0;
       int j=1;
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu numero");
        num = teclado.nextInt();

         
        /*El bucle funcionará hasta que j alcance el valor del numero o hasta
        que se detecte 3 divisores(imposible en un primo)
        esto evita tener que calcular todos los divisores antes de dar el resultado*/
        /*Si es divisible de forma entera por j sumará 1 al contador de divisores
            i y 1 al divisor j, si no solo sumará 1 al divisor j */

        while (num>=j && i<3){            
            if (num%j==0){
                i++; j++;}
            else {
                j++;}
        }
        if (i==2){
            System.out.println("Es primo");}
        else {
            System.out.println("No es primo");
        }
/*Si tiene solo 2 divisores mostrará "Es primo",
        de lo contrario mostrará "No es primo" */


      
      
    }
    
}
