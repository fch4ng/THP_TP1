package thp_tp1;

import java.util.Scanner;

public class EJ24 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int num1;
		int num2;
		
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//iniciar ciclo do para validar que segundo numero ingresado sea mayor al primero
		do {
						
			System.out.println("Ingrese el segundo numero");
			num2 = Integer.parseInt(input.next());
			
		}while(num1 > num2);
		
		//iniciar ciclo for en num1 hasta num2
		for(int i = num1; i <= num2; i++) {
			System.out.print(i);
			
			}
		System.out.println();
		
		//iniciar ciclo for en num1 mas 1 hasta num2 menos 1
		for(int i = num1+1; i < num2; i++) {
			System.out.print(i);
			}	
		
	}

}
