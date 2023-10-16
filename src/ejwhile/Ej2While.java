package ejwhile;

import java.util.Scanner;

public class Ej2While {

	public static void main(String[] args) {
		//// Declaro las variables para el número y el contador
		int numero=1, i=0;
		
		
		// Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido un número al usuario
		System.out.println("Digite un número positivo. Para salir ingrese un número negativo.");

		// Leo el número ingresado
		numero = sc.nextInt();

		// Creo la condición e instrucciones
		while (numero >= 0) {
			i++; 

			// Pedimos un número al usuario
			System.out.println("Digite un número positivo. Para salir ingrese un número negativo.");

			// Leo el número ingresado
			numero = sc.nextInt();
		}
		// Imprimo cantidad de números positivos ingresados (***Por fuera de las llaves***)
		System.out.println("La cantidad de números positivos ingresados es: " + i);

		//Cierro el Scanner
		sc.close();

	}

}
