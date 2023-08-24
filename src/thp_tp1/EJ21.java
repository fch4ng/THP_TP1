package thp_tp1;

import java.util.Scanner;

public class EJ21 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int dia;
				
		final int DOMINGO   = 1;
		final int LUNES     = 2;
		final int MARTES    = 3;
		final int MIERCOLES = 4;
		final int JUEVES    = 5;
		final int VIERNES   = 6;
		final int SABADO    = 7;
		
		//pedido e ingreso de numero
		System.out.println("Ingrese un numero del 1 al 7");
		dia = Integer.parseInt(input.next());
		
		//eleccion de dia en base al numero ingresado
		switch (dia) {
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 1:	System.out.println("Domingo"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 2:	System.out.println("Lunes"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 3: System.out.println("Martes"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 4: System.out.println("Miercoles"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 5: System.out.println("Jueves"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 6: System.out.println("Viernes"); 
			break;
		//muestra por pantalla del dia de la semana con respecto al numero ingresado
		case 7: System.out.println("Sabado"); 
			break;
		default: System.out.println("ERROR");
		}
		input.close();
	}

}
