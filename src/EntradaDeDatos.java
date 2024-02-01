import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {

        Scanner entradaUno = new Scanner(System.in);
        Scanner entradaDos = new Scanner(System.in);

        int numeroUno = 0;
        int numeroDos = 0;

//Entrada de Datos
        System.out.println("Ingrese un número:  ");
        numeroUno = entradaUno.nextInt();

        System.out.println("Ingrese otro número:  ");
        numeroDos = entradaDos.nextInt();

//Operaciones + Respuesta
        int suma = numeroUno + numeroDos;

        System.out.println("El resulta de la suma es: " + suma);

        int resta = numeroUno - numeroDos;

        System.out.println("El resulta de la resta es: " + resta);

        int multiplicacion = numeroUno * numeroDos;

        System.out.println("El resulta de la multiplicación es: " + multiplicacion);

        int division = numeroUno / numeroDos;

        System.out.println("El resulta de la división es: " + division);

//Número mayor
        if (numeroUno > numeroDos) {
            System.out.println("El numéro mayor es El Primer Número Ingresado");

        } else System.out.println("El numéro mayor es El Segundo Número Ingresado");

    }


}
