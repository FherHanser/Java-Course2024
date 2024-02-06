/*

 * Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.
 *
 * */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio8 {

    public static void main(String[] args) {


        //Variable
        int numero;


        //Entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        //Lógica y Salida

        if (numero < 10) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene UNA cifra.");
        } else if (numero < 100) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene DOS cifras.");
        } else if (numero < 1000) {
            JOptionPane.showMessageDialog(null, "El número " + numero + "tiene TRES cifras.");
        } else if (numero < 10000) {
            JOptionPane.showMessageDialog(null, "El número" + numero + "tiene CUATRO cifras.");
        } else if (numero < 100000) {
            JOptionPane.showMessageDialog(null, "El número" + numero + "tiene CUATRO cifras.");
        }

    }
}
