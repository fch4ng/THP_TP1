package thp_tp1;

import java.util.Scanner;

public class EJ08 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//definir variables
		int num1;
		int num2;
		int suma;
		int resta;
		int multi;
		int div;
		
		//pedido e ingreso e primer numero
		System.out.println("Ingresa el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso e primer numero
		System.out.println("Ingresa el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		//ejecucion de 4 operaciones aritmeticas
		suma = num1 + num2;
		
		resta = num1 - num2;
		
		multi = num1 * num2;
		
		div = num1 / num2;
		
		//muestra por pantalla de 4 operaciones aritmeticas
		System.out.println("Suma " + suma);
		System.out.println("Resta " + resta);
		System.out.println("Multiplicacion " + multi);
		System.out.println("Division " + div);
		
		input.close();
	}

}
