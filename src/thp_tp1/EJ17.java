package thp_tp1;

import java.util.Scanner;

public class EJ17 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
	//definir variables
		  int edad;
		 char genero;
	final int HOMBREJUBILACION = 65;
	final int MUJERJUBILACION = 60;
	final int MAXEDAD = 120;
	final int MINEDAD = 0;
	
	//pedido e ingreso de edad
	System.out.println("Ingrese edad (rango entre 1 a 120)");
	edad = Integer.parseInt(input.next());
	
	//condicional compuesto para validar edad ingreda sea valida
	if(MAXEDAD > edad && MINEDAD < edad) { 
		
		//ingreso de genero de persona
		System.out.println("Ingrese genero (opciones disponibles 'M' Hombre 'F' Mujer)");
		genero = input.next().toUpperCase().charAt(0);
		
		//condicional compuesto para determinar genero
		if((genero == 'M') || (genero == 'F')) {
			
			//condicional para determinar si esta en edad de jubilarse
			if((edad >= MUJERJUBILACION && genero == 'F') || (edad >= HOMBREJUBILACION && genero == 'M')) {
				
				//muestra por pantalla que esta en edad de jubilarse
				System.out.println("Esta en edad de jubilarse");
			}else {
				
				//muestra por pantalla que no esta dentro de rango de edad de jubilacion
				System.out.println("No se encuentra dentro del rango para jubilacion");
			}
			
		}else {
			
			//muestra por pantalla genero invalido
			System.out.println("Genero invalido");
			
		}
	}else {
		
		//muestra por pantalla edad fuera de rango
		System.out.println("Edad fuera de rango");
		
	}
	
	input.close();
	}

}
