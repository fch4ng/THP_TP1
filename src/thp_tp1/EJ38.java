package thp_tp1;

import java.util.Scanner;

public class EJ38 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//definir variables
		String usuarioX;
		String passX;
		
		int contadorIntentos = 0;
		
		final String USUARIO = "admin";
		final String PASSWRD = "123456";
		final int    FIN     = 3;
		
		//inicio de ciclo do que finaliza si se ingresa combinacion de usuario y contraseña correcta o maximo de intentos
		do {
			//pedido e ingreso de usuario y contraseña
			System.out.println("Ingresa usuario");
			usuarioX = input.nextLine();
			System.out.println("Ingresa contraseï¿½a");
			passX = input.nextLine();
			
			//contador de intentos
			contadorIntentos++;
			
		}while(!(usuarioX.equals(USUARIO) && passX.equals(PASSWRD)) && contadorIntentos != FIN);
		
		//condicional si ususario y contraseña correctos
		if(usuarioX.equals(USUARIO) && passX.equals(PASSWRD)) {
			
			//se muestra por pantalla acceso concedido
			System.out.println("Acceso concedido");
		}else {
			
			//se muestra por pantalla cuenta bloqueada
			System.out.println("Se ha bloqueado la cuenta");
		}

	}

}
