package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número de horas
		int horas = 0;
		
		// Variable donde guardaremos el número de minutos
		int minutos = 0;
		
		// Variable donde guardaremos el número de segundos
		int segundos = 0;
		
		// Variable donde guardaremos la cantidad de segundos a incrementar
		int cantidadIncrementar = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no ha introducido una letra (valor incorrecto)
		try {
		    // Validar y obtener el número de horas
		    do {
		        System.out.print("Introduzca un número de horas: ");
		        horas = sc.nextInt();
		    } while (horas < 0 || horas > 23);

		    // Validar y obtener el número de minutos
		    do {
		        System.out.print("Introduzca un número de minutos: ");
		        minutos = sc.nextInt();
		    } while (minutos < 0 || minutos > 59);

		    // Validar y obtener el número de segundos
		    do {
		        System.out.print("Introduzca un número de segundos: ");
		        segundos = sc.nextInt();
		    } while (segundos < 0 || segundos > 59);

		    // Validar y obtener la cantidad de segundos a incrementar
		    do {
		        System.out.print("Introduzca el número de segundos que quieras incrementar: ");
		        cantidadIncrementar = sc.nextInt();
		    } while (cantidadIncrementar < 0);

		} catch (InputMismatchException e) {
		    // Capturar una excepción en caso de entrada no válida
		    System.out.println("Su respuesta no es apropiada");
		    sc.nextLine();  // Limpiar el buffer de entrada
		}

		// Incrementar la hora según la cantidad de segundos
		while (cantidadIncrementar > 0) {
		    if (segundos + cantidadIncrementar > 59) {
		        cantidadIncrementar -= 60 - segundos;
		        segundos = 0;
		        minutos++;

		        if (minutos > 59) {
		            minutos = 0;
		            horas++;

		            if (horas > 23) {
		                horas = 0;
		            }
		        }
		    } else {
		        segundos += cantidadIncrementar;
		        cantidadIncrementar = 0;
		    }
		}

		// Imprimir la nueva hora formateada
		System.out.println("La nueva hora es: " + (horas < 10 ? "0" + horas : horas) + ":"
		        + (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos));

		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main

} // Cierre de clase
