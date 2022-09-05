package thp_tp1;

import java.util.Scanner;

public class EJ24 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int i;
		
		do {
			System.out.println("Ingrese el primer numero");
			num1 = Integer.parseInt(input.next());
			
			System.out.println("Ingrese el segundo numero");
			num2 = Integer.parseInt(input.next());
			
		}while(num1 >= num2);
		
		for(i = num1; i <= num2; num1++) {
			System.out.print(i++);
			}
		
		System.out.println();
		
		for(i = num1+1; i <= num2-1; num1++) {//no sale la segunda cuenta
			System.out.print(i++);
			}

	}

}
