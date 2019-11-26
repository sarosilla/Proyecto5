package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class Llamada 
{

	public static void main(String[] args) throws IOException
	{
		
		//declaramos la variable de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		//declaramos variable que compruebe t/f
		boolean duracionValida;
		//Le pedimos al ususario que nos de la duracion de la llamada con un valor entero:
		System.out.println("Introduce la duracion con un valor entero en minutos de la llamada: ");
		//Variables
		int duracion;
		int costeLlamada;
		//validamos la duración
		do {
			duracion = entrada.nextInt();
			duracionValida = (duracion > 0);
			if(!duracionValida)
				System.out.println("Error: La duración ha de ser mayor de 0");
		}while(!duracionValida);//¿es verdadero que <- es falso?
		
		/*definimos una constante,el precio de 
		las 20 pts por llamada y el precio de cada minuto adicional 15.*/
		final int COSTE_MINIMO = 20;
		final int DURACION_MINIMA = 3;
		final int COSTE_MINUTO_ADICIONAL = 15;
		
		if(duracion > DURACION_MINIMA) {
				int tiempoAdicional = duracion - DURACION_MINIMA;
				int recargo = tiempoAdicional * COSTE_MINUTO_ADICIONAL;
				costeLlamada = recargo + COSTE_MINIMO;
				System.out.println("La llamada tiene un precio de " + costeLlamada + " pts");
		}	
		else
				System.out.println("La llamada tiene un precio de " + COSTE_MINIMO + " pts");
			
	}//out main

}//out class
