package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio9 {

	public static void main(String[] args) {
		// Creo las constantes para la opción piedra, papel o tijera, y las inicializo
		// con un número.
		final int Piedra = 1;
		final int Papel = 2;
		final int Tijera = 3;

		// Creo las variables para almacenar la opción seleccionada por cada jugador
		int jugador1, jugador2;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pido al jugador1 que seleccione una opción
		System.out.println("Jugador 1: Elija un número para seleccionar una opción Piedra (1), Papel (2), Tijera (3)");
		jugador1 = sc.nextInt();
		// Le pido al jugador2 que seleccione una opción
		System.out.println("Jugador 2: Elija un número para seleccionar una opción Piedra (1), Papel (2), Tijera (3)");
		jugador2 = sc.nextInt();

		// Creo las condiciones e instrucciones para las posibles respuestas
		if (jugador1 == jugador2) {
			System.out.println("Empate!");
		} else if (jugador1 == 1 && jugador2 == 3 || jugador1 == 2 && jugador2 == 1 || jugador1 == 3 && jugador2 == 2) {
			System.out.println("Gana jugador 1");
		} else if (jugador2 == 1 && jugador1 == 3 || jugador2 == 2 && jugador1 == 1 || jugador2 == 3 && jugador1 == 2) {
			System.out.println("Gana jugador 2");
		}

// Cierro el Scanner
		sc.close();

	}

}
