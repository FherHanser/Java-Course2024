/*
 * Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayúscula
 * */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Variables
        char caracter;

        // Entrada
        String input = JOptionPane.showInputDialog("Ingresa una letra: ");

        // Asegurarse de que la entrada no está vacía
        if (!input.isEmpty()) {
            caracter = input.charAt(0);

            // Operación
            if (Character.isUpperCase(caracter)) {
                JOptionPane.showMessageDialog(null, "La letra " + caracter + " es una letra mayúscula");
            } else if (Character.isLowerCase(caracter)) {
                JOptionPane.showMessageDialog(null, "La letra " + caracter + " es una letra minúscula");
            } else {
                JOptionPane.showMessageDialog(null, "Lo siento, esto NO es una letra");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La entrada está vacía.");
        }
    }
}
