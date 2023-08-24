package thp_tp1;

import java.util.Scanner;

public class EJ15 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	//definir variables
		  double altura;
	         int edad;
	final double ALTURAMINIMA = 1.50;
	final int    EDADMINIMA   = 6;
	
	//pedido e ingreso de edad
	System.out.println("Ingrese edad");
	edad = Integer.parseInt(input.next());
	
	//pedido e ingreso de altura
	System.out.println("Ingrese altura");
	altura = Double.parseDouble(input.next());
	
	//condicional compuesta para determinar si edad y altura ingresadas son mayores o igual a las minimas
	if(edad >= EDADMINIMA && altura > ALTURAMINIMA) {
		
		//muestra por pantalla que puede ingresar habiendo cumplido con condiciones
		System.out.println("Puede Ingresar");
	}else {
		
		//muestra por pantalla que no puede ingresar al no cumplir con las condiciones
		System.out.println("No Puede Ingresar");
	}
	input.close();
	}

}
