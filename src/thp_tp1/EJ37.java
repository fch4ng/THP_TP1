package thp_tp1;

import java.util.Scanner;

public class EJ37 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int sueldoX;
		
		int acumSueldo     = 0;
		int contadorSueldo = 0;
		
		final int FIN = 12;
		
		//inicio de ciclo do que finaliza si se ingresa un numero negativo o llega al maximo de 12 cargas
		do {
			
			//pedido e ingreso de sueldo
			System.out.println("Ingresa monto del sueldo");
			sueldoX = Integer.parseInt(input.next());
			
			//condicional si valor mayor a 0
			if(sueldoX > 0){
				
				//contador de sueldo
				contadorSueldo++;
				
				//acumulador de sueldo
				acumSueldo = acumSueldo + sueldoX;

			}else{
				
				//muestra por pantalla que todavia no se cobro mes en curso
				System.out.println("Todavia no se ha cobrado el mes en curso");
			}
			
		}while(sueldoX > 0 && contadorSueldo < FIN);
		
		//muestra por pantalla del monto cobrado a la fecha
		System.out.println("La cantidad cobrada por el empleado a la fecha es de " + acumSueldo);
	}

}
