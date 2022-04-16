package thp_tp1;

import java.util.Scanner;

public class EJ07 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int largo;
		int ancho;
		int valorMetrosCuadrados;
		int valorTotalTerreno;
		int cantidadAlambre;
		
		System.out.println("Ingresa largo del terreno");
		largo = Integer.parseInt(input.next());
		
		System.out.println("Ingresa ancho del terreno");
		ancho = Integer.parseInt(input.next());
		
		System.out.println("Ingresa valor por metros cuadrados");
		valorMetrosCuadrados = Integer.parseInt(input.next());
		
		valorTotalTerreno = largo * ancho * valorMetrosCuadrados;
		
		cantidadAlambre = ((2 * largo) + (2 * ancho)) * 3;
		
		System.out.println("El valor total del terreno es de " + valorTotalTerreno);
		System.out.println("Se necesita " + cantidadAlambre + " metros de alambre para cercarlo por completo en  tres alturas");

	}

}
