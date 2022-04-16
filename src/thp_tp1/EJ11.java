package thp_tp1;

import java.util.Scanner;

public class EJ11 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		      int numX;
		final int CERO = 0;
		
		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		if(CERO == numX % 2) {
			System.out.println(numX + " es par");
		} else {
			System.out.println(numX + " es impar");
		}
		
	}

}
