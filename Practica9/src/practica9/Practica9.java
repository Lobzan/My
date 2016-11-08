/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.Scanner;


/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double perimetro ; /*Declara variables perimetro y apotema*/
        double apotema ;
       
            Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dame un apotema ");/*Imprime "texto"*/
            apotema=teclado.nextDouble(); /*lectura teclado para apotema*/
            System.out.println("Dame un perimetro ");
            perimetro=teclado.nextDouble(); /*lectura teclado para perimetro*/
            
        /*declara variable areapentagono y su formula*/   
        double areapentagono;
        areapentagono= perimetro*apotema/2 ;
        
        System.out.println("El area del pentagono es " + perimetro + "*" +apotema + "/2 = " + areapentagono);// TODO code application logic here
    }
    
}
