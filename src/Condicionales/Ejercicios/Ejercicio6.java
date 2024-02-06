/*
* Hacer un programa que tome dos números y diga si ambos son pares o impares.
* */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Variables
        int numeroUno;
        int numeroDos;


        //Entrada
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));


        //Operación y Salida

        if ((numeroUno % 2 == 0 && numeroDos % 2 == 0)) {

            JOptionPane.showMessageDialog(null, "Ambos números son pares");

        } else if ((numeroUno % 2 != 0 && numeroDos % 2 != 0)) {

            JOptionPane.showMessageDialog(null, "Ambos números son impares");

        } else {

            JOptionPane.showMessageDialog(null, "Un número es par y el otro impar");
        }


    }
}
