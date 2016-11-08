/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg33.pkgwhile;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica33While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        int s = 0;

        while (i <= 10000) {

            s += i;
            i += 2;

        }
        System.out.println(+s);

    }

}
