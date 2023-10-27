package dowhile;

import java.util.Scanner;

public class DoWhileEj4 {

	public static void main(String[] args) {
		// Creo las variables
		int num;
		int cont=1;
		int result;
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Pido un número al ususario para generar la tabla de muktiplicar
		System.out.println("Ingrese un número para obtener"
				+ " la tabla de multiplicar");
		
		//Leo el número digitado en teclado
		num = sc.nextInt();
		
		do {
			result=num*cont;
			System.out.println(num + "x" + cont + "=" + result);
			cont++;
		}while(cont<=10);

	}

}
