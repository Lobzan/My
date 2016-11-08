/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double area;
        double volumen;

        Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
        System.out.println("Dame un radio");/*Imprime "texto"*/
        radio = teclado.nextInt();
        /*lectura teclado para radio*/

        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

        System.out.println("El area de una esfera con radio " + radio + " es " + area);
        System.out.println("El volumen de una esfera con radio " + radio + " es " + volumen);
// TODO code application logic here
    }

}
