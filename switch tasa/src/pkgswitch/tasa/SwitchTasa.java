/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.tasa;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class SwitchTasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          char estado_civil;
          double bruto;
          double tasa;
          int descuento;
          double sueldo;
          int hijos;
          int incremento;
            
        Scanner teclado = new Scanner(System.in);    
        System.out.println("Dime tu sueldo bruto");
        bruto = teclado.nextInt();
        System.out.println("¿Tu estado civil? Soltero(s), Casado(c), Divorciado(d), Otros(o) ");/*Imprime "texto"*/
        estado_civil = teclado.next(".").charAt(0);
        System.out.println("¿Cuantos hijos tienes?");
        hijos = teclado.nextInt();
      
        switch (hijos){
            case 0: 
                
    switch (estado_civil) {  
    case 's': 
        tasa=0.25;
        sueldo=bruto-(bruto*tasa);
        System.out.println("Se te aplica una tasa del 25%, tu sueldo es "+sueldo);
    break;
    case 'c': 
        tasa=0.05;
        sueldo=bruto-(bruto*tasa);
        System.out.println("Se te aplica una tasa del 5%, tu sueldo es "+sueldo);
    break;
    case 'd':
        tasa=0.20;
        sueldo=bruto-(bruto*tasa);
        System.out.println("Se te aplica una tasa del 20%, tu sueldo es "+sueldo);
    break;
    case 'o': 
        sueldo=bruto;
        System.out.println("No se te aplica tasa alguna, tu sueldo es "+sueldo);
    break;
    default: System.out.println("Tienes que decirme tu estado civil");
    break;
    }
   
            case 1: case 2:
                switch (estado_civil) {  
    case 's': 
        tasa=0.25;
        sueldo=(bruto-(bruto*tasa))*1.15;
        System.out.println("Se te aplica una tasa del 25% y luego un incremento del 15%, tu sueldo es "+sueldo);
    break;
    case 'c': 
        tasa=0.05;
        sueldo=(bruto-(bruto*tasa))*1.15;
        System.out.println("Se te aplica una tasa del 5% y luego un incremento del 15%, tu sueldo es "+sueldo);
    break;
    case 'd':
        tasa=0.020;
        sueldo=(bruto-(bruto*tasa))*1.15;
        System.out.println("Se te aplica una tasa del 20% y luego un incremento del 15%, tu sueldo es "+sueldo);
    break;
    case 'o': 
        sueldo=bruto*1.15;
        System.out.println("No se te aplica tasa alguna pero si un incremento del 15%, tu sueldo es "+sueldo);
    break;
    default: System.out.println("Tienes que decirme tu estado civil");
    break;
                     
        }
    /*default: System.out.println("Tienes que decirme tu estado civil");
    break;*/
    }
}
}