package thp_tp1;

import java.util.Scanner;

public class EJ01 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombre;
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Hola " + nombre);
	}

}
