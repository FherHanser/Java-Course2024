/*
 * Hacer un programa que calcule e imprima la suma de tres calificaciones
 *
 * */


package Operadores.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variables
        float nota1;
        float nota2;
        float nota3;
        float suma;

        //Entrada de datos
        System.out.println("Ingrese la calificación 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese la calificación 2: ");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese la calificación 3: ");
        nota3 = entrada.nextFloat();

        //Operación
        suma = nota1 + nota2 + nota3;

        //Salida
        System.out.println("La suma de las tres notas es: " + suma);

    }


}
