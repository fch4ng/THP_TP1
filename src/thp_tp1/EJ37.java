package thp_tp1;

import java.util.Scanner;

public class EJ37 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int sueldoX;
		
		int acumSueldo     = 0;
		int contadorSueldo = 0;
		
		final int FIN = 12;
		
		do {
			System.out.println("Ingresa monto del sueldo");
			sueldoX = Integer.parseInt(input.next());
			
			acumSueldo = acumSueldo + sueldoX;
			contadorSueldo++;
		}while(sueldoX > 0 || contadorSueldo <= FIN);//trabado tratando de encontrar porque no corta
		
		System.out.println("La cantidad cobrada por el empleado a la fecha es de " + acumSueldo);
	}

}
