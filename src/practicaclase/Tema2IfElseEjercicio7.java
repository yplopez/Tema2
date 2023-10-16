package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio7 {

	public static void main(String[] args) {
		
		//Declaro la variable para el número
		int num;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que ingrese un número
		System.out.println("Ingrese un número: ");
		
		//Leo el número ingresado por teclado
		num=sc.nextInt();
		
		if(num<=9) {
			System.out.println("Tu número tiene una (1) cifra.");
		}else if (num<=99) {
			System.out.println("Tu número tiene dos (2) cifras.");
		}else if (num<=999) {
			System.out.println("Tu número tiene tres (3) cifras.");
		}else if (num<=9999) {
			System.out.println("Tu número tiene cuatro (4) cifras.");
		}else if (num<=99999) {
			System.out.println("Tu número tiene cinco (5) cifras.");
		} 
		
		//Cierro el Scanner
		sc.close();
		

	}
}
