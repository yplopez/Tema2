package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio4 {

	public static void main(String[] args) {
		//Declaro las variables de los números
		int num1, num2;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Escribe un número: ");
		
		//Leo el número
		num1 = sc.nextInt();
		
		//Pido un número al usuario
		System.out.println("Escribe otro número: ");
				
		//Leo el número
		num2 = sc.nextInt();
		
		//Muestro mensaje introductorio
		System.out.println("El orden de los números de menor a mayor es: ");
		
		//Creo la condición
		if (num1>num2) {
		System.out.println(num2 +  "\n" +  num1 + " ");
		}else {
			System.out.println(num1 + "\n" + num2 + " ");
		}
		
		//Cierre del Scanner
		sc.close();
		
		

	}

}
