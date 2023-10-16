package ejwhile;

import java.util.Scanner;

public class Ej1While {

	public static void main(String[] args) {
		// Declaro las variables
		int numero;
		int suma =0;
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Digite un número. Para salir ingrese un número negativo.");
		
		//Leo el número ingresado
		numero=sc.nextInt();
		
		//Creo la condición e instrucciones
		while (numero>0) {
			suma += numero; // suma = suma + número
			
			//Pedimos un número al usuario
			System.out.println("Digite un número. Para salir ingrese un número negativo.");
			
			//Leo el número ingresado
			numero=sc.nextInt();
		}
		//Imprimo el valor de la suma (***Por fuera de las llaves***)
		System.out.println("La suma es igual a: " + suma);
		
		//Cierro el Scanner
		sc.close();
	}

}
