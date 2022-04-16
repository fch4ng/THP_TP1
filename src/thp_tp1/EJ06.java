package thp_tp1;

import java.util.Scanner;

public class EJ06 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double montoTotalVentas;
		double porcVentas;
		double sueldoTotal;
		
		final double SUELDO = 44000;
		
		System.out.println("Ingresa monto de venta total del vendedor por el mes en curso");
		montoTotalVentas = Integer.parseInt(input.next());
		
		 porcVentas = montoTotalVentas * 0.16;
		sueldoTotal = SUELDO + porcVentas;
		
		System.out.println("El sueldo a cobrar por el mes en curso es de " + sueldoTotal);
	}

}
