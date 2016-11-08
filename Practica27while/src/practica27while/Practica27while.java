/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica27while;
import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica27while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int multi=0;
        int res;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime un numero y te diré su tabla de multiplicar");
        num = teclado.nextInt();

        while (multi<=10){
                
        res=num*multi;        
        System.out.println(+num + " X " +multi + " = " +res);
        multi++; }           
// TODO code application logic here
    }
    
    
}
