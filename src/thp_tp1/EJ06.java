package thp_tp1;

import java.util.Scanner;

public class EJ06 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		double montoTotalVentas;
		double porcVentas;
		double sueldoTotal;
		
		final double SUELDO = 44000;
		
		//pedido e ingreso de monto total de venta de mes en curso
		System.out.println("Ingresa monto de venta total del vendedor por el mes en curso");
		montoTotalVentas = Integer.parseInt(input.next());
		
		//operacion aritmetica de porcentaje de ventas y calculo de sueldo total del vendedor
		 porcVentas = montoTotalVentas * 0.16;
		sueldoTotal = SUELDO + porcVentas;
		
		//muestra por pantalla de sueldo a cobrar por el vendedor
		System.out.println("El sueldo a cobrar por el mes en curso es de " + sueldoTotal);
		
		input.close();
	}

}
