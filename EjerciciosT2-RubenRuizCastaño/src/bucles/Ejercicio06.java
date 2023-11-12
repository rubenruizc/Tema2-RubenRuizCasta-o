package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		int numero;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {

			// Le pedimos al usuario un número entre el 1 y el 20
			System.out.print("Escriba un número entre el 1 y el 20: ");

			// Leemos el número
			numero = sc.nextInt();

			// Bucle para ir contando el número de filas
			for (int fila = 1; fila <= numero; fila++) {

				// Bucle para contar el contenido de cada fila
				for (int columna = 1; columna <= fila; columna++) {
					System.out.print(fila);
				}

				// Cambiar de línea después de cada fila
				System.out.println();
			}

		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
		}

		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
