package thp_tp1;

import java.util.Scanner;

public class EJ24 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1;
		int num2;
		//int i;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		do {
						
			System.out.println("Ingrese el segundo numero");
			num2 = Integer.parseInt(input.next());
			
		}while(num1 > num2);
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i);
			
			}
		System.out.println();
		
		for(int i = num1+1; i < num2; i++) {
			System.out.print(i);
			}	
		
	}

}
