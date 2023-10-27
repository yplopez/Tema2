package buclefor;

import java.util.Scanner;

public class ForEj5 {

	public static void main(String[] args) {
		//Creo la variable para los números
		int num=0, acumulador=0;
		//Creo el Scanner para leer los números
		Scanner sc = new Scanner(System.in);
		//Creo el bucle for con las condiciones pedidas
		for(int i=1; i<=10; i++) {
			//Pido los números
			System.out.println("Ingrese un número:");
			//Leo los números
			num = sc.nextInt();
			//sumo los valores
			acumulador+=num;
		}//cierra for
		System.out.println("La media de los números ingresados es: " + (acumulador/10));
		//cierro Scanner
		sc.close();
		
	}

}
