package thp_tp1;

import java.util.Scanner;

public class EJ34 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double estatura;
		double promEstatura;
		
		double acumEstatura  = 0;
		double contJugadores = 0;
		
		final double FIN = 0;
		
		do {
			System.out.println("Ingrese estatura");
			estatura = Double.parseDouble(input.next());
			
			acumEstatura = acumEstatura + estatura;
			contJugadores++;
			
		}while(estatura != FIN); 
		
		promEstatura = acumEstatura / contJugadores;
		
		System.out.println("La estatura promedio de los jugadores es " + promEstatura);

	}

}
