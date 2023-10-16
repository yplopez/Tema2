package ejwhile;

import java.util.Scanner;

public class Ej5While {

	public static void main(String[] args) {
		// Declaro las variables
		int num;
		int contador = 1;
		int contNegativo=0;
		int contCero=0;
		int suma = 0;
		int sumaNeg = 0;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Creo las condiciones e instrucciones para ejecutar el programa
		while (contador <= 10) {
			System.out.println("Introduzca un número: ");// Pido al ususario un número
			num = sc.nextInt();// Leo el número ingresado

			if (num > 0) {	//Condición para sumar positivos e instrucción.
				suma += num;	
				
			} else if (num < 0) { //Condición para sumar negativos e ir contandolos
				sumaNeg += num;
				contNegativo++;
			} else {
				 contCero++;	//instrucción para contar números cero			 
			} // fin if-else
			contador++;
			
		} // fin while
		
		System.out.println("La suma de lós numeros positivos ingresados es: " + suma);
		System.out.println("La media de números negativos ingresados es: " + (sumaNeg / contNegativo));
		System.out.println("La cantidad de ceros ingresados fue: " + contCero );
		
		//Cierre del Scanner
		sc.close();
	} // fin clase

}
