/*
 * Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 *
 * Una versión opera con Operador Ternario
 * La otra versión opera con if-else.
 *
 *
 * */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Variables
        int numero = 0;
        String mensaje;

        //Entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));


        // 1. Operacion Con ternario
        mensaje = (numero % 10 == 0) ? " SI es múltiplo de 10" : " NO es múltiplo de 10";
        //Salida
        JOptionPane.showMessageDialog(null, "El número: " + numero + mensaje);


        //2. Operacion con if-else
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado SI es Múltiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado NO es Múltiplo de 10");

        }


    }
}
