package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del DNI
		int numeroDni;
		
		// Variable donde guardaremos el módulo 
		int modulo;
		
		// Variable donde guardaremos el valor de la letra
		String valorLetra;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca el número de DNI (8 dígitos)
		System.out.println("Introduce el número de DNI (8 dígitos): ");
		numeroDni = sc.nextInt();

		// Calcular el módulo del número de DNI
		modulo = numeroDni % 23;

		// Asignar la letra correspondiente utilizando una expresión switch
		valorLetra = switch (modulo) {
		    case 0 -> "T";
		    case 1 -> "R";
		    case 2 -> "W";
		    case 3 -> "A";
		    case 4 -> "G";
		    case 5 -> "M";
		    case 6 -> "Y";
		    case 7 -> "F";
		    case 8 -> "P";
		    case 9 -> "D";
		    case 10 -> "X";
		    case 11 -> "B";
		    case 12 -> "N";
		    case 13 -> "J";
		    case 14 -> "Z";
		    case 15 -> "S";
		    case 16 -> "Q";
		    case 17 -> "V";
		    case 18 -> "H";
		    case 19 -> "L";
		    case 20 -> "C";
		    case 21 -> "K";
		    case 22 -> "E";
		    default -> "Ha ocurrido un error, número mal introducido.";
		};

		// Imprimir la letra correspondiente al número de DNI
		System.out.println("Su letra es: " + valorLetra);

		// Cerramos el Scanner 
		sc.close();
		
		} // Cierre del main

	} // Cierre de la clase 

