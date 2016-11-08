/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg34;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int select;
        int total = 0;
        int ingreso;
        int gasto;
        int estado = 0;

        Scanner teclado = new Scanner(System.in);

        while (estado == 0) {

            System.out.println("1.Ingreso 2.Gasto 3.Recibo 4.Finalizar (usar solo numero)");
            select = teclado.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Inserta cantidad a sumar");
                    ingreso = teclado.nextInt();
                    total += ingreso;
                    break;
                case 2:
                    System.out.println("Inserta cantidad a restar");
                    gasto = teclado.nextInt();
                    total -= gasto;
                    break;
                case 3:
                    System.out.println("Tu saldo es de " + total);
                    break;
                case 4:
                    estado = 1;
                    System.out.println("Finalizando programa");
                    break;
                default:
                    System.out.println("Error, prueba con 1, 2, 3, y 4");
                    break;

            }
        }
        System.out.println("Programa finalizando");
    }

}
