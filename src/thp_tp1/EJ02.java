package thp_tp1;

import java.util.Scanner;

public class EJ02 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nota1;
		int nota2;
		int nota3;
		int promedio;
		
		System.out.println("Ingresa la primera nota");
		nota1 = Integer.parseInt(input.next());
		
		System.out.println("Ingresa la segunda nota");
		nota2 = Integer.parseInt(input.next());
		
		System.out.println("Ingresa la tercera nota");
		nota3 = Integer.parseInt(input.next());
		
		promedio = (nota1+nota2+nota3)/3;
		
		System.out.println("El promedio de las tres notas es " + promedio);
	}

}
