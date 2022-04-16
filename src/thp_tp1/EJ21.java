package thp_tp1;

import java.util.Scanner;

public class EJ21 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int dia;
				
		final int DOMINGO   = 1;
		final int LUNES     = 2;
		final int MARTES    = 3;
		final int MIERCOLES = 4;
		final int JUEVES    = 5;
		final int VIERNES   = 6;
		final int SABADO    = 7;
		
		System.out.println("Ingrese un numero del 1 al 7");
		dia = Integer.parseInt(input.next());
		
		switch (dia) {
		case 1:	System.out.println("Domingo"); 
			break;
		case 2:	System.out.println("Lunes"); 
			break;
		case 3: System.out.println("Martes"); 
			break;
		case 4: System.out.println("Miercoles"); 
			break;
		case 5: System.out.println("Jueves"); 
			break;
		case 6: System.out.println("Viernes"); 
			break;
		case 7: System.out.println("Sabado"); 
			break;
		default: System.out.println("ERROR");
		}

	}

}
