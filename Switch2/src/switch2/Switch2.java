/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int plato;
            
        Scanner teclado = new Scanner(System.in);    
        System.out.println("Dime un numero de plato y te dire que es y sus ingredientes");/*Imprime "texto"*/
        plato = teclado.nextInt();
                
switch (plato) {  
    case 1: 
        System.out.println("Spaghetti carbonara: Spaghetti, Bacon, Huevo, Parmesano");
    break;
    case 2: System.out.println("Paella valenciana: Arroz, Conejo, Costilla, Judias, Alcachofa... ");
    break;
    case 3: System.out.println("Burguer: Hamburguesa, Tomate, Lechuga, Huevo, Queso");
    break;
    case 4: System.out.println("Tarta de limon: Harina, Agua, Levadura, Zumo de limon, Azucar");
    break;
    default: System.out.println("Actualmente no tenemos ningun plato con esa numeración");
    break;
}// TODO code application logic here
    }
    
}
