package thp_tp1;

import java.util.Scanner;

public class EJ27 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int edad;
		int acumEdad   = 0;
		int contMas18  = 0;
		int promEdad;
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Ingresa edad");
			edad = Integer.parseInt(input.next());
			
			acumEdad = acumEdad + edad;
			
			if((0 != edad % 2) && (edad > 18)) {
				contMas18++;
			}
		}

		promEdad = acumEdad / 5;
		
		System.out.println("El promedio de edades ingresadas fue de " + promEdad);
		System.out.println("La cantidad de edades ingresadas impares mayores de 18 fueron " + contMas18);
	}

	
	
}
