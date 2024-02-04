/*
* Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado
* de coeficientes reales.
* */


package Operadores.Ejercicios;


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //Variables
        double a;
        double b;
        double c;
        double resultadoUno;
        double resultadoDos;


        //Entrada
        System.out.println("Digite el valor de a:");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b:");
        b = entrada.nextDouble();
        System.out.println("Digite el valor de c:");
        c = entrada.nextDouble();


        //Operación
        resultadoUno = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        resultadoDos = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);


        //Salida
        System.out.println("La Raíz Cuadrada 1 es: " + resultadoUno);
        System.out.println("La Raíz Cuadrada 2 es: " + resultadoDos);


    }
}
