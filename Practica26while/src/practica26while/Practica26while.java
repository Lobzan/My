/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica26while;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica26while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1;
        int suma=0;
        int i= 0;
      
           
        System.out.println("Los impares menores de 20 son: ");
        
        while (i<20){
                suma=suma+num;                
                System.out.println(+num);
                ++i;         
                num=num+2;}
         
        System.out.println("La suma de estos es: " + suma);// TODO code application logic here
    }
    
}
