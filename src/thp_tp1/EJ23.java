package thp_tp1;

import java.util.Scanner;

public class EJ23 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numX;
		int i;
		int resultado;
		
		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		for(i = 0; i < 11; i++) {
			System.out.println(numX * i);
		}
	}

}
