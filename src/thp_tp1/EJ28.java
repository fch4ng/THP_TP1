package thp_tp1;

import java.util.Scanner;

public class EJ28 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		int numX;
		int numIngresado;
		int numMax = 0;
		int posNumMax = 0;
		
		
		//pedido e ingreso de numero entero
		System.out.println("Ingresa un numero entero");
		numX = Integer.parseInt(input.next());
		
		//inicio de ciclo for en 0 hasta numX
		for(int i = 0; i < numX; i++) { //no entiendo porque no funciona el contador 
			
			//pedido e ingreso de numero entero
			System.out.println("Ingresa el " + i + " numero");
			numIngresado = Integer.parseInt(input.next());
			
			//condicional para guardar numMax y posicion
			if(numIngresado > numMax) {
				   numMax = numIngresado;
				posNumMax = i;
			}
					
		}
		
		//mostrar por pantalla resultado
		System.out.println("El numero maximo fue " + numMax + " en la posicion " + posNumMax);
	}

}
