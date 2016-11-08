/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        extras = horas-38;

        if (horas > 38) 
            {

            bruto = horas * sueldo_hora + extras * sueldo_hora *1.5;

            System.out.println("Has trabajado 38 horas a " + sueldo_hora
                    + " €/h y " + extras + " horas extra a " + sueldo_hora * 1.5 
                    + " €/h que hace un total de " + bruto + " euros brutos");
            
            if (bruto >300)
                
                { 
                neto=bruto-(bruto/10);
                System.out.println("Has cobrado más de 300€ brutos, se te aplica una tasa del 10%. "
                        + "El impuesto es de " + (bruto/10));
                System.out.println("Tu sueldo neto es de " + neto + " €");
                }
            
            else 
                {
                neto=bruto;
                System.out.println("Has cobrado menos de 300€ brutos, no se te aplica ningun impuesto");
                System.out.println("Tu sueldo neto es de " + neto + " €");
                }
            }
        else 
        {           
         
        bruto = horas*sueldo_hora;
        
         if (bruto >300)
                { 
                neto=bruto-(bruto/10);
                System.out.println("Has cobrado más de 300€ brutos, se te aplica una tasa del 10%. "
                        + "El impuesto es de " +(bruto/10));
                System.out.println("Has cobrado " + neto + " € netos");
                
                }
         else 
         {
             neto=bruto;
             System.out.println("Has cobrado menos de 300€ brutos, " + neto + " € netos");
        
         }
        }
    }}
              
       
