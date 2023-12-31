package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {
			
			// Le pedimos al usuario un número
			System.out.println("Escriba un número: ");
			
			// Leemos el número
			numero = sc.nextInt();
			
			// Bucle para dibujar el triángulo
			for (int fila = 1; fila <= numero; fila++) {

				// Bucle para mprimir espacios en blanco
				for (int columna = 1; columna <= numero - fila; columna++) {
					System.out.print(" ");
				}

				// Bucle para imprimir asteriscos
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
		
		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase 
