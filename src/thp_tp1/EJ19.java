package thp_tp1;

import java.util.Scanner;

public class EJ19 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		               int numX;
		 boolean esUnSoloDigito = true;
		        boolean esImpar = true;
		    boolean estaEnAmbos = true;
		boolean noEstaEnNinguno = true;

		//pedido e ingreso de numero entero
		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		//uso de booleanos para validar condiciones
		esUnSoloDigito = numX >= -9 && numX <= 9;
		
		       esImpar = numX % 2 != 0;
		
		   estaEnAmbos = estaEnAmbos && esImpar;
		   
	   noEstaEnNinguno = !estaEnAmbos;
	   
	   //mostrar por pantalla resultado de validacion de condiciones
	   System.out.println("La variables logies esUnSoloDigito " + esUnSoloDigito);
	   
	   System.out.println("La variable logica esImpar " + esImpar);
	
	   System.out.println("La variable logica estaEnAmbos " + estaEnAmbos);
	   
	   System.out.println("La variable logica noEstaEnNinguno " + noEstaEnNinguno);
	   
	   input.close();
	}
	
}
