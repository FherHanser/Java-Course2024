/*
 * Hacer un programa que calcule el caudrado de una suma (a+b)2
 * */

package Operadores.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //Variables
        double a;
        double b;
        double resultado;


        //Entrada
        System.out.println("Ingrese el valor para a: ");
        a = entrada.nextInt();

        System.out.println("Ingrese el valor para b: ");
        b = entrada.nextInt();

        //Operacion
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

        //Salida
        System.out.println("El resultado de la operación es: " + resultado);


    }
}
