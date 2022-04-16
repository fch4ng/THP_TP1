package thp_tp1;

import java.util.Scanner;

public class EJ10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		   int capitalUno;
		   int capitalDos;
		   int capitalTres;
		   int porc1;
		   int porc2;
		   int porc3;
		   int totalAportado;
		String nombre1;
		String nombre2;
		String nombre3;
		
		
		System.out.println("Ingresa nombre del primer socio");
		nombre1 = input.nextLine();
		System.out.println("Ingresa capital aportado por el primer socio");
		capitalUno = Integer.parseInt(input.next());
		
		System.out.println("Ingresa nombre del segudno socio");
		nombre2 = input.nextLine();
		System.out.println("Ingresa capital aportado por el segundo socio");
		capitalDos = Integer.parseInt(input.next());
		
		System.out.println("Ingresa nombre del tercer socio");
		nombre3 = input.nextLine();
		System.out.println("Ingresa capital aportado por el tercer socio");
		capitalTres = Integer.parseInt(input.next());
		
		totalAportado = capitalUno + capitalDos + capitalTres;
		        porc1 = capitalUno / totalAportado;
		        porc2 = capitalDos / totalAportado;
		        porc3 = capitalTres / totalAportado;
		        
		System.out.println(nombre1 + " aporto " + capitalUno + " que representa " + porc1 + "% del " + totalAportado + " total aportado");
		System.out.println(nombre2 + " aporto " + capitalDos + " que representa " + porc2 + "% del " + totalAportado + " total aportado");
		System.out.println(nombre3 + " aporto " + capitalTres + " que representa " + porc3 + "% del " + totalAportado + " total aportado");
		

	}

}
