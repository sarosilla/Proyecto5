package estructurasdecontrol;
import java.util.Scanner;

public class NotasMaxMin {

	public static void main(String[] args)
	{
		//Variables que necesito para almacenar
		int nota;
		int notaMax = 0;
		int notaMin = 10;
		boolean  notaValida = false ;
		Scanner entrada = new Scanner(System.in);
		//sentencia de entrada de datos
		//pedir al usuario que introduzca la nota(datos)
		System.out.println("Introduzca una nota:tiene  que estar entre 1 y 10 ");
		for(int i= 1; i <= 3; i++)
		{
			do {
				//Guardamos la nota y la validamos
				nota = entrada.nextInt();
				notaValida = (nota >= 1 && nota <= 10);
				if(!notaValida)
					System.out.println("error: nota no valida ");
				}while(!notaValida);
			//comparamos las notas
			if(nota > notaMax)
				notaMax = nota;
			if(nota < notaMin)
				notaMin = nota;
				
		}
		//Enviamos a pantalla el resultado
		System.out.println("La nota máxima es: " + notaMax);
		System.out.println("La nota mínima es: " + notaMin);

	}

}
