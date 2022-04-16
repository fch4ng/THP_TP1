package thp_tp1;

import java.util.Scanner;

public class EJ12 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		if(num1 > num2) {
			System.out.println(num1 + " es mayor");
		}else {
			System.out.println(num2 + " es mayor");
		}
	}

}
