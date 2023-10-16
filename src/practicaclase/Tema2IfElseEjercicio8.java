package practicaclase;

import java.util.Locale;

import java.util.Scanner;

public class Tema2IfElseEjercicio8 {

	public static void main(String[] args) {

		// Declaro la variable
		double nota;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Incluyo el use locale para poder usar el punto (.)
		sc.useLocale(Locale.US);

		// Pido al ususario que digite su nota
		System.out.println("Digita tu nota:");

		// Leo el número digitado en el teclado
		nota = sc.nextDouble();

		if (nota <= 4.9) {
			System.out.println("Tu nota es Insuficiente. Ánimo! esfuerzate más.");
		} else if (nota <= 5.9) {
			System.out.println("Tu nota ha sido Suficiente.");
		} else if (nota <= 6.9) {
			System.out.println("Has obtenido Buena nota.");
		} else if (nota <= 8.9) {
			System.out.println("El resultado de tu nota ha sido Notable");
		} else if (nota <= 10) {
			System.out.println("Felicitaciones! Tu nota es Sobresaliente");
		}

		//Cierro el Scanner
		sc.close();
	}
}
