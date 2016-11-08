/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int dia;
            
        Scanner teclado = new Scanner(System.in);    
        System.out.println("Dime un numero del 1 al 7 y te dire a que dia de la semana corresponde");/*Imprime "texto"*/
        dia = teclado.nextInt();
                
switch (dia) {  
    case 1: System.out.println("Lunes");
    break;
    case 2: System.out.println("Martes");
    break;
    case 3: System.out.println("Miercoles");
    break;
    case 4: System.out.println("Jueves");
    break;
    case 5: System.out.println("Viernes");
    break;
    case 6: System.out.println("Sabado");
    break;
    case 7: System.out.println("Domingo");
    break;
    default: System.out.println("La semana no tiene tantos dias");
    break;
}

// TODO code application logic here
    }
    
}
