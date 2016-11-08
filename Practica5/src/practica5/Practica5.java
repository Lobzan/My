/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
    import java.util.Scanner ; /*carga Scanner*/
/**
 *
 * @author Luis Gordo
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            int edad ; /*declara variable edad*/
            Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dime tu edad");/*mensaje*/
            edad=teclado.nextInt(); /*lectura teclado*/
            System.out.println("edad:" +edad +" años"); /*imprime*/
            
        }
    }
    
}
