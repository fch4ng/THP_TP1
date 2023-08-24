package thp_tp1;

import java.util.Scanner;

public class EJ12 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//definir variables
		int num1;
		int num2;
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		//condicional para determinar si num1 es mayor a num2
		if(num1 > num2) {
			
			//muestra por pantalla si num1 es mayor
			System.out.println(num1 + " es mayor");
		}else {
			
			//muestra por pantalla si num2 es mayor
			System.out.println(num2 + " es mayor");
		}
		
		input.close();
	}

}
