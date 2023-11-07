package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int numr1;
		
		int numr2;
		
		int respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		numr1 = r.nextInt(1, 101);
		
		numr2 = r.nextInt(1, 100);
		
		System.out.println("¿Cual es la solución de la siguiente operación?");
		
		System.out.print(numr1 + " + " + numr2 + " = ");
		respuesta = sc.nextInt();

		if (respuesta == numr1 + numr2) {
			System.out.println("Correcto, eres muy bueno en mates");
		} else
			System.out.println("Eres un desastre, tienes que estudiar más");
		sc.close();
	}

}
