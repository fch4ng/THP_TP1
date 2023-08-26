package thp_tp1;

import java.util.Scanner;

public class EJ22 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variable
		int i;
		
		//ciclo de for arranca en 1 y va hasta menos 6
		for(i = 1; i < 6; i++) {
			
			//muestra por pantalla progression usando print para que salga en una sola linea
			System.out.print(i);
		}
		
		//imprimo un espacio vacio
		System.out.println();
		
		//ciclo de for arranca en 5 y va hasta mas 0
		for(i = 5; i > 0; i--) {
			System.out.print(i);
		}

	}

}
