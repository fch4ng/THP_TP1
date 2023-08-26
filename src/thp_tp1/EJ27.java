package thp_tp1;

import java.util.Scanner;

public class EJ27 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int edad;
		int acumEdad   = 0;
		int contMas18  = 0;
		int promEdad;
		int i;
		
		//inicio de ciclo for hasta menos 5
		for(i = 0; i < 5; i++) {
			
			//pedido e ingreso de edad
			System.out.println("Ingresa edad");
			edad = Integer.parseInt(input.next());
			
			//operacion aritmetica para acumular edades
			acumEdad = acumEdad + edad;
			
			//condicional para excluir valores impares y mayores de 18
			if((0 != edad % 2) && (edad > 18)) {
				contMas18++;
			}
		}

		//calculo de promedio de edad
		promEdad = acumEdad / 5;
		
		//muestra por pantalla de resultados
		System.out.println("El promedio de edades ingresadas fue de " + promEdad);
		System.out.println("La cantidad de edades ingresadas impares mayores de 18 fueron " + contMas18);
	}

	
	
}
