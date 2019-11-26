package estructurasdecontrol;

public class SumaSerie {

	public static void main(String[] args) {
		/*Este programa muestra la suma de una serie con un bucle for */
		
		int suma = 0;
		
		for(int i = 3; i <= 1500; i= i + 4) {
			suma = suma + i;
		}
		System.out.println("La suma es igual a " + suma);

	}

}
