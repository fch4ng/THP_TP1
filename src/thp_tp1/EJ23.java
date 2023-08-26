package thp_tp1;

import java.util.Scanner;

public class EJ23 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int numX;
		int i;
		int resultado;
		
		//pedido e ingreso de numero entero
		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		//arranque del ciclo for en 0 hasta 11 incrementando de a uno
		for(i = 0; i < 11; i++) {
			//muestra por pantalla ciclo de numeros
			System.out.println(numX * i);
		}
	}

}
