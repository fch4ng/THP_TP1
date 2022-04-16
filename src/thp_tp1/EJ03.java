package thp_tp1;

import java.util.Scanner;

public class EJ03 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numIngresado;
		int multiCinco;
		int divDos;
		
		System.out.println("Ingresa un numero entero");
		numIngresado = Integer.parseInt(input.next());
		
		multiCinco = numIngresado * 5;
		divDos     = numIngresado / 2;
		
		System.out.println("El numero ingresado " + numIngresado + " multiplicado por 5 es " + multiCinco + " y dividido por 2 es " + divDos);
		
	}

}
