/*
 * Condicionales Múltiples
 * */


package Condicionales;

import javax.swing.*;

public class SentenciaSwitch {
    public static void main(String[] args) {
        //Variable
        int dato;

        //Entrada
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero"));

        //Funcionanmiento de la Sentecia Switch
        switch (dato) {
            case 1: //Las opciones
                JOptionPane.showMessageDialog(null, "Esta es la opción 1");
                break; //Sale del programa cuando se cumpla la opcion requerida.
            case 2:
                JOptionPane.showMessageDialog(null, "Esta es la opción 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Esta es la opción 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Esta es la Opcion 4");

            default:
                JOptionPane.showMessageDialog(null, "ALV, esta opción no existe");

        }
        ;

    }

}
