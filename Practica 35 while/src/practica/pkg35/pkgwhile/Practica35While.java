/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg35.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica35While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0;
        int n = 0;
        int res;
        double func;
        


        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Con que precisión quieres calcular pi?");
        res = teclado.nextInt();
 

        while (n < res) {
            func = (Math.pow(-1, n)) / (2 * n + 1);
            sum +=  func;
            n++;


        }
        double pi = (4 * sum); /*si declaro pi antes o en el while el print de +pi no funciona, da 0*/
        System.out.println("Pi con una resolución de " + res + " es " + pi);
    }
    
}
