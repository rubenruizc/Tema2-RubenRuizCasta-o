package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número de horas
		int horas;
		
		// Variable donde guardaremos el número de minutos
		int minutos;
		
		// Variable donde guardaremos el número de segundods
		int segundos;
		
		// Variable donde guardaremos el número de días 
		int dias = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que ingrese el número de horas (mín: 0, máx: 24)
		System.out.println("Escriba un número de horas: (mín: 0 max: 24)");
		horas = sc.nextInt();

		// Le pedimos al usuario que ingrese el número de minutos (mín: 0, máx: 60)
		System.out.println("Escriba un número de minutos: (mín: 0 máx: 60) ");
		minutos = sc.nextInt();

		// Le pedimos al usuario que ingrese el número de segundos (mín: 0, máx: 60)
		System.out.println("Escriba un número de segundos: (mín: 0 máx: 60)");
		segundos = sc.nextInt();

		// Verificar si los valores ingresados son válidos
		if (horas >= 0 && minutos >= 0 && segundos >= 0 && minutos <= 60 && segundos <= 60) {

		    // Realizar ajustes si la hora es 24
		    if (horas == 24) {
		        horas = 0;
		        dias++;
		    }

		    // Realizar ajustes si los minutos son 60
		    if (minutos == 60) {
		        minutos = 0;
		        horas++;
		    }

		    // Realizar ajustes si los segundos son 60
		    if (segundos == 60) {
		        segundos = 0;
		        minutos++;
		    }

		    // Incrementar los segundos y mostrar el resultado
		    segundos++;
		    System.out.println("La hora después de incrementar un segundo es: " + dias + " día " + horas + " horas "
		            + minutos + " minutos " + segundos + " segundos");

		} else {
		    // Mostrar un mensaje si los números son mal introducidos
		    System.out.println("Números mal introducidos");
		}

		// Cerramos el Scanner 
		sc.close();
		
	} // Cierre del main
	
} // Cierre de la clase
