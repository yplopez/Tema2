package buclefor;

import java.util.Scanner;

public class ForEj7 {

	public static void main(String[] args) {
		// Creo variables para calcular factorial
		int num;
		int contador=1;
		//Creo el scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número para hallar su factorial:");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
				contador *=i; //contador se multiplica por i
		}//cierre 
		System.out.println("La factorial del número es: " + contador);
		sc.close();
	}

}
