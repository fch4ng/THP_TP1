package thp_tp1;

import java.util.Scanner;

public class EJ16 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int cantidadInscriptos;
		int cantAsieentDisponibles;
		int asientosFaltantes;
		
		//pedido e ingreso de cantidad de inscriptos
		System.out.println("Ingrese cantidad de inscriptos");
		cantidadInscriptos = Integer.parseInt(input.next());
		
		//pedido e ingreso de cantidad de asientos disponibles
		System.out.println("Ingrese cantidad de asientos disponibles");
		cantAsieentDisponibles = Integer.parseInt(input.next());
		
		//operacion aritmetica de calculo de asientos faltantes
		asientosFaltantes = cantidadInscriptos - cantAsieentDisponibles;
		
		//condicional para determinar si faltan asientos
		if(asientosFaltantes <= 0) {
			
			//muestra por pantalla que asientos estan cubiertos
			System.out.println("Asientos cubiertos");
		}else {
			
			//muestra por pantalla de la cantidad de asientos faltantes
			System.out.println("Faltan " + asientosFaltantes + " asientos");
		}
		input.close();
	}

}
