package thp_tp1;

import java.util.Scanner;

public class EJ18 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		      int num1;
		      int num2;
		final int CERO = 0;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		if(num1 > num2) {
			if(CERO == num1 % num2) {
				System.out.println(num1 + " es divisible por " + num2);
			}else {
				System.out.println(num1 + " no es divisible por " + num2);
			}
		}else if(CERO == num2 % num1) {
			System.out.println(num2 + " es divisible por " + num1);
		}else {
			System.out.println(num2 + " no es divisible por " + num1);
		}
	}

}
