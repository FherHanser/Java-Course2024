import javax.swing.*;

public class VentanasJOption {


    public static void main(String[] args) {

        //Variables
        String cadena;
        int entero;
        char letra;
        double decimal;

        //Entrada de Datos
        cadena = JOptionPane.showInputDialog("Digite una cadena de texto:");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero:"));
        letra = JOptionPane.showInputDialog("Digite cualquier caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

        //Salida de datos
        JOptionPane.showMessageDialog(null, "La Cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El Entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El Caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El Deciamal es: "+ decimal);

        JOptionPane.showMessageDialog(null, "Hasta pronto!");


    }

}
