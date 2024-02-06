/*
 * Pedir tres números y mostrarlos ordenados de mayor a menor
 *
 * */
package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Variables Iniciales
        int numeroUno, numeroDos, numeroTres;

        // Entrada
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número: "));

        // Lógica de ordenamiento
        // Variables para ordenar
        int mayor, medio, menor;

        if (numeroUno > numeroDos && numeroUno > numeroTres) {
            mayor = numeroUno;
            if (numeroDos > numeroTres) {
                medio = numeroDos;
                menor = numeroTres;
            } else {
                medio = numeroTres;
                menor = numeroDos;
            }

        } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
            mayor = numeroDos;
            if (numeroUno > numeroTres) {
                medio = numeroUno;
                menor = numeroTres;
            } else {
                medio = numeroTres;
                menor = numeroUno;
            }

        } else {
            mayor = numeroTres;
            if (numeroUno > numeroDos) {
                medio = numeroUno;
                menor = numeroDos;
            } else {
                medio = numeroDos;
                menor = numeroUno;
            }
        }

        // Salida
        JOptionPane.showMessageDialog(null, "Números ordenados de mayor a menor: " +
                mayor + ", " + medio + ", " + menor);
    }
}
