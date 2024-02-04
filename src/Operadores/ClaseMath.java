package Operadores;

import java.util.Scanner;

public class ClaseMath {


    public static void main(String[] args) {

        //Variables
        float numero;
        double raiz;
        double potencia;
        double exponente;

        //Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero para saber su raiz cuadrada: ");
        numero = entrada.nextFloat();
        int valor1 = (int) numero;

        System.out.println("Ingrese un numero para usarlo como exponente: ");
        exponente = entrada.nextFloat();
        int valor2 = (int) exponente;

        //Método Raiz Cuadrada
        raiz = Math.sqrt(numero);
        //Método Potencia
        potencia = Math.pow(numero, exponente);
        //Método Redondear
        double resultadoRedondeado = Math.round(raiz);
        //Método Random
        double numeroRandom = Math.random();
        //Método Mayor de los números
        int numeroMayor = Math.max(valor1, valor2) ;

        //Salida
        System.out.println("La raíz cuadrada de: " + numero + " es: " + resultadoRedondeado);
        System.out.println("y elevado a la potencia " + exponente + "es: " + potencia);
        System.out.println("Este es un numero aleatorio: " + numeroRandom);
        System.out.println("El numero mayor ingresado es: "+ numeroMayor);


    }
}
