package buclefor;

import java.util.Scanner;

public class ForEj1 {

	public static void main(String[] args) {
		// creo variable para pedir un número al usuario
		int num;
		//Creo el Scanner para leer teclado
		Scanner sc = new Scanner(System.in);
		//Pido un número
		System.out.println("Ingrese un número");
		//Leo el número ingresado
		num = sc.nextInt();
		//Creo bucle for con datos necesarios
		for(int i=1;i<=num;i++) {
		System.out.println("Los números antes de tu número son: " + i);	
		}
		//cierre scanner
		sc.close();
	}

}
