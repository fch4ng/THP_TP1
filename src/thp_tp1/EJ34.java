package thp_tp1;

import java.util.Scanner;

public class EJ34 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		double estatura;
		double promEstatura;
		
		double acumEstatura  = 0;
		double contJugadores = 0;
		
		final double FIN = 0;
		
		//iniciar ciclo do que finaliza una vez ingresado 0
		do {
			//pedido e ingreso de estatura
			System.out.println("Ingrese estatura");
			estatura = Double.parseDouble(input.next());
			
			//operacion aritmetica acumulando estatras
			acumEstatura = acumEstatura + estatura;
			
			//contador de jugadores
			contJugadores++;
			
		}while(estatura != FIN); 
		
		//operacion aritmetica de promedio de estatura
		promEstatura = acumEstatura / contJugadores;
		
		//muestra por pantalla de promedio de estatura de jugadores
		System.out.println("La estatura promedio de los jugadores es " + promEstatura);

	}

}
