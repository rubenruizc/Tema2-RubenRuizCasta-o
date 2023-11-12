package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número introducido por el usuario
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {
			
			// Le pedimos al usuario un número
			System.out.println("Escriba un número: ");
			
			// Leemos el número
			numero = sc.nextInt();
			
			// Bucle para ir contando el número de filas
			for (int fila = 1; fila <= numero; fila++) {
				
				// Bucle para ir contando el número de columnas
				for (int columna = 1; columna <= fila; columna++) {
					System.out.print(columna);
				}
				
				// Bucle para ir contando el contenido de cada fila
				for (int columna = fila - 1; columna >= 1; columna--) {
					System.out.print(columna);
				}
				
				// Separación entre cada fila
				System.out.println();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Valores mal introducidos");
			sc.nextLine();
		}
		
		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase
