/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica25while;
import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica25while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0;
        int suma=0;
        int contador= 0;
      
              
        while (contador<10){
            contador=contador+1;
            num=num+3;
            suma=suma+num;
           
        }
        System.out.println("Los 10 primeros numeros multiplos de 3 suman " + suma);// TODO code application logic here
    }
    
}
