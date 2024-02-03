package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Variables
        float particiacion = 0.10f;
        float primerParcial= 0.25f;
        float segundoParcial = 0.25f;
        float finalParcial = 0.40f;
        float notaFinal;

        //Entrada

        System.out.println("Hola ingrese las notas del alumno, recuerde  que es 1-10");
        System.out.println("Ingrese la nota de participación: ");
        particiacion *= entrada.nextFloat();
        System.out.println("Ingrese la nota del primer parcial: ");
        primerParcial *= entrada.nextFloat();
        System.out.println("Ingrese la nota del segundo parcial: ");
        segundoParcial *= entrada.nextFloat();
        System.out.println("Ingrese la nota del Examen Final");
        finalParcial *= entrada.nextFloat();

        //Operación
        notaFinal = particiacion + primerParcial + segundoParcial + finalParcial;

        //Salida
        System.out.println("La nota final es: "+ Math.round(notaFinal) );
        if (notaFinal >=6) {
            System.out.println("Felicidades! El alumno aprobó el curso :)");
        }else
            System.out.println("Curso NO Aprobado :(");
    }
}
