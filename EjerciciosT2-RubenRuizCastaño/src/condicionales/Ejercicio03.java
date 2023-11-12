package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la comida comprada
		double comidaComprada;
		
		// Variable donde guardaremos el número de animales
		int numAnimales;

		// Variable donde guardaremos la comida diaria 
		double comidaDiaria;

		// Variable donde guardaremos la racion diaria por animal 
		double racionDiariaPorAnimal;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que introduzca la cantidad de comida comprada en kilos
		System.out.print("Introduce la cantidad de comida comprada en kilos: ");
		comidaComprada = sc.nextDouble();

		// Solicitar al usuario que introduzca el número de animales
		System.out.print("Introduce el número de animales: ");
		numAnimales = sc.nextInt();

		// Solicitar al usuario que introduzca la cantidad total de kilos de comida que comen todos los animales al día
		System.out.print("Introduce la cantidad total de kilos de comida que comen todos los animales al día: ");
		comidaDiaria = sc.nextDouble();

		// Verificar si hay suficiente comida para todos los animales
		if (numAnimales != 0 && comidaComprada >= comidaDiaria) {
		    System.out.println("Tenemos suficiente comida para todos los animales.");

		} else if (numAnimales == 0) {
		    System.out.println("La comida te la puedes comer tu solo");
		} else {
		    // Calcular la ración diaria por animal
		    racionDiariaPorAnimal = comidaDiaria / numAnimales;

		    // Mostrar mensajes relacionados con la cantidad de comida y las raciones diarias
		    System.out.println("No tenemos suficiente comida para todos los animales.");
		    System.out.println("Si tuviéramos la comida suficiente, cada animal debería recibir " + racionDiariaPorAnimal + " kilos de comida al día.");
		    System.out.println("Como no tenemos esa cantidad, los animales comerán: " + comidaComprada / numAnimales + " kilos de comida al día");
		    System.out.println("Faltarían por comprar: " + (comidaDiaria - comidaComprada) + " kilos");
		}

		// Cerrar el objeto Scanner para liberar recursos
		sc.close();
	}

}
