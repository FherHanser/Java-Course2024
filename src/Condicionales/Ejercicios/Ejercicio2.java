/*
 * Pedir Dos números y decir cual es el mayor o si son iguales.
 * */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Variables
        int numeroUno;
        int numeroDos;


        //Entrada
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número:  "));


        //Operación y Respuesta
        if (numeroUno == numeroDos) {
            JOptionPane.showMessageDialog(null, "El Primer Número es IGUAL al Segundo Número");
        } else if (numeroUno > numeroDos) {
            JOptionPane.showMessageDialog(null, "El Primer Número es MAYOR al Segundo Número");
        } else {
            JOptionPane.showMessageDialog(null, "El Segundo Número es MAYOR al Primer Número");
        }
    }
}
