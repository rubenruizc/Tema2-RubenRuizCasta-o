package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		double numero;
		
		// Variable donde guardaremos el valor absoluto del número del usuario
		double valorAbsoluto;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		// Solicitar al usuario que escriba un número
		System.out.print("Escriba un número: ");
		
		//Leemos el número
		numero = sc.nextDouble();

		// Calcular el valor absoluto usando el operador ternario
		valorAbsoluto = (numero >= 0) ? numero : -numero;

		// Imprimir el valor absoluto
		System.out.println("El valor absoluto es: " + valorAbsoluto);

		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main

} // Cierre de la clase 
