package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio2 {

	public static void main(String[] args) {
		// Declaro variable de los números.
		int num1, num2;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Pido un número al usuario
		System.out.println("Escribe un número: ");

		// Leo el número
		num1 = sc.nextInt();

		// Pido otro número al usuario
		System.out.println("Escribe otro número: ");

		// Leo el otro número
		num2 = sc.nextInt();

		// Creo la condición doble
		if (num1 == num2) {
			System.out.println("Los números son iguales.");
		} else {
			System.out.println("Los números son distintos.");
		}

		// cierro el Scanner
		sc.close();

	}

}
