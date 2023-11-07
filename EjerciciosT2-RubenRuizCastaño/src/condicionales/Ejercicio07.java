package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int horas;
		
		int minutos;
		
		int segundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un número de horas: (mín:0)");
		horas = sc.nextInt();
		
		System.out.println("Escriba un número de minutos: (máx:60 mín:0) ");
		minutos = sc.nextInt();
		
		System.out.println("Escriba un número de segundos: (máx:60 mín:0)");
		segundos = sc.nextInt();

		if (horas > 0 && minutos > 0 && segundos > 0 && minutos <=60 && segundos <=60) {

			if (minutos == 60) {
				minutos = 0;
				horas++;
			}
			
			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}
			
			segundos++;
			System.out.println("La hora después de incrementar un segundo es: " + horas + " horas " + minutos + " minutos "
					+ segundos + " segundos");
			
		} else
			System.out.println("Números mal introducidos");
		
		

		sc.close();
	}
}
