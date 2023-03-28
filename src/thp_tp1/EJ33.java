package thp_tp1;

import java.util.Scanner;

public class EJ33 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numX;
		
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;
		
		
		final int FIN = 0;
		
		do {
			System.out.println("Ingrese nota ('0' para finalizar)");
			numX = Integer.parseInt(input.next());
			
			if(numX > numMax) {
				numMax = numX;
			}else if( (numX < numMin)) {//inclui que numMin sea distinto de cero
				numMin = numX;
			}
			
		}while(numX != FIN);
		
		System.out.println("El numero maximo es " + numMax);
		System.out.println("El numero minimo es " + numMin);
	}

}
