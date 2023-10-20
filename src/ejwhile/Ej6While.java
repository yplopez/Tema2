package ejwhile;

import java.util.Scanner;

public class Ej6While {

	public static void main(String[] args) {
		// Declaro las variables
		int edad = 0;
		int suma = 0;
		int mayorEdad = 0;
		int contador = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su edad: ");// Pido información al usuario
		edad = sc.nextInt();

		//Establezco condiciones e instrucciones
		while (edad >= 0) {

			suma += edad;

			if (edad >= 18)
				mayorEdad++;

		System.out.println("Introduzca su edad: ");// Pido información al usuario
		edad = sc.nextInt();
		
		contador++;

		} // Cierre while
		System.out.println("La suma de las edades ingresadas es: " + suma);
		System.out.println("La media de las edades ingresadas es: " + (suma / contador));
		System.out.println("La cantidad de alumnos es: " + contador);
		System.out.println("Los mayores de edad son: " + mayorEdad);

		

		sc.close();
	}

}
