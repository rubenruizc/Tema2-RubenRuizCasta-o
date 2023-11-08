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
		do {
			try {
				System.out.print("Introduzca un número de horas: ");
				horas = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (horas < 0 || horas > 23);

		do {
			try {
				System.out.print("Introduzca un número de minutos: ");
				minutos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (minutos < 0 || minutos > 60);

		do {
			try {
				System.out.print("Introduzca un número de segundos: ");
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (segundos < 0 || minutos > 60);
		
		do {
			try {
				System.out.print("Introduzca el número de segundos que quieras incrementar: ");
				cantidadIncrementar = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (cantidadIncrementar < 0);
		
		minutos = minutos + cantidadIncrementar;
		
	System.out.println(horas + ":" + minutos + ":" + segundos);
	}

}
