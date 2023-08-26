package thp_tp1; // como hago que corte bien el ciclo

import java.util.Scanner;

public class EJ35 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		String nombreEdadMinima = " ";
		String nom;
		   int edad;
		   int edadMinima        = 100;
  final String FIN               = "*";
		
  		//inicio del ciclo do que finaliza cuando se ingresa *
		do {
			
			//pedido e ingreso de nombre
			System.out.println("Ingrese nombre (ingrese '*' para finalizar)");
			nom = input.nextLine();
			
			//imprimo linea en blanco
			input.nextLine();
			
			//pedido e ingreso de edad
			System.out.println("Ingrese edad");
			edad = Integer.parseInt(input.next());
			
			//condicional para determinar si edad es menor a edadMinima
				if(edad < edadMinima) {
					
					//si condicional TRUE se asgina nombre a nombreEdadMininima y edad a edadMinima
					nombreEdadMinima = nom;
					      edadMinima = edad;
			}
		}while(!(nom.equals(FIN))); // como hago que corte bien el ciclo
		
		
		//muestra por pantalla de nombre y edad minima
		System.out.println("La persona mas joven es " + nombreEdadMinima + " de " + edadMinima + " a�os de edad");
	}

}
