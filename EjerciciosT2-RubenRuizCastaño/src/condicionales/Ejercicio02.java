package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numeroDni;
		
		int modulo;
		
		String valorLetra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de DNI (8 dígitos): ");
		numeroDni = sc.nextInt();
		
		modulo = numeroDni % 23;
		
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
			
			System.out.println("Su letra es: " + valorLetra);
	
			sc.close();
		}

	}

