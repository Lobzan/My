/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg32.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica32While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int i = 2;
        int s = 1;


        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que numero quieres factorizar?");/*Imprime "texto"*/
        num = teclado.nextInt();

        System.out.print(" 1");
        while (i <= num) {
            

            System.out.print(" x " + i);
            s *= i;
            ++i;
        }
        System.out.println(" = " + s);
    }
    
}
