package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		double comidaComprada;

		int numAnimales;

		double comidaDiaria;

		double racionDiariaPorAnimal;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cantidad de comida comprada en kilos: ");
		comidaComprada = sc.nextDouble();

		System.out.print("Introduce el número de animales: ");
		numAnimales = sc.nextInt();

		System.out.print("Introduce la cantidad total de kilos de comida que comen todos los animales al día: ");
		comidaDiaria = sc.nextDouble();

		if (numAnimales != 0 && comidaComprada >= comidaDiaria) {
			System.out.println("Tenemos suficiente comida para todos los animales.");

		} else if (numAnimales == 0) {
			System.out.println("La comida te la puedes comer tu solo");
		} else {

			racionDiariaPorAnimal = comidaDiaria / numAnimales;
			System.out.println("No tenemos suficiente comida para todos los animales.");
			System.out.println("Si tuvieramos la comida suficiente cada animal debería recibir " + racionDiariaPorAnimal + " kilos de comida al día.");
			System.out.println("Como no tenemos esa cantidad, los animales comerán: "
					+ comidaComprada / numAnimales + " kilos de comida al día");
			System.out.println("Faltarían por comprar: " + (comidaDiaria - comidaComprada) + " kilos");

		}
		sc.close();
	}

}
