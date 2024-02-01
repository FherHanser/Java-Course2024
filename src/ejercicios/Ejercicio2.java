/*
 * Guillermo tiene N cantidad de dolares correspondiente a su salario
 * Luis tiene la mitad de lo que tiene Guillermo
 * y Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 *
 * Hacer un programa que calcule e imprima la cantidad de dinero que cada
 * quien tiene.
 *
 * */

package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variables
        float guillermo;
        float luis;
        float juan;
        float sueldoMayor;

        //Obtener datos
        System.out.println("Ingresa el salario de Guillermo: ");
        guillermo = entrada.nextFloat();

        //Operación
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;

        //Salida
        System.out.println("El salario de Guillermo es: " + guillermo);
        System.out.println("El salario de Luis es: " + luis);
        System.out.println("El salario de Juan es:  " + juan);

        sueldoMayor = Math.max(guillermo, Math.max(luis, juan));

        System.out.println("El sueldo mayor es de:  " + sueldoMayor);


    }


}
