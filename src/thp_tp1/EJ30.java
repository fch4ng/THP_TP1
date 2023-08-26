package thp_tp1;

import java.util.Scanner;

public class EJ30 {
	
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
		final char FIN   = 'F';
		
		//inicio de ciclo do hasta ingreso de letra F para terminar operacion
		do {
			
		//pedido e ingreso de num1	
		System.out.println("Ingrese primer numero entero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de num2
		System.out.println("Ingrese segundo numero entero");
		num2 = Integer.parseInt(input.next());
		
		//pedido e ingreso de operacion
		System.out.println("Ingrese la operacion deseada '+' suma; '-' resta; '*' multiplicacion; '/' division");
		operacion = input.next().charAt(0);
		
		//switch para ejecutar operacion seleccionada
		switch (operacion) {
			//operacion de suma
			case SUMA: resultado = num1 + num2; 
					System.out.println("Resultado de la suma es " + resultado); 
					break;
			//operacion de resta
			case RESTA: resultado = num1 - num2; 
					System.out.println("Resultado de la resta es " + resultado); 
					break;
			//operacion de division
			case DIV: if(0 != num2) {
					resultado = num1 / num2; 
					System.out.println("Resultado de la division es " + resultado); 
					}else {
						System.out.println("ERROR");
					}
				break;
			//operacion de multiplicacion
			case MULTI: resultado = num1 * num2; 
					System.out.println("Resultado de la multiplicacion es " + resultado); 
					break;
		}
		
		}while(operacion != 'F');
		
		//muestra por pantalla que operaciones finalizadas
		System.out.println("Operaciones ingresadas concluidas");

	}

}
