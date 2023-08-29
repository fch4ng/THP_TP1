package thp_tp1;

import java.util.Scanner;

public class EJ33 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables  
		int numX;
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;
				
		final int FIN = 0;
		
		//iniciar ciclo do que finalizara cuando se ingrese numero 0
		do {
			//pedido e ingreso de numX, se aclara que se ingresa 0 para finalizar proceso
			System.out.println("Ingrese nota ('0' para finalizar)");
			numX = Integer.parseInt(input.nextLine());
			
			//condicional que compara si numX ingresado mayor a numMax
			if(numX > numMax) {
				
				//siendo numX mayor a numMax ahora se asigna valor de numX a numMax
				numMax = numX;
				
				//condicional que compara si numX ingresado mayor a numMax
			}else if((numX < numMin) && numX != 0) {
				
				//siendo numX menor a numMin ahora se asigna valor de numX a numMin
				numMin = numX;
			}
			
		}while(numX != FIN);
		
		//se muestra por pantalla numMax y numMin
		System.out.println("El numero maximo es " + numMax);
		System.out.println("El numero minimo es " + numMin);
	}

}
