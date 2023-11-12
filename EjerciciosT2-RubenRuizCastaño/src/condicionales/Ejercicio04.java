package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		int num;
		
		// Variable donde guardaremos el valor del número
		String numTxt;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número entre el 1 y el 99
		System.out.println("Introduzca un número entre 1 y 99");
		
		// Leemos el número
		num = sc.nextInt();

		// Variable donde se almacena la primera cifra

		int primeraCifra = num / 10;

		// Variable donde se almacena la segunda cifra

		int segundaCifra = num % 10;

		// Comprobamos que el número esté dentro del rango

		if (num > 0 && num < 100) {

			// Comprobamos que el número sea igual o mayor que 10 y menor que 16

			if (primeraCifra == 1 && segundaCifra < 6) {

				numTxt = switch (num) {

				case 10 -> "diez";

				case 11 -> "once";

				case 12 -> "doce";

				case 13 -> "trece";

				case 14 -> "catorce";

				case 15 -> "quince";

				default -> "";

				};

			} else {

				// Según la primera cifra asignamos un valor

				if (primeraCifra == 1) {

					numTxt = "dieci";

				} else if (primeraCifra == 2) {

					if (segundaCifra == 0) {

						numTxt = "veinte";

					} else {

						numTxt = "veinti";

					}

				} else {

					numTxt = switch (primeraCifra) {

					case 3 -> "treinta";

					case 4 -> "cuarenta";

					case 5 -> "cincuenta";

					case 6 -> "sesenta";

					case 7 -> "setenta";

					case 8 -> "ochenta";

					case 9 -> "noventa";

					default -> "";

					};

				}

				// Comprobamos que el número no sea una decena (10,20,30...) para asignarle "y"

				if (primeraCifra > 2 && segundaCifra != 0) {

					numTxt += " y ";

				}

				// Asignamos el valor final sumando el valor anterior de la cadena con los
				// números de 0 y 9

				numTxt += switch (segundaCifra) {

				default -> "";

				case 1 -> "uno";

				case 2 -> "dos";

				case 3 -> "tres";

				case 4 -> "cuatro";

				case 5 -> "cinco";

				case 6 -> "seis";

				case 7 -> "siete";

				case 8 -> "ocho";

				case 9 -> "nueve";

				};

			}

			// Imprimimos el mensaje por pantalla

			System.out.println(numTxt);

		}
		
		// Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase 
