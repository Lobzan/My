/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;
    import java.util.Scanner;
    import java.lang.Math ;/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long euros ; /*declara variable euros como long*/
        
            Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
            System.out.println("Dame una cantidad de dinero en € y lo descompondré en la menor cantidad de billetes y monedas posible");/*Imprime "texto"*/
            euros=teclado.nextInt(); /*lectura teclado para euros*/
            
            /*Declara variabes de billetes, monedas y modulos*/
        long b500;
        long mod500 = euros%500 ;
        long b200;
        long mod200 = mod500%200 ;
        long b100;
        long mod100 = mod200%100;
        long b50;
        long mod50 = mod100%50;
        long b20;
        long mod20 = mod50%20;     
        long b10;
        long mod10 = mod20%10;
        long b5;
        long mod5 = mod10%5;
        long m2;
        long mod2 = mod5%2;
        long m1;
        long mod1 = mod2%1;
                       
        /*define los billetes como la parte entera que sobra al dividir entre el valor del billete y trabajamos con el resto de euros del billete de superior valor*/ 
        b500 = euros/500;
        b200 = mod500/200;
        b100 = mod200/100;
        b50 =  mod100/50;
        b20 =  mod50/20;
        b10 =  mod20/10;
        b5 =   mod10/5;
        m2 = mod5/2;
        m1 = mod2/1;
                
          
        
        
        System.out.println(+euros + "€ se descomponen de la siguiente manera ");
        System.out.println("Billetes de 500€: " +b500);
        System.out.println("Billetes de 200€: " +b200);
        System.out.println("Billetes de 100€: " +b100);
        System.out.println("Billetes de 50€: " +b50);
        System.out.println("Billetes de 20€: " +b20);
        System.out.println("Billetes de 10€: " +b10);
        System.out.println("Billetes de 5€: " +b5);
        System.out.println("Monedas de 2€: " +m2);
        System.out.println("Monedas de 1€: " +m1);
        
// TODO code application logic here
    }
    
}
