package thp_tp1;

import java.util.Scanner;

public class EJ04 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int montoHoraTrabajo;
		int cantHorasTrabajo;
		int gananciaSemanal;
		int gananciaFinDeSemana;
		int gananciaTotal;
		
		//pedido e ingreso de valor monetario de hora de trabajo
		System.out.println("Ingresa valor monetario de una hora de trabajo");
		montoHoraTrabajo = Integer.parseInt(input.next());
		
		//pedido e ingreso de cantidad de horas trabajadas por dia
		System.out.println("Ingrese la cantidad de horas trabajadas por dia");
		cantHorasTrabajo = Integer.parseInt(input.next());
		
		//operacion aritmetica de ganancia semanal
		    gananciaSemanal = montoHoraTrabajo * cantHorasTrabajo * 5;
		
		//operacion aritmetica de ganancia de fin de semana
		gananciaFinDeSemana = montoHoraTrabajo * (cantHorasTrabajo / 2);
		
		//operacion aritmetica de ganancia total
		      gananciaTotal = gananciaSemanal + gananciaFinDeSemana;
		
		//muestra por pantalla de ganancia total
		System.out.println("La ganancia semanal es de " + gananciaTotal);
		
		input.close();
	}

}
