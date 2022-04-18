package thp_tp1;

import java.util.Scanner;

public class EJ32 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nota;
		
		do {
			System.out.println("Ingrese nota");
			nota = Integer.parseInt(input.next());
			
		}while(nota != 2 || (nota < 3 && nota > 11)); // revisa el ciclo no esta cortando bien
	}

}
