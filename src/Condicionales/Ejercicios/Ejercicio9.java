/*
 * Pedir el día, mes y año de una fecha, e indicar si la fecha es correcta (validación) suponiendo que todos los
 * meses tienen 30 días.
 *
 * */

package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Variables
        int dia, mes, año;


        //Entrada
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));


        //Lógica y Salida
        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha ingresada correctamente" + "\n"+
                            dia +"/"+mes+"/"+año);

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un año válido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un mes válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un día válido");
        }



    }
}
