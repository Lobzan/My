/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        double x;
        double x2;
        

        System.out.println("Vamos a calcular el resultado de una ecuación de segundo grado (ax²+bx+c=0)");
        Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
        System.out.println("a = ? ");/*Imprime "texto"*/
        a = teclado.nextInt();
        /*lectura teclado para a*/
        System.out.println("b = ?");
        b = teclado.nextInt();
        /*lectura teclado para b*/
        System.out.println("c = ?");
        c = teclado.nextInt();
        /*lectura teclado para c*/

        x = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

        System.out.println("Los resultados para a="+a +", b="+b +" y c="+c +" son " + x + " y " + x2);
// TODO code application logic here
    }

}
