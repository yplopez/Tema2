package practicaclase;

import java.util.Scanner;

public abstract class Tema2IfElseEjercicio10 {

	public static void main(String[] args) {
		// Declaro las variables para los números enteros
		int num1, num2, num3;
		
		//Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que escriba los tres numeros
		System.out.println("Digita 3 números enteros");
		
		//Leo los números digitados por teclado
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//Creo las condiciones e instrucciones para dar una respuesta al usuario
		if (num1 + num2 == num3) {
			System.out.println("La suma del número 1 y 2 da como resultado el número 3");
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de los números 1 y 3 da como resultado el número 2");
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de los números 2 y 3 da como resultado el número 1");
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
