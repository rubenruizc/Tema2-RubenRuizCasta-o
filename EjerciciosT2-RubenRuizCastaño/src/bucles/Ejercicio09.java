package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Varible donde guardaremos el número del usuario
		int numero;

		// Variable donde guardaremos el número de cifras del número
		int contador = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {
			
			// Le pedimos al usuario que escriba un número mayor que 0
			System.out.print("Escriba un número mayor a 0: ");

			// Leemos el número
			numero = sc.nextInt();

			// Mientras sea un número menor o igual que cero seguimos pidiendole un número al usuario
			while (numero <= 0) {
				System.out.println("¿Puedes leer el enunciado?");
				System.out.print("Escriba un número correcto: ");
				numero = sc.nextInt();
			}
			
			// Mientras el número sea mayor y distinto de 0 dividira el número entre 10 y le sumará uno al contador
			while (numero > 0) {
				
				// Dividimos el número entre 10 para ir viendo cuantas cifras tiene
				numero /= 10;
				// Sumamos uno al contador para ir contando cuantas cifras tiene el número
				contador++;
			}
			
			// Imprimimos cuantas ciffras tiene, si el el número solo tiene una cifra imprimira "cifra"
			System.out.println("Su número tiene: " + contador + (contador == 1 ? " cifra" : " cifras"));
			
		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
		}
		
		// Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main

} // Cierre de clase
