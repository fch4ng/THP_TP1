package thp_tp1;

import java.util.Scanner;

public class EJ29 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nota;
		
		do {
			System.out.println("Ingrese nota");
			nota = Integer.parseInt(input.next());
		}while(nota < 0 || nota > 10);

	}

}
