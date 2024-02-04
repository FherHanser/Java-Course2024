/*
 * Un obrero necesita calcular su salario semanal, el cual obtiene de la siguiente manera:
 * Si trabaja 40 horas o menos se le paga Q16 la hora.
 * Si trabaja mas de 40 horas se le paga Q16 porcada hora las primera 40 horas y 20 cada hora extra.
 *
 * */


package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Variables
        int horasTrabajadas;
        int horasExtras;
        int pagoHoras;
        int pagoHorasExtras;
        int TotalSalario;

        //Entrada
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas trabajadas: "));

        //Operación
        if (horasTrabajadas <= 40) {
            TotalSalario = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "El salario es: " + TotalSalario);
            JOptionPane.showMessageDialog(null, "**NO hay horas extras**");
        } else {
            horasExtras = horasTrabajadas - 40;
            pagoHoras = (horasTrabajadas - horasExtras) * 16;
            pagoHorasExtras = horasExtras * 20;

            TotalSalario = pagoHoras + pagoHorasExtras;

            JOptionPane.showMessageDialog(null, "El salario es: " + "\n\n" +
                    "Salario: Q " + pagoHoras + "\n" +
                    "Horas Extras: " + horasExtras + " = Q " + pagoHorasExtras + "\n" +
                    "_____________________________________\n" +
                    "Pago Total: Q " + TotalSalario);

        }

    }
}
