/*
* Una compañía de venta de carros usados paga a su personal de ventas un salario de de $1000
* mensuales, más una comisión de 150 por cada carro vendido, más el 5% del valor de la venta por carro.
* Hacer un programa que calcule e imprima el salario mensual de un vendedor.
* */


package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variables
        float sueldo = 1000;
        float comision = 150;
        double bonificacion = 0.5;
        float ventas;


        //Entrada

        System.out.println("Ingrese la cantidad de carros vendidos: ");
        ventas = entrada.nextFloat();
        ventas *=comision;

        bonificacion *= ventas;

        sueldo += (float) (ventas + bonificacion);

        System.out.println("El sueldo total del vendedor es: " + sueldo);









    }
}
