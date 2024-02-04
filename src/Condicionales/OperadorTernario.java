/*
* Operador Ternario
*
* variable = (condicion) ? respuesta 1 : respuesta 2;
* */


package Condicionales;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {

        //Variables
        int numero;
        String mensaje;


        //Entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un múmero: "));

        //Operación
        // "%" Residuo
        mensaje = (numero%2 == 0) ? "Es par" : "Es impar";

        //Salida

        JOptionPane.showMessageDialog(null, "El Número ingresado es:  "+ mensaje);


    }

}
