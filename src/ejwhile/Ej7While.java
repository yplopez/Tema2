package ejwhile;

import java.util.Random;
import java.util.Scanner;

public class Ej7While {

	public static void main(String[] args) {
		//Creo la variable
		int num=0, aleatorio;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Creo objeto de la clase random
		Random rand = new Random();
		//La máquina genra número aleatorio
		aleatorio = rand.nextInt(1,101);
		//Pido un número al usuario
		System.out.println("Adivina el número secreto: ");
		//Leo el número ingresado por teclado
		num=sc.nextInt();
		//Continúo preguntando números mientras no acierte o se rinda
		while (num!=aleatorio&&num>=0) {
			if(num<aleatorio) {
				System.out.println("El número es mayor. "
						+ "Recuerda, si te rindes introduce un número negativo ");
				
			} else if (num>aleatorio) {
				System.out.println("El número es menor"
						+ "Recuerda, si te rindes introduce un número negativo");
			} 
			System.out.println("Vuelvelo a intentar: ");
			num=sc.nextInt();
			
		}//Cierre while
		if (num<0) {
			System.out.println("Te has rendido... Hasta pronto!");
		}else {
		System.out.println("Has acertado!!!");
		}
		//Cierre del scanner
		sc.close();
	}

}
