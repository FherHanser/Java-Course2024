package Condicionales;

import javax.swing.*;

public class Condicional_IfElse {

    public static void main(String[] args) {

        //variable
        int numero = 5;
        //Entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número:  "));


        //Sentencia
        if (numero == 5) {

            JOptionPane.showMessageDialog(null, "El número ingresado es 5");

        } else {
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");

        }
    }
}
