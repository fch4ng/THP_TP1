package thp_tp1;//apuntes abajo pedido de correccion

import java.util.Scanner;

public class EJ39 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		final int CANTIDADMINIMAJUGADORES = 2;
		final int              TIROMAXIMO = 3;
					   
						int cantJugadores;
					   int distanciaTiro;
					String nombreJugador = "";
					  int acumTotalTiros;
				   String jugadorGanador = "";
				   
				             int acum500 = 0;
				             int acum250 = 0;
				             int acum100 = 0;
				int contadorTiroAlCentro = 0;
				      int puntajeGanador = 0;
			int cantidadTotalTirosCentro = 0;
			       int contadorJugadores = 0;
			          int contadorDeTiro = 0;
			          		 int suma500 = 500;
			          		 int suma250 = 250;
			          		 int suma100 = 100;
			          	   int sumaTiros = 1;
			        int sumaTiroAlCentro = 1;
			           int sumaJugadores = 1;
       
       
       do {
    	   
    	   System.out.println("Ingrese cantidad de jugadores (cantidad minima 2)");
    	   cantJugadores = Integer.parseInt(input.next());
    	   
       }while(cantJugadores < CANTIDADMINIMAJUGADORES);
       
	       do{
	    	   
	    	   System.out.println("Ingresa nombre de jugador");
	    	   nombreJugador = input.nextLine();
	    	   	             
			       do {
			    	   			    	      	   
				           do{
				        	   
				        	   System.out.println("Ingrese distancia del tiro (numero mayor o igual a 0)");
				        	   distanciaTiro = Integer.parseInt(input.next());
				        	   
				           		}while(distanciaTiro < 0);
			    	   			    	   		    	   
						    	   if(distanciaTiro == 0) {
						    		   
						    		                acum500 = acum500 + suma500;
						    		   contadorTiroAlCentro = contadorTiroAlCentro + sumaTiroAlCentro;
						    		   System.out.println("acum500 " + acum500);
						    		   System.out.println("contadorTiroAlCentro " + contadorTiroAlCentro);
						    	   }else if(distanciaTiro <= 10){
						    		   
						    		   acum250 = acum250 + suma250;
						    		   System.out.println("acum250 " + acum250);
						    	   }else if(distanciaTiro > 11 && distanciaTiro < 50) {
						    		   
						    		   acum100 = acum100 + suma100;
						    		   System.out.println("acum100 " +acum100);
						    	   }
						    	   
						    	   acumTotalTiros = acum500 + acum250 + acum100;
						    	   System.out.println("acumTotalTiros " + acumTotalTiros);
						    	   if(acumTotalTiros > puntajeGanador) {
						    		   
						    		   puntajeGanador = acumTotalTiros;// no se resetea el conteo cuando va al siguiente jugador
						    		   jugadorGanador = nombreJugador; // no se guarda el nombre
						    		   System.out.println("puntajeGanador " + puntajeGanador); 
						    		   System.out.println("jugadorGanador " + jugadorGanador);
						    	   }
					    	   
							    	   cantidadTotalTirosCentro = cantidadTotalTirosCentro + contadorTiroAlCentro;
							    	             contadorDeTiro = contadorDeTiro + sumaTiros;
							    	   System.out.println("contadorDeTiro " + contadorDeTiro); 			    	       	   
			       		}while(contadorDeTiro != TIROMAXIMO); //solo cicla una vez y despues se queda en loop con el segundo jugador
	       
			  contadorJugadores = contadorJugadores + sumaJugadores;
			  System.out.println("contadorJugadores " + contadorJugadores);
	       
	       }while(cantJugadores != contadorJugadores);

	      System.out.println("El ganador es " + jugadorGanador + " con un puntaje " + puntajeGanador);
	      System.out.println("La cantidad total de tiros al centro es " + cantidadTotalTirosCentro);
		  
		
		
		
		
		

	}
}
