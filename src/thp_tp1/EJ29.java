package thp_tp1;

import java.util.Scanner;

public class EJ29 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variable
		int nota;
		
		//iniciar ciclo do para validar que nota sea entre 0 y 10
		do {
			
			//pedido e ingreso de nota
			System.out.println("Ingrese nota");
			nota = Integer.parseInt(input.next());
		}while(nota < 0 || nota > 10);

	}

}
