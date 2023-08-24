package thp_tp1;

import java.util.Scanner;

public class EJ02 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables 3 notas y promedio
		int nota1;
		int nota2;
		int nota3;
		int promedio;
		
		//pedido e ingreso de primera nota
		System.out.println("Ingresa la primera nota");
		nota1 = Integer.parseInt(input.next());
		
		//pedido e ingreso de segunda nota
		System.out.println("Ingresa la segunda nota");
		nota2 = Integer.parseInt(input.next());
		
		//pedido e ingreso de tercera nota
		System.out.println("Ingresa la tercera nota");
		nota3 = Integer.parseInt(input.next());
		
		//operacion aritmetica de calculo de promedio
		promedio = (nota1+nota2+nota3)/3;
		
		//muestra por pantalla de promedio de las 3 notas
		System.out.println("El promedio de las tres notas es " + promedio);
		
		input.close();
	}

}
