package thp_tp1;

import java.util.Scanner;

public class EJ11 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		      int numX;
		final int CERO = 0;
		
		//pedido e ingreso de numero entero
		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		//verificacion si numero es par o impar usando operacion de modulo %
		if(CERO == numX % 2) {
			
		//muestra por pantalla si numero es par
			System.out.println(numX + " es par");
		} else {
			
		//muestra por pantalla si numero es impar
			System.out.println(numX + " es impar");
		}
		input.close();
	}

}
