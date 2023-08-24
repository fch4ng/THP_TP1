package thp_tp1;

import java.util.Scanner;

public class EJ09 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		      int angulo1;
		      int angulo2;
		      int angulo3;
		
		final int TOTALGRADOS = 180;
		
		//pedido e ingreso de primer angulo
		System.out.println("Ingresa el primer angulo");
		angulo1 = Integer.parseInt(input.next());

		//pedido e ingreso de primer angulo
		System.out.println("Ingresa el segundo angulo");
		angulo2 = Integer.parseInt(input.next());
		
		//operacion aritmetica de calculo de tercer angulo faltante
		angulo3 = TOTALGRADOS - angulo1- angulo2;
		
		//muestra por pantalla de medida de tercer angulo
		System.out.println("El angulo restante es de " + angulo3 + " grados");
		
		input.close();
	}

}
