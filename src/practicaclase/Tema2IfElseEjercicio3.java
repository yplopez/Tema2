package practicaclase;

import java.util.Locale;

import java.util.Scanner;

public class Tema2IfElseEjercicio3 {

	public static void main(String[] args) {
		// Declaro variable del número decimal.
		float num;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Incluyo el use locale para poder usar el punto (.)
		sc.useLocale(Locale.US);

		// Pido un número al usuario
		System.out.println("Escribe un número: ");

		// Leo el número
		num = sc.nextFloat();

		// Creo la condición para determinar que el número esté entre el rango >-1 y <1, exceptuando el 0. 
		if (num > -1 && num != 0 && num < 1) {
			System.out.println("El número es un casi cero.");
		} else {
			System.out.println("No es un número casi cero.");
		}

		// Cierro el Scanner
		sc.close();

	}

}
