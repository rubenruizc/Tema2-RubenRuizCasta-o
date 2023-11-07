package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		double numero;
		
		double valorAbsoluto;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escriba un número: ");
		numero = sc.nextDouble();
		
		valorAbsoluto = (numero >= 0) ? numero : -numero;
		
		 System.out.println("El valor absoluto es: " + valorAbsoluto);
		
		 sc.close();
	}

}
