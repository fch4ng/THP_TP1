package thp_tp1;//no sale del ciclo

import java.util.Scanner;

public class EJ31 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		 int edad;
		char continuar;

		final char CONTMAYUS = 'N';
		final char CONTMINUS = 'n';
		final int EDADVALIDA = 40;
		
		do {
			System.out.println("Ingrese edad");
			edad = Integer.parseInt(input.next());
			
			if(edad != EDADVALIDA) {
				System.out.println("Edad valida, desea continuar 'S' Si, 'N' No");
				continuar = input.next().toUpperCase().charAt(0);
			}else {
				System.out.println("Edad no valida, desea continuar 'S' Si, 'N' No");
				continuar = input.next().toUpperCase().charAt(0);
			}
			
		}while(continuar != CONTMAYUS || continuar != CONTMINUS);//no sale del ciclo
		
	}

}
