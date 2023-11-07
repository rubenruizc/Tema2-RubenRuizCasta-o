package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba un número comprendido entre 0 y 9999:");
		numero = sc.nextInt();
		
		if (numero >= 0 && numero <= 9999) {
			
			if (numero >= 0 && numero <= 9) {
				System.out.println("Su número es capicúa");
				
			} else if (numero >= 10 && numero <= 99) {
				if (numero % 11 == 0) {
					System.out.println("Su número es capicúa");
				} else
					System.out.println("Su número no es capicúa");
				
			} else if (numero >= 100 && numero <= 999) {
				if (numero / 100 == numero % 10) {
					System.out.println("Su número es capicúa");
				} else
					System.out.println("Su número no es capicúa");
				
			} else if (numero >= 1000 && numero <= 9999) {
				int unidad = numero % 10;
				int decena = (numero / 10) % 10;
				int centena = (numero / 100) % 10;
				int millar = numero / 1000;
				if (unidad == millar && decena == centena) {
					System.out.println("Su número es capicúa");
				} else
					System.out.println("Su número no es capicúa");
			}
			
		} else
			System.out.println("Número mal introducido");

		sc.close();
	}
}
