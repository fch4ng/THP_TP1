package thp_tp1;

import java.util.Scanner;

public class EJ26 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variable
		int numX;
		int i;
		
		//pedido e ingreso de numero entero
		System.out.println("Ingresa un numero");
		numX = Integer.parseInt(input.next());
		
		//inicio de ciclo for en 0 hasta numX
		for(i = 0; i < numX; i++){
			
			//condicional para excluir multiplos de 5
			if(0 != (i*3) % 5) {
				
				//muestra por pantalla multiplos de 3
				System.out.println(i);
			}
		}

	}

}
