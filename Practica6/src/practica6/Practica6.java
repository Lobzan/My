/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
    import java.util.Scanner ;
/**
 *
 * @author Luis Gordo
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
            
          Scanner teclado = new Scanner(System.in);/*Entrada por teclado*/
          System.out.println("Dame un numero ");/*mensaje*/
            num1=teclado.nextInt(); /*lectura teclado para num1*/
            System.out.println("Dame otro ");/*Imprime "texto"*/
            num2=teclado.nextInt(); /*lectura teclado para num2*/
        
        int resultadosuma = num1+num2;
        int resultadoresta = num1-num2;
        int resultadomulti = num1*num2;
        int resultadodiv = num1/num2;
        int restodiv = num1%num2;
            /*Imprime los diferentes resultados*/
            System.out.println("Resultado de " + num1 + "+" +num2 + " es " +resultadosuma);
            System.out.println("Resultado de " + num1 + "-" +num2 + " es " +resultadoresta);
            System.out.println("Resultado de " + num1 + "*" +num2 + " es " +resultadomulti);
            System.out.println("Resultado de " + num1 + "/" +num2 + " es " +resultadodiv);
            System.out.println("El resto de la division " + num1 + "/" +num2 + " es " +restodiv);
    }
    
}
