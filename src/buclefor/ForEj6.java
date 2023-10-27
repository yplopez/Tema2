package buclefor;

public class ForEj6 {

	public static void main(String[] args) {
		// Creo las variables
		int numImpar=1, sumaImpares=0;
		//Creo programa que sume los 10 primeros num impares
		for(int i=1; i<=20; i=i+2) {
			sumaImpares+=i;			
		}//cierre for
		System.out.println("La suma de los primeros 10 números"
				+ " impares es: " + sumaImpares);
		
		
	}

}

