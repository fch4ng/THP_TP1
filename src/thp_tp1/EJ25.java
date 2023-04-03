package thp_tp1;

import java.util.Scanner;


public class EJ25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int ancho;
		int alto;
		int i;
		int k;
		
		System.out.println("Ingresa el ancho");
		ancho = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa el alto");
		alto = Integer.parseInt(input.nextLine());
		
		for(i = 0; i <= alto; i++) {
			
			for(k = 0; k <= ancho; k++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}

}
