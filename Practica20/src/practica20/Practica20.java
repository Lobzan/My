/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica20;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num;
     /*int inverso;*/
     int A;
     int B;
     int C;
     int D;
     
     Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("Vamos a ver cuantas cifras tiene un numero entre 0 y 9999 ");
        System.out.println("¿cual quieres saber?");/*Imprime "texto"*/
        num = teclado.nextInt();
        
        
        /*solo funciona con enteros*/
        if (num>999){ 
            System.out.println("Tiene 4 cifras");
            A=(num/1000);
            B=((num%1000)/100);
            C=(((num%1000)%100)/10);
            D=(((num%1000)%100)%10);
            
            /* "este metodo no funcionaba con numeros acabados en 0s" 
            inverso=(num/1000)+(((num%1000)/100)*10)+((((num%1000)%100)/10)*100)+((((num%1000)%100)%10)*1000);
            inverso=A+B+C+D;*/
                    System.out.println("Su inverso es el" +D+C+B+A);
        }
        else{
            if (num>99){ 
                System.out.println("Tiene 3 cifras");
                A=(num/100);
                B=((num%100)/10);
                C=((num%100)%10);
                /*inverso=(num/100)+(((num%100)/10)*10)+(((num%100)%10)*100);*/
                    System.out.println("Su inverso es el "+C+B+A);
            }
            else{
                if (num>9){ 
                    System.out.println("Tiene 2 cifras");
                    A=(num/10);
                    B=(num%10)*10;
                   /* inverso=(num/10)+((num%10)*10);*/
                    System.out.println("Su inverso es el "+B+A);
                }
                else{
                if (num>=0){ 
                        System.out.println("Tiene 1 cifra");
                        System.out.println("Su inverso es el "+num);
                }
                }
            }
        }
        
     

    }
    
}
