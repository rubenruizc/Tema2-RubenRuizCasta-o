package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int numero;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número mayor a 0: ");
		numero = sc.nextInt();
		
		while (numero <= 0) {
			System.out.println("¿Puedes leer el enunciado?");
			System.out.print("Escriba un número correcto: ");
			numero = sc.nextInt();
		}
		while (numero > 0) {
			numero /= 10;
			contador++;
		}
		if (contador == 1) {
			System.out.println("Su número tiene: " + contador + " cifra.");
		} else {
			System.out.println("Su número tiene: " + contador + " cifras.");
		}
		sc.close();
	}

}
