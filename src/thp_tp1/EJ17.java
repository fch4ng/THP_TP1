package thp_tp1;

import java.util.Scanner;

public class EJ17 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		  int edad;
		 char genero;
	final int HOMBREJUBILACION = 65;
	final int MUJERJUBILACION = 60;
	final int MAXEDAD = 120;
	final int MINEDAD = 0;
	
	System.out.println("Ingrese edad (rango entre 1 a 120)");
	edad = Integer.parseInt(input.next());
	
	if(MAXEDAD > edad && MINEDAD < edad) { 
		System.out.println("Ingrese genero (opciones disponibles 'M' Hombre 'F' Mujer)");
		genero = input.next().charAt(0);
		
		if((genero == 'M') || (genero == 'F')) {
			
			if((edad >= MUJERJUBILACION && genero == 'F') || (edad >= HOMBREJUBILACION && genero == 'M')) {
				System.out.println("Esta en edad de jubilarse");
			}else {
				System.out.println("No se encuentra dentro del rango para jubilacion");
			}
			
		}else {
			System.out.println("Genero invalido");
			
		}
	}else {
		System.out.println("Edad fuera de rango");
		
	}
	
	}

}
