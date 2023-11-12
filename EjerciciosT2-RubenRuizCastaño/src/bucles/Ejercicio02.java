package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número n: ");
		int n = sc.nextInt();

		// Contar y mostrar la cantidad de números primos entre 1 y n
		int contadorPrimos = 0;
		// Vmoas descartando hasta encontrar un número primo y lo sumamos
		for (int i = 2; i <= n; i++) {
			boolean esPrimo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				contadorPrimos++;
			}
		}

		System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n);

		// Cerrar el Scanner
		sc.close();
	}

}
