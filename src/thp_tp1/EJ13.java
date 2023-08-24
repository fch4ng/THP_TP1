package thp_tp1;

import java.util.Scanner;

public class EJ13 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//definir variables
		int num1;
		int num2;
		int num3;
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de segundo numero
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		//pedido e ingreso de tercer numero
		System.out.println("Ingrese el tercer numero");
		num3 = Integer.parseInt(input.next());
		
		//condicional compuesto para determinar si num1 es mayor que num2 y num3
		if((num1 > num2) && (num1 > num3)) {
			
			//muestra por pantalla que num1 es mayor
			System.out.println(num1 + " es mayor");
		
		//condicional compuesto para determinar si num2 es mayor que num1 y num3
		}else if ((num2 > num1) && (num2 > num3)){
			
			//muestra por pantalla que num2 es mayor
			System.out.println(num2 + " es mayor");
		}else {
			
			//muestra por pantalla que num3 es mayor
			System.out.println(num3 + " es mayor");
		}
		input.close();
	}

}
