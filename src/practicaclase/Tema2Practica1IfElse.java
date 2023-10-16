package practicaclase;

import java.util.Scanner;

public class Tema2Practica1IfElse {

	public static void main(String[] args) {
		
		//Declaro variable del número
		int num;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Escribe un número: ");
		
		//Leo el número
		num = sc.nextInt();
		
		//Creo la condición doble
		if(num%2==0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar.");
		}
		
		//cierro el Scanner
		sc.close();
		
		
		

	}

}
