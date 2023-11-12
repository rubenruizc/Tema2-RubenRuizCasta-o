package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que ingrese un número y almacenarlo en la variable 'n'
		System.out.print("Ingrese un número n: ");
		
		// Leemos el número
		numero = sc.nextInt();

		// Variable donde guardaremos el contador de los números primos
		int contadorPrimos = 0;

		//Iterar desde 2 hasta el número ingresado por el usuario
		for (int i = 2; i <= numero; i++) {
			
		 // Suponer que el número actual 'i' es primo
		 boolean esPrimo = true;

		 // Iterar desde 2 hasta 'i - 1' para verificar si 'i' es divisible por algún número en este rango
		 for (int j = 2; j < i; j++) {
			 
		     // Si 'i' es divisible por 'j', entonces 'i' no es primo
		     if (i % j == 0) {
		         esPrimo = false;
		         break;
		     }
		 }

		 // Si 'i' es primo, incrementar el contador de números primos
		 if (esPrimo) {
		     contadorPrimos++;
		 }
		}

		//Imprimir la cantidad de números primos encontrados
		System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + numero);

		//Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main

} // Cierre de la clase


