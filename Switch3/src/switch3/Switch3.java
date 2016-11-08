/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch3;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Switch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
        Scanner teclado = new Scanner(System.in);    
        System.out.println("Dime un numero y te digo si es negatio o mayor que 30, en caso contrario si es par y si es potencia de 2 ");/*Imprime "texto"*/
        num = teclado.nextInt();

/*if (num<0 || num>30){caso=1;
}else if {*/
       if (num<0){
        System.out.println("El numero es negativo");
       if (num>30){
           System.out.println("El numero es mayor que 30");}
       }
       else{
           
       }
        switch (num){
            case 0:  case 2: case 4: case 6: case 8: case 10: case 12: case 14: case 16: case 18: 
            case 20: case 22: case 24: case 26: case 28: case 30: 
                System.out.println("No es ni negativo ni mayor que 30, además es par");
            if ((Math.log(num)/Math.log(2))%1==0){
                System.out.println("Es potencia de 2");
            }
            else { System.out.println("No es potencia de 2");}
                 
           break;
           default: 
               System.out.println("No es ni negativo ni mayor que 30, además es impar");
    


// TODO code application logic here
    }
    
}}
