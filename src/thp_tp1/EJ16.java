package thp_tp1;

import java.util.Scanner;

public class EJ16 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cantidadInscriptos;
		int cantAsieentDisponibles;
		int asientosFaltantes;
		
		System.out.println("Ingrese cantidad de inscriptos");
		cantidadInscriptos = Integer.parseInt(input.next());
		
		System.out.println("Ingrese cantidad de asientos disponibles");
		cantAsieentDisponibles = Integer.parseInt(input.next());
		
		asientosFaltantes = cantidadInscriptos - cantAsieentDisponibles;
		
		if(asientosFaltantes <= 0) {
			System.out.println("Asientos cubiertos");
		}else {
			System.out.println("Faltan " + asientosFaltantes + " asientos");
		}
	}

}
