package thp_tp1;

import java.util.Scanner;

public class EJ05 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int numAux;
		
		System.out.println("Ingresa el primer numero");
		num1 = Integer.parseInt(input.next());
		
		System.out.println("Ingresa el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		System.out.println("El primer numero es " + num1);
		System.out.println("El segundo numero es " + num2);
		
		numAux = num2;
		num2   = num1;
		num1   = numAux;
		
		System.out.println("El primer numero es " + num1);
		System.out.println("El segundo numero es " + num2);
	}

}
