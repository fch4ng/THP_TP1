package thp_tp1;

import java.util.Scanner;

public class EJ18 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		      int num1;
		      int num2;
		final int CERO = 0;
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de segundo numero
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		//condicional para determinar si num1 es mayor a num2
		if(num1 > num2) {
			
			//condicional para determinar si num1 divisible por num2
			if(CERO == num1 % num2) {
				
				//muestra por pantalla de que num1 es divisible por num2
				System.out.println(num1 + " es divisible por " + num2);
			}else {
				
				//muestra por pantalla de que num1 no es divisible por num2
				System.out.println(num1 + " no es divisible por " + num2);
			}
			
		//condicional para determinar si num2 es divisible por num1	
		}else if(CERO == num2 % num1) {
			
			//muestra por pantalla de que num2 es divisible por num1
			System.out.println(num2 + " es divisible por " + num1);
		}else {
			
			//muestra por pantalla de que num2 no es divisible por num1
			System.out.println(num2 + " no es divisible por " + num1);
		}
		
	input.close();	
	}

}
