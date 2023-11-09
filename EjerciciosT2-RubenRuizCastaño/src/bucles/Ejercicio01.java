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

		} while (minutos < 0 || minutos > 59);

		do {
			try {
				System.out.print("Introduzca un número de segundos: ");
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (segundos < 0 || segundos > 59);

		do {
			try {
				System.out.print("Introduzca el número de segundos que quieras incrementar: ");
				cantidadIncrementar = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Su dato no es del tipo correspondiente");
				sc.nextLine();
			}

		} while (cantidadIncrementar < 0);
		
		
		int suma = segundos+cantidadIncrementar;
		
		if (suma > 59) {
			
			minutos += suma/60;
			segundos = suma%60 == 0 ? 0 : suma%60;
			
			if (minutos > 59) {
				horas += minutos%60 == 0 ? 0 : minutos%60;
				minutos = minutos%60 == 0 ? 0 : minutos%60;
			}
			
		}
		
		if (horas > 23) {
			horas = 0;
		}
		
		
		System.out.println(horas + ":0" + minutos + ":" + segundos);
		
	
		
		sc.close();
	}

}
