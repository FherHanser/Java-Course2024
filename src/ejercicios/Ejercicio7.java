/*
 * Construir un programa que, dado un número total de horas, devuelve el número de semanas, día y horas
 * equivalentes. Ejemplo: Dado un total de 1000 horas debe mostras; 5 semanas, 6 días y 16 horas.
 * */


package ejercicios;


import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Variables
        int horas;
        int semanas;
        int dias;
        int horasTotales;

        //Entrada
        System.out.println("Ingrese la cantidad de horas a procesar:  ");
        horasTotales = entrada.nextInt();


        //Operacion
        semanas = horasTotales / 168; //24 horas al día * 7 días de la semana
        dias = horasTotales % 168 / 24; // El resto (residuo) de horas, para hacerlos días (24 horas * dia)
        horas = horasTotales % 24;

        //Salida
        System.out.println("La distribución es:  ");
        System.out.println("Semanas:  " + semanas);
        System.out.println("Días:  " + dias);
        System.out.println("Horas: " + horas);


    }
}
