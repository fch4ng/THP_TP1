package thp_tp1;

import java.util.Scanner;

public class EJ28 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numX;
		int numIngresado;
		int numMax = 0;
		int posNumMax = 0;
		int i;
		
		System.out.println("Ingresa un numero entero");
		numX = Integer.parseInt(input.next());
		
		for(i = 0; i < numX; i++) { //no entiendo porque no funciona el contador 
			System.out.println("Ingresa el numero");
			numIngresado = Integer.parseInt(input.next());
			
			i++;
			
			if(numIngresado > numMax) {
				numMax = numIngresado;
				posNumMax = i;
			}
		}
		
		System.out.println("El numero maximo fue " + numMax + " en la posicion " + posNumMax);
	}

}
