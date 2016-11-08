/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

/**
 *
 * @author Luis Gordo
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declara variables num1, num2 y resultado y sus valores*/
        int num1 ;
        int num2 ;
        int resultado  ;
        int resto ;
        int resto2 ;
        
        num1 = 7;
        num2 = 3;
        resultado = num1/num2;
        resto = num1%num2;
        resto2 = num1-(num2*resultado);
        /*Operador mod% (resto enteros) *"/
         
        
           /*Muestra en pantalla un "texto" y resultado y resto*/
        System.out.println("La division de 7 entre 3 es "  + resultado);
        System.out.println("El resto es  "  + resto);
        System.out.println("O lo que es lo mismo 'num1-(num2*resultado)' = "  + resto2);
    }
    
}
