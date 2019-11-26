package estructurasdecontrol;

import java.util.Scanner;

public class NumeroMenor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 Scanner numero = new Scanner (System.in);
		 System.out.println("EL primer numero es: ");
		 int num1 = numero.nextInt();
		 System.out.println("El segundo numero es: ");
		 int num2 = numero.nextInt();
		 
		 if(num1 < num2) {
			 System.out.println("El numero menor es: " + num1);
		 }
		 
		 else if(num2 < num1){
			 
			 System.out.println("El numero menor es: " + num2);
		 }
		 
		 else {
			 	System.out.println("Los numeros son iguales");
		 }
		 
		 
		 

	}

}
