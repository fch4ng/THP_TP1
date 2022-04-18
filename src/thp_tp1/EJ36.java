package thp_tp1;

import java.util.Scanner;

public class EJ36 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numX;
		int promedio;
		
		int     acumNumX = 0;
		int contadorNumX = 0;
		
		final int FIN = 20;
		
		do {
			System.out.println("Ingresa un numero");
			numX = Integer.parseInt(input.next());
			
			acumNumX = acumNumX + numX;
			contadorNumX++;
			promedio = acumNumX / contadorNumX;
					
			
		}while(promedio <= FIN);
		
		System.out.println("Fin de ingreso promedio superior a " + FIN);
		System.out.println("Se cargaron " + contadorNumX + " numeros");
	}

}
