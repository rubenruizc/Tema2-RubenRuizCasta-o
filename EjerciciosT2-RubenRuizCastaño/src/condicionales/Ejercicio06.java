package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número random 1 
		int numr1;
		
		// Variable donde guardaremos el número randon 2
		int numr2;
		
		// Variable donde guardaremos la respuesta del usuario
		int respuesta;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Crear un objeto Random para generar números aleatorios
		Random r = new Random();

		// Generar dos números aleatorios entre 1 y 100
		numr1 = r.nextInt(100) + 1;
		numr2 = r.nextInt(100) + 1;

		// Mostrar la operación al usuario
		System.out.println("¿Cuál es la solución de la siguiente operación?");
		System.out.print(numr1 + " + " + numr2 + " = ");

		// Obtener la respuesta del usuario
		respuesta = sc.nextInt();

		// Verificar si la respuesta es correcta
		if (respuesta == numr1 + numr2) {
		    System.out.println("¡Correcto! Eres muy bueno en matemáticas.");
		} else {
		    System.out.println("Eres un desastre, necesitas estudiar más.");
		}

		// Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main

} // Cierre de la clase
