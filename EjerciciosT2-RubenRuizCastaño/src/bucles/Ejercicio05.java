package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable donde guardaremos el primer número del usuario
		int numero1;

		// Variable donde guardaremos el segundo número del usuario
		int numero2;

		// Variable donde guardaremos el mínimo común múltiplo de los números
		int mcm;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {

			// Mientras que el número 1 sea menor o igual a 0 ejecutará el siguiente bloque
			// de instrucciones
			do {
				System.out.println("Escriba un número: ");
				numero1 = sc.nextInt();
			} while (numero1 <= 0);

			// Mientras que el número 2 sea menor o igual a 0 ejecutará el siguiente bloque de instrucciones
			do {
				System.out.println("Escriba otro número: ");
				numero2 = sc.nextInt();
			} while (numero2 <= 0);

			// Bucle para saber cual es el mínimo común múltiplo de los dos números
			for (mcm = numero1 > numero2 ? numero1 : numero2; mcm >= 1; mcm++) {
				if (mcm % numero1 == 0 && mcm % numero2 == 0) {
					break;
				}

			}

			// Le decimos al usuario cual sería el mínimo común múltiplo
			System.out.println("El mínimo común múltiplo ee: " + mcm);

		} catch (InputMismatchException e) {
			System.out.println("Valores mal introducidos");
			sc.nextLine();
		}

		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase
