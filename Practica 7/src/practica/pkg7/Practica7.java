/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg7;
    import java.util.Scanner ; /*importar paquetes Scanner y Math*/
    import java.lang.Math ;
/**
 *
 * @author Luis Gordo
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int radio; /*declara radio*/
        
          Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dame un radio ");/*mensaje*/
            radio=teclado.nextInt(); /*lectura teclado para radio*/
            
        double resultadoarea; /*Utiliza variable double para usar Math.PI*/
        resultadoarea= Math.PI * Math.pow(radio, 2) ;
        double resultadocirc; 
        resultadocirc= 2*Math.PI *  +radio ;
        
        System.out.println("El area es " +resultadoarea );/*mensaje resultado*/
        System.out.println("La circunferencia es " +resultadocirc );/*mensaje*/
    }
    
}
