package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la distancia
		double distancia;
		
		// Variable donde guardaremos los días
		int diasEstancia;
		
		// Variable donde guardaremos el precio por kilómetro
		double precioPorKilometro;
		
		// Variable donde guardaramos el precio de los billetes 
		double precioBillete;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese la distancia a recorrer en kilómetros
		System.out.print("Introduzca la distancia a recorrer en kilómetros: ");
		distancia = sc.nextDouble();

		// Solicitar al usuario que ingrese el número de días de estancia
		System.out.print("Introduzca el número de días de estancia: ");
		diasEstancia = sc.nextInt();

		// Asignar un precio por kilómetro predefinido
		precioPorKilometro = 2.5;

		// Calcular el precio del billete multiplicando la distancia por el precio por kilómetro
		precioBillete = distancia * precioPorKilometro;

		// Comprobar si se aplica un descuento del 30%
		if (diasEstancia > 7 && distancia > 800) {
		    // Calcular el descuento y restarlo al precio del billete
		    double descuento = precioBillete * 0.3; // 30% de descuento
		    precioBillete -= descuento;
		}

		// Imprimir el precio del billete de tren
		System.out.println("El precio del billete de tren es: " + precioBillete + " euros");

		// Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase