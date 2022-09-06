package thp_tp1;

import java.util.Scanner;

public class EJ38 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String usuarioX;
		String passX;
		
		int contadorIntentos = 0;
		
		final String USUARIO = "admin";
		final String PASSWRD = "123456";
		final int    FIN     = 3;
		
		do {
			System.out.println("Ingresa usuario");
			usuarioX = input.nextLine();
			System.out.println("Ingresa contrase�a");
			passX = input.nextLine();
			
			contadorIntentos++;
			
		}while(!(usuarioX.equals(USUARIO) && passX.equals(PASSWRD)) && contadorIntentos != FIN);//contador no parece cortar ingreso de datos
		
		if(usuarioX.equals(USUARIO) && passX.equals(PASSWRD)) {
			System.out.println("Acceso concedido");
		}else {
			System.out.println("Se ha bloqueado la cuenta");
		}

	}

}
