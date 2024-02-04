package Operadores;

import java.util.Scanner;

public class CadenaYNumeros {

    public static void main(String[] args) {

        //Variables
        String nombre;
        int numeroUno;
        int numeroDos;

        //Entrada
        Scanner entradaUno = new Scanner(System.in);
        Scanner entradaDos = new Scanner(System.in);
        Scanner entradaNombre = new Scanner(System.in);

        //Saludo
        System.out.println("Hola, Ingresa tu nombre: ");
        nombre = entradaNombre.next();

        System.out.println("Bienvenido!" + nombre);

        //Operacion
        System.out.println("************** VAMOS A OPERAR*************");
        System.out.println("******************************************");

        System.out.println("Ingresa un numero: ");
        numeroUno = entradaUno.nextInt();

        System.out.println("Ingresa otro numero: ");
        numeroDos = entradaDos.nextInt();

        System.out.println("***************************");
        System.out.println("***************************");


        System.out.println("Escribe '1', para saber quien es mayor o menor, o '0', para sumarlos");

        int menu;
        Scanner entradaMenu = new Scanner(System.in);
        menu = entradaMenu.nextInt();

        if (menu == 1) {
            if (numeroUno > numeroDos) {
                System.out.println("El número mayor es el primero: " + numeroUno);
            } else {
                System.out.println("El numero mayor es el segundo:  " + numeroDos);
            }

        } else {
            int suma = numeroUno + numeroDos;
            System.out.println("La suma de ambos numeros es:  " + suma);
        }

    }

}
