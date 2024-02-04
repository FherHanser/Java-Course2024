package Operadores;

import javax.swing.*;
import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        //Varialbes
        String nombre;
        float numeroUno;
        float numeroDos;
        float suma;
        float resta;
        float division;
        float multiplicacion;

        //Saludo - Bienvenida
        System.out.println("Hola, Bienvenido");
        System.out.println("Escriba su nombre porfavor: ");


        JOptionPane.showMessageDialog(null, "Hola, Bienvenido");
        nombre = JOptionPane.showInputDialog("Escriba su nombre por favor");


        //Operacion - Entrada
        System.out.println("Hola! " + nombre);
        System.out.println("Digite dos números: ");
        numeroUno = entrada.nextInt();
        numeroDos = entrada.nextInt();

        suma = numeroUno + numeroDos;
        resta = numeroUno - numeroDos;
        division = numeroUno / numeroDos;
        multiplicacion = numeroUno * numeroDos;

        //Salida
        System.out.println("El resultado de la suma es:  " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);


        JOptionPane.showMessageDialog(null, "Hasta Pronto");


    }

}
