package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variables
        int horaPorSemana;
        float horasCosto;
        float salarioTotal;


        //Entrada
        System.out.println("Digite la cantidad de horas trabajadas: ");
        horaPorSemana = entrada.nextInt();

        System.out.println("Digite el precio de la hora:  ");
        horasCosto = entrada.nextFloat();


        //Operación

        salarioTotal = horaPorSemana * horasCosto;


        //Salida

        System.out.println("El pago total es: "+ salarioTotal);



    }


}
