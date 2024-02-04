package Condicionales.Ejercicios;/*
 * En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los Q300.
 * Hacer un programa que aplique descuentos luego de saber el monto total de la compra.
 *
 * *
 * */
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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

        // Fecha y hora actual
        Date fechaHoraActual = new Date();
        SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHora = formatoFechaHora.format(fechaHoraActual);

        if (suma >= 300) {
            // Compra con descuento
            JOptionPane.showMessageDialog(null, "***Detalle de la compra***\n" +
                    "Fecha y Hora: " + fechaHora + "\n\n" +
                    "_____________________________________\n" +
                    "- Producto 1 : Q " + productoUno + "\n" +
                    "- Producto 2 : Q " + productoDos + "\n" +
                    "- Producto 3 : Q " + productoTres + "\n" +
                    "- Producto 4 : Q " + productoCuatro + "\n" +
                    "_____________________________________\n" +
                    "Compra : Q " + suma + "\n" +
                    "Descuento : Q " + Math.round(descuento) + "\n" +
                    "_____________________________________\n" +
                    "TOTAL : Q " + total + "\n" +
                    "_____________________________________\n" +
                    "***Gracias por su compra, Vuelva pronto!***\n");

        } else {
            // Compra sin descuento
            JOptionPane.showMessageDialog(null, "***Detalle de la compra***\n" +
                    "Fecha y Hora: " + fechaHora + "\n\n" +
                    "- Producto 1 : Q " + productoUno + "\n" +
                    "- Producto 2 : Q " + productoDos + "\n" +
                    "- Producto 3 : Q " + productoTres + "\n" +
                    "- Producto 4 : Q" + productoCuatro + "\n" +
                    "_____________________________________\n" +
                    "Compra : Q " + suma + "\n" +
                    "_____________________________________\n" +
                    "TOTAL : Q " + suma + "\n" +
                    "_____________________________________\n" +
                    "***Gracias por su compra, Vuelva pronto!***\n");
        }
    }
}


