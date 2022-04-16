package thp_tp1;

import java.util.Scanner;

public class EJ08 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int suma;
		int resta;
		int multi;
		int div;
		
		System.out.println("Ingresa el primer numero");
		num1 = Integer.parseInt(input.next());
		
		System.out.println("Ingresa el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		suma = num1 + num2;
		
		resta = num1 - num2;
		
		multi = num1 * num2;
		
		div = num1 / num2;
		
		System.out.println("Suma " + suma);
		System.out.println("Resta " + resta);
		System.out.println("Multiplicacion " + multi);
		System.out.println("Division " + div);
	}

}
