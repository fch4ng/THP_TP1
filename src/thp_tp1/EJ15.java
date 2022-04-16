package thp_tp1;

import java.util.Scanner;

public class EJ15 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		  double altura;
	         int edad;
	final double ALTURAMINIMA = 1.50;
	final int    EDADMINIMA   = 6;
	
	System.out.println("Ingrese edad");
	edad = Integer.parseInt(input.next());
	
	System.out.println("Ingrese edad");
	altura = Double.parseDouble(input.next());
	
	if(edad >= EDADMINIMA && altura > ALTURAMINIMA) {
		System.out.println("Puede Ingresar");
	}else {
		System.out.println("No Puede Ingresar");
	}

	}

}
