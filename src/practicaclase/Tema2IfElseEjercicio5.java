package practicaclase;

import java.util.Scanner;

public class Tema2IfElseEjercicio5 {

	public static void main(String[] args) {
		// Declaro las variables
		int a, b, c;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que digite los números
		System.out.println("Digita 3 numeros diferentes: ");
		
		//Leo los números digitados
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//Creo la condición y las instrucciones para imprimir en consola
		if(a>b && b>c) {
			System.out.println("El orden de mayor a menor es: \n" + a +  "\n" + b + "\n" + c + "  ");
		}else if (a>c && c>b){
			System.out.println("El orden de mayor a menor es: \n" + a +  "\n" + c + "\n" + b + "  ");
		}else if (b>a && a>c){
			System.out.println("El orden de mayor a menor es: \n" + b +  "\n" + a + "\n" + c + "  ");
		}else if (b>c && c>a){
			System.out.println("El orden de mayor a menor es: \n" + b +  "\n" + c + "\n" + a + "  ");
		}else if (c>a && a>b){
			System.out.println("El orden de mayor a menor es: \n" + c +  "\n" + a + "\n" + b + "  ");
		}else if (c>b && b>a){
			System.out.println("El orden de mayor a menor es: \n" + c +  "\n" + b + "\n" + a + "  ");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
