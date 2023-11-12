package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable donde guardaremos el primer número
		int anterior;

		// Variable donde guardaremos el siguiente número
		int numero = 1;

		// Variable donde guardaremos el número de fallos
		int fallos = 0;

		// Variable donde guardaremos la cantidad de números introducidos
		int contadorValidos = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {

			// Le pedimos al usuario un número inicial
			System.out.println("Numero inicial");

			// Leemos el número
			anterior = sc.nextInt();

			// Sumamos uno al contador de los válidos
			contadorValidos++;

			// Mientras que el número sea distinto de 0 ejecutamos el siguiente bloque de instrucciones
			while (numero != 0) {

				// Le pedimos al usuario un número y le explicamos que si desea salir debe
				// introducir 0
				System.out.println("Introduzca un numero, use 0 para salir");

				// Leemos el número
				numero = sc.nextInt();

				// Si el número anterior (el primero) es mayor que el segundo y es distinto de cero ejecutará el bloque de instrucciones
				if (anterior > numero && numero != 0) {

					// Le decimos al usuario que el número es menor
					System.out.println("Fallo es menor");

					// Sumamos uno al contador de fallos
					fallos++;

					// Reiniciamos el número anterior (el primero)
					anterior = 0;

				} else {

					// Establecemos el segundo número como si fuera el anterior (el primero)
					anterior = numero;
				}

				// Mientras que el número sea distinto de cero se ejecutará el bloque de instrucciones
				if (numero != 0)

					// Sumamos uno al contador de números válidos
					contadorValidos++;
			}
		} catch (InputMismatchException e) {

			System.out.println("Valor mal introducido");
			sc.nextLine();
		}
		// Le decimos al usuario el número total de números bien introducidos
		System.out.println("Total de números introducidos: " + contadorValidos);

		// Le decimos al usuario el número total de números mal introducidos, es decir fallos
		System.out.println("Total de errores: " + fallos);

		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
