package ejwhile;

import java.util.Scanner;

public class Ej3While {

	public static void main(String[] args) {
		//// Declaro las variables
		int numero;
		int suma =0;
		float contador=0;
		
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Digite un número. Para salir ingrese un número negativo.");
		
		//Leo el número ingresado
		numero=sc.nextInt();
		
		//Creo la condición e instrucciones
		while (numero>=0) {
			suma += numero; 
			contador++;	
			
			//Pedimos un número al usuario
			System.out.println("Digite un número. Para salir ingrese un número negativo.");
			
			//Leo el número ingresado
			numero=sc.nextInt();
			
		}
		//Imprimo el valor de la suma (***Por fuera de las llaves***)
		System.out.println("La media de los números ingresados es: " + (numero/contador));
		
		//Cierro el Scanner
		sc.close();

	}

}
