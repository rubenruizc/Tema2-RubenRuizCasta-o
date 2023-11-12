package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable donde guardaremos el número
		int numero;

		// Variable donde guardaremos el número invertido
		int inverso = 0;

		// Variable donde guardaremos la primera cifra del número
		int cifra1 = 0;

		// Variable donde guardaremos la segunda cifra del número
		int cifra2 = 0;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {
			// Le pedimos el número y lo almacenamos
			System.out.println("Introduzca un número");
			numero = sc.nextInt();

			// Bucle para calcular el número invertido
			// Divide el número tantas veces como pueda entre 10
			for (int i = numero; i != 0; i /= 10) {
				// Se multiplica el valor de inverso para mover la cifra a la izquierda
				cifra1 = inverso * 10;

				// Se obtiene el resto de i/10
				cifra2 = i % 10;

				/**
				 * Se le suma a cifra1 el valor de cifra2,haciendo que cifra1 quede a la
				 * izquierda y cifra2 a la derecha Ejemplo: 121 seria 120+1 = 121 inverso =
				 * cifra1 + cifra2;
				 */

				// System.out.println("cifra1 = " + cifra1);
				// System.out.println("cifra2 = " + cifra2);
				// System.out.println(inverso);
			}

			// Comprobamos si el número es igual al inverso
			if (numero == inverso) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
		}

		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main
	
} // Cierra de la clase
