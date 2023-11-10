package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int cantidadIncrementar = 0;

		Scanner sc = new Scanner(System.in);
		try {
			do {

				System.out.print("Introduzca un número de horas: ");
				horas = sc.nextInt();

			} while (horas < 0 || horas > 23);

			do {

				System.out.print("Introduzca un número de minutos: ");
				minutos = sc.nextInt();

			} while (minutos < 0 || minutos > 59);

			do {

				System.out.print("Introduzca un número de segundos: ");
				segundos = sc.nextInt();

			} while (segundos < 0 || segundos > 59);

			do {
				System.out.print("Introduzca el número de segundos que quieras incrementar: ");
				cantidadIncrementar = sc.nextInt();

			} while (cantidadIncrementar < 0);

		} catch (InputMismatchException e) {
			System.out.println("Su respuesta no es apropiada");
			sc.nextLine();
		}

		while (cantidadIncrementar > 0) {
			if (segundos + cantidadIncrementar > 59) {
				cantidadIncrementar -= 60 - segundos;
				segundos = 0;
				minutos++;
				if (minutos > 59) {
					minutos = 0;
					horas++;
					if (horas > 23) {
						horas = 0;
					}
				}
			} else {
				segundos += cantidadIncrementar;
				cantidadIncrementar = 0;
			}
		}

		System.out.println("La nueva hora es: " + (horas < 10 ? "0" + horas : horas) + ":"
				+ (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos));

		sc.close();
	}

}
