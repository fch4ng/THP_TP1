package thp_tp1;

import java.util.Scanner;

public class EJ35 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombreEdadMinima = " ";
		String nom;
		   int edad;
		   int edadMinima        = 100;
  final String FIN               = "*";
		
		do {
			System.out.println("Ingrese nombre (ingrese '*' para finalizar)");
			nom = input.nextLine();
			
			input.nextLine();
			
			System.out.println("Ingrese edad");
			edad = Integer.parseInt(input.next());
			
				if(edad < edadMinima) {
					nombreEdadMinima = nom;
					      edadMinima = edad;
			}
		}while(!(nom.equals(FIN))); // como hago que corte bien el ciclo, proba uso de While
		
		System.out.println("La persona mas joven es " + nombreEdadMinima + " de " + edadMinima + " a�os de edad");
	}

}
