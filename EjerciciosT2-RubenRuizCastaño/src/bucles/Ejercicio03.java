package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Escriba un número: ");
			numero = sc.nextInt();
			// Dibujar el triángulo
			for (int fila = 1; fila <= numero; fila++) {

				// Imprimir espacios en blanco
				for (int columna = 1; columna <= numero - fila; columna++) {
					System.out.print(" ");
				}

				// Imprimir asteriscos
				for (int asteriscos = 1; asteriscos <= fila; asteriscos++) {
					System.out.print("* ");
				}

				// Cambiar de línea después de cada fila
				System.out.println();
			}

		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
		}

		sc.close();
	}
}
