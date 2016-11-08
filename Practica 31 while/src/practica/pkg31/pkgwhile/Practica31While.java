/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg31.pkgwhile;

import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica31While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       int num;
       int i=1;
       int suma=0;
       
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu numero");
        num = teclado.nextInt();
        
        while (suma<num) {
        suma=suma+i;
        i++;}
        
        System.out.println("La suma de enteros mayor que y mas cercana a "
                +num + " es "+suma + " y el ultimo digito sumado es " +(i-1));
    }
    
}
