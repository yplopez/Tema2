package buclefor;

import java.util.Scanner;

public class ForEj4 {

	public static void main(String[] args) {
		// Creo variable para num que voy a pedir
		int num;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Pido el número al usuario
		System.out.println("Ingrese un número: ");
		// Leo el número
		num = sc.nextInt();
		// Creo bucle for con estructura necesaria y condiciones
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
