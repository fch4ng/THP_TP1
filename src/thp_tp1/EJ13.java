package thp_tp1;

import java.util.Scanner;

public class EJ13 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		System.out.println("Ingrese el tercer numero");
		num3 = Integer.parseInt(input.next());
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " es mayor");
		}else if ((num2 > num1) && (num2 > num3)){
			System.out.println(num2 + " es mayor");
		}else {
			System.out.println(num3 + " es mayor");
		}
	}

}
