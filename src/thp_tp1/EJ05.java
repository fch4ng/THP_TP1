package thp_tp1;

import java.util.Scanner;

public class EJ05 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//definir variables
		int num1;
		int num2;
		int numAux;
		
		//pedido e ingreso de primer numero
		System.out.println("Ingresa el primer numero");
		num1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de segundo numero
		System.out.println("Ingresa el segundo numero");
		num2 = Integer.parseInt(input.next());
		
		//muestra por pantalla de numeros ingresados
		System.out.println("El primer numero es " + num1);
		System.out.println("El segundo numero es " + num2);
		
		//intercambio de num1 por num2 y vice versa con variable auxiliar
		numAux = num2;
		num2   = num1;
		num1   = numAux;
		
		//muestra por pantalla de valor de variables intercambiadas
		System.out.println("El primer numero es " + num1);
		System.out.println("El segundo numero es " + num2);
		
		input.close();
	}

}
