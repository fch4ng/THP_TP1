package thp_tp1;

import java.util.Scanner;

public class EJ20 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		 int num1;
		 int num2;
		 int resultado;
		char operacion;
		
		final char SUMA  = '+';
		final char RESTA = '-';
		final char MULTI = '*';
		final char DIV   = '/';
		
		//pedido e ingreso de primer numero
		System.out.println("Ingrese primer numero entero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de segundo numero
		System.out.println("Ingrese segundo numero entero");
		num2 = Integer.parseInt(input.next());
		
		//pedido e ingreso de operacion aritmetica
		System.out.println("Ingrese la operacion deseada '+' suma; '-' resta; '*' multiplicacion; '/' division");
		operacion = input.next().charAt(0);
		
		//eleccion de operacion aritmetica
		switch (operacion) {
		
		//operacion y muestra por pantalla de operacion
		case SUMA: resultado = num1 + num2; 
				System.out.println("Resultado de la suma es " + resultado); 
			break;
		//operacion y muestra por pantalla de operacion
		case RESTA: resultado = num1 - num2; 
				System.out.println("Resultado de la resta es " + resultado); 
			break;
		//operacion y muestra por pantalla de operacion
		case DIV: if(0 != num2) {
					resultado = num1 / num2; 
					System.out.println("Resultado de la division es " + resultado); 
					}else {
						System.out.println("ERROR");
					}
			break;
		//operacion y muestra por pantalla de operacion
		case MULTI: resultado = num1 * num2; 
				System.out.println("Resultado de la multiplicacion es " + resultado); 
			break;
		default: System.out.println("Operacion incorrecta");
		}
		input.close();
	}

}
