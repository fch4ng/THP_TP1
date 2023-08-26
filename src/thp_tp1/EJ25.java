package thp_tp1;

import java.util.Scanner;


public class EJ25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int ancho;
		int alto;
		int i;
		int k;
		
		//pedido e ingreso de ancho
		System.out.println("Ingresa el ancho");
		ancho = Integer.parseInt(input.nextLine());
		
		//pedido e ingreso de algo
		System.out.println("Ingresa el alto");
		alto = Integer.parseInt(input.nextLine());
		
		//inicio de ciclo for para alto
		for(i = 0; i <= alto; i++) {
			
			//inicio de ciclo de for para ancho
			for(k = 0; k <= ancho; k++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}

}
