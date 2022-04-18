package thp_tp1;

import java.util.Scanner;

public class EJ33 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numX;
		
		int numMax = 0;
		int numMin = 0;
		
		final int FIN = 0;
		
		do {
			System.out.println("Ingrese nota ('0' para finalizar)");
			numX = Integer.parseInt(input.next());
			
			if(numX > numMax) {
				numMax = numX;
			}else if((numX < numMax) && (numX < numMin)) {
				numMin = numX;
			}
			
		}while(numX != FIN);// como hago para que 0 no me lo cuente como numerominimo? 
		
		System.out.println("El numero maximo es " + numMax);
		System.out.println("El numero minimo es " + numMin);
	}

}
