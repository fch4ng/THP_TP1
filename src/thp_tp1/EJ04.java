package thp_tp1;

import java.util.Scanner;

public class EJ04 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int montoHoraTrabajo;
		int cantHorasTrabajo;
		int gananciaSemanal;
		int gananciaFinDeSemana;
		int gananciaTotal;
		
		System.out.println("Ingresa valor monetario de una hora de trabajo");
		montoHoraTrabajo = Integer.parseInt(input.next());
		
		System.out.println("Ingrese la cantidad de horas trabajadas por dia");
		cantHorasTrabajo = Integer.parseInt(input.next());
		
		    gananciaSemanal = montoHoraTrabajo * cantHorasTrabajo * 5;
		
		gananciaFinDeSemana = montoHoraTrabajo * (cantHorasTrabajo / 2);
		
		      gananciaTotal = gananciaSemanal + gananciaFinDeSemana;
		      
		System.out.println("La ganancia semanal es de " + gananciaTotal);
	}

}
