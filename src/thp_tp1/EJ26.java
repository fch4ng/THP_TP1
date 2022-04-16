package thp_tp1;

import java.util.Scanner;

public class EJ26 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numX;
		int i;
		System.out.println("Ingresa un numero");
		numX = Integer.parseInt(input.next());
		
		for(i = 0; i < numX; i++){
			
			if(0 != (i*3) % 5) {
				System.out.println(i*3);//no imprime
			}
		}

	}

}
