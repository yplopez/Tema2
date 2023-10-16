package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio6 {

	public static void main(String[] args) {
		// Creo variables de los coeficientes de la ecuación
		int a, b, c;

		// Creo variable del discriminante
		double discriminante;

		// Creo la variable para saber si la solución es negativa en la raíz cuadrada
		double x1;

		// Creo la variable para solución positiva de la raiz cuadrada
		double x2;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Pido los coeficiente a al usuario
		System.out.println("Escribe el coeficiente a: ");

		// Leo el número escrito en el teclado
		a = sc.nextInt();

		// Pido los coeficiente b al usuario
		System.out.println("Escribe el coeficiente a: ");

		// Leo el número escrito en el teclado
		b = sc.nextInt();

		// Pido los coeficiente c al usuario
		System.out.println("Escribe el coeficiente a: ");

		// Leo el número escrito en el teclado
		c = sc.nextInt();

		// Calculamos el discriminante
		discriminante = Math.pow(b, 2) - (4 * a * c);

		if (discriminante < 0) {
			System.out.println("La operación no tiene solución.");
		} else {
			if (a == 0) {
				// Si a=0 tenemos una ecuación de primer grado y tiene una sola solución.
				x1 = -c / b;
				System.out.println("La ecuación solo tiene una solución y es: " + x1);
				x1= (double) -c/b;
			}else {
				//Si el discriminante es >0, entonces ejecute las siguientes 2 operaciones
				x1 = (-b + Math.sqrt(discriminante)) / (2*a);
				x2 = (-b - Math.sqrt(discriminante)) / (2*a);
				System.out.println("Las soluciones de la ecuación son: \n " + x1 + "\n" + x2);
			}

			//Cierro el Scanner
			sc.close();
		}

	}

}
