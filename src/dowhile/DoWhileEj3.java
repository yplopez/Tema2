package dowhile;

import java.util.Scanner;

public class DoWhileEj3 {

	public static void main(String[] args) {
		//Creo las variables
		int num, cont=1, sumaNum=0;
		//Creo el scanner para leer teclado
		Scanner sc = new Scanner(System.in);
		//Pido un número al usuario
		System.out.println("Introduzca un número: ");
		//Leo el número escrito por teclado
		num = sc.nextInt();
		
		do{
			sumaNum += cont;
			cont++;
			
		}while (cont<=num);
			System.out.println("La sumatoria de los números es: " + sumaNum);
			
		sc.close();
		

	}

}
