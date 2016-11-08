/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg29.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica29While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int num;
       int i=1;
       
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu numero");
        num = teclado.nextInt();
        
         System.out.print("1/1");
        while (i<num){
           ++i;
            System.out.print(" + 1/" + i);
        }
    }
    
    
    
}

