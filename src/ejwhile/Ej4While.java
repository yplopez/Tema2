package ejwhile;

import java.util.Scanner;

public class Ej4While {

	public static void main(String[] args) {
		// creo la variable
		int numero;

		// Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido un número al usuario
		System.out.println("Digite un número: ");

		// Leo el número ingresado
		numero = sc.nextInt();

		// Creo las condiciones e instrucciones
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("El número es par.");
			} else {
				System.out.println("El número es impar");
			}

			// Indico si el número ingresado es par o impar
			numero = sc.nextInt();
		}

		System.out.println("El juego ha terminado.");
	}
}
