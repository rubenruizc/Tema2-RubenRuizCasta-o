package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int horas;

		int minutos;

		int segundos;

		int dias = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba un número de horas: (mín:0 max:24)");
		horas = sc.nextInt();

		System.out.println("Escriba un número de minutos: (mín:0 máx:60) ");
		minutos = sc.nextInt();

		System.out.println("Escriba un número de segundos: (mín:0 máx:60)");
		segundos = sc.nextInt();

		if (horas > 0 && minutos > 0 && segundos > 0 && minutos <= 60 && segundos <= 60) {

			if (horas == 24) {
				horas = 0;
				dias++;
			}
			if (minutos == 60) {
				minutos = 0;
				horas++;
			}

			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}

			segundos++;
			System.out.println("La hora después de incrementar un segundo es: " + dias + " día " + horas + " horas "
					+ minutos + " minutos " + segundos + " segundos");

		} else
			System.out.println("Números mal introducidos");

		sc.close();
	}
}
