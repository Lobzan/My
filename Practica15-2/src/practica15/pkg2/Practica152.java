/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15.pkg2;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica152 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double horas;
        double sueldo_hora;
        double bruto;
        double neto;
        double extras;
        
        
        System.out.println("Vamos a calcular tu sueldo neto semanal");/*Imprime "texto"*/
        Scanner teclado = new Scanner(System.in);
        /*Entrada por teclado*/
        System.out.println("¿Cuantas horas trabajas cada semana?");/*Imprime "texto"*/
        horas = teclado.nextInt();
        System.out.println("¿Cuanto cobras a la hora?");/*Imprime "texto"*/
        sueldo_hora = teclado.nextInt();
        /*lectura teclado para edad*/
      
       extras = (horas -38); 
       bruto = (horas*sueldo_hora) + (extras*sueldo_hora);
       
        if (bruto >300)
        {
            neto=bruto-(bruto/10) + ;
           
        }
        if (horas >38)
        {
            extras=horas-38;
            
        }
           
          
    }
    
}
