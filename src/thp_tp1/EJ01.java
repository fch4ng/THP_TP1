package thp_tp1;

import java.util.Scanner;

public class EJ01 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombre;
		
		//pedido de ingreso de nombre
		System.out.println("Ingrese su nombre");
		
		//ingreso de nombre
		nombre = input.nextLine();
		
		//mensaje de salida con nombre ingresado
		System.out.println("Hola " + nombre);
		
		input.close();
	}

}
