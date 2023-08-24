package thp_tp1;

import java.util.Scanner;

public class EJ07 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int largo;
		int ancho;
		int valorMetrosCuadrados;
		int valorTotalTerreno;
		int cantidadAlambre;
		
		//pedido e ingreso de largo del terreno
		System.out.println("Ingresa largo del terreno");
		largo = Integer.parseInt(input.next());
		
		//pedido e ingreso de ancho del terreno
		System.out.println("Ingresa ancho del terreno");
		ancho = Integer.parseInt(input.next());
		
		//pedido e ingreso de valor por metros cuadrados
		System.out.println("Ingresa valor por metros cuadrados");
		valorMetrosCuadrados = Integer.parseInt(input.next());
		
		//operacion aritmetica de calculo de valor del terreno
		valorTotalTerreno = largo * ancho * valorMetrosCuadrados;
		
		//operacion aritmetica de calculo de cantidad de alambre
		cantidadAlambre = ((2 * largo) + (2 * ancho)) * 3;
		
		//muestra por pantalla de valor total del terreno y cantidad de alambre necesaria
		System.out.println("El valor total del terreno es de " + valorTotalTerreno);
		System.out.println("Se necesita " + cantidadAlambre + " metros de alambre para cercarlo por completo en  tres alturas");

		input.close();
	}

}
