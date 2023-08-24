package thp_tp1;

import java.util.Scanner;

public class EJ03 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//definir variables
		int numIngresado;
		int multiCinco;
		int divDos;
		
		//pedido e ingreso de numero entero
		System.out.println("Ingresa un numero entero");
		numIngresado = Integer.parseInt(input.next());
		
		//operacion aritmetica de multiplicacion por 5 y division por 2
		multiCinco = numIngresado * 5;
		divDos     = numIngresado / 2;
		
		//muestra por pantalla de operacion aritmetica de multiplicacion por 5 y division por 2
		System.out.println("El numero ingresado " + numIngresado + " multiplicado por 5 es " + multiCinco + " y dividido por 2 es " + divDos);
		
		input.close();
	}

}
