package thp_tp1;

import java.util.Scanner;

public class EJ36 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int numX;
		int promedio;
		
		int     acumNumX = 0;
		int contadorNumX = 0;
		
		final int FIN = 20;
		
		//iniciar ciclo do 
		do {
			
			//pedido e ingreso de numX
			System.out.println("Ingresa un numero");
			numX = Integer.parseInt(input.next());
			
			//acumulador numeros ingresados
			acumNumX = acumNumX + numX;
			
			//contador de numeros ingresados
			contadorNumX++;
			
			//operacion aritmetica de promedio de numeros acumulados divididos por cantidad de numeros ingresados
			promedio = acumNumX / contadorNumX;
					
			
		}while(promedio <= FIN);
		
		//muestra por pantalla de cantidad de numeros ingresados
		System.out.println("Fin de ingreso promedio superior a " + FIN);
		System.out.println("Se cargaron " + contadorNumX + " numeros");
	}

}
