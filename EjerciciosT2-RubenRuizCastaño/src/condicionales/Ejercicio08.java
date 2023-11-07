package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		double distancia;
		
		int diasEstancia;
		
		double precioPorKilometro;
		
		double precioBillete;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la distancia a recorrer en kilómetros: ");
		distancia = sc.nextDouble();

		System.out.print("Introduzca el número de días de estancia: ");
		diasEstancia = sc.nextInt();

		precioPorKilometro = 2.5;
		precioBillete = distancia * precioPorKilometro;

		// Comprobar si se aplica una reducción del 30%
		if (diasEstancia > 7 && distancia > 800) {
			double descuento = precioBillete * 0.3; // 30% de descuento
			precioBillete -= descuento;
		}

		System.out.println("El precio del billete de tren es: " + precioBillete + " euros");

		sc.close();
	}
}