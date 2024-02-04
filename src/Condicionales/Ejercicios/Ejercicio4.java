package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Variables
        double productoUno, productoDos, productoTres, productoCuatro;
        double suma, descuento = 0.20, total;

        // Entrada
        productoUno = Double.parseDouble(JOptionPane.showInputDialog(null, "HOLA BIENVENIDO, ingrese el costo del producto 1: "));
        productoDos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el producto 2: "));
        productoTres = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el producto 3: "));
        productoCuatro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el producto 4"));

        // Operación
        suma = productoUno + productoDos + productoTres + productoCuatro;
        descuento *= suma;
        total = suma - descuento;

        if (suma >= 300) {
            // Compra con descuento
            JOptionPane.showMessageDialog(null, "***Detalle de la compra***\n" +
                    "_____________________________________\n" +
                    "Producto 1: " + productoUno + "\n" +
                    "Producto 2: " + productoDos + "\n" +
                    "Producto 3: " + productoTres + "\n" +
                    "Producto 4: " + productoCuatro + "\n" +
                    "_____________________________________\n" +
                    "Compra: " + suma + "\n" +
                    "Descuento: " + Math.round(descuento) + "\n" +
                    "_____________________________________\n" +
                    "TOTAL: " + total + "\n" +
                    "_____________________________________\n" +
                    "***Gracias por su compra, Vuelva pronto!***\n");

        } else {
            // Compra sin descuento
            JOptionPane.showMessageDialog(null, "***Detalle de la compra***\n" +
                    "Producto 1: " + productoUno + "\n" +
                    "Producto 2: " + productoDos + "\n" +
                    "Producto 3: " + productoTres + "\n" +
                    "Producto 4: " + productoCuatro + "\n" +
                    "_____________________________________\n" +
                    "Compra: " + suma + "\n" +
                    "_____________________________________\n" +
                    "TOTAL: " + suma + "\n" +
                    "_____________________________________\n" +
                    "***Gracias por su compra, Vuelva pronto!***\n");
        }
    }
}
