package thp_tp1;

import java.util.Scanner;

public class EJ19 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		               int numX;
		 boolean esUnSoloDigito = true;
		        boolean esImpar = true;
		    boolean estaEnAmbos = true;
		boolean noEstaEnNinguno = true;

		System.out.println("Ingrese un numero entero");
		numX = Integer.parseInt(input.next());
		
		if(10 > numX && 0 < numX) {//no se porque se traba aqui?
			
			if(0 == numX % 2) {
				System.out.println(numX + " es de un solo digito " + esUnSoloDigito + " es impar " + esImpar + " por ende pertenece a ambos conjuntos " + estaEnAmbos);
			}
		}else if (0 == numX % 2) {
			System.out.println(numX + " no es de un solo digito ni es impar por ende no esta en ningun conjunto " + noEstaEnNinguno);
		}else {
			System.out.println(numX + " es impar " + esImpar);
		}
	}

}
