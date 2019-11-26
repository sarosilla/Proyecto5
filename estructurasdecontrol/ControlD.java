package estructurasdecontrol;

import java.io.*;
 public class ControlD
 {
 	public static void main (String args[]) throws IOException
	{
	
 		final char EOF = (char)-1;
 		System.out.println(EOF);
		System.out.println ("Introduce frase(ctrlD para terminar):");
		
		char car = (char) System.in.read();
		
	
		while(car!= EOF)
		{
			
			System.out.print(car);
			car=(char)System.in.read();
				
			
		}//fin mientras
		
		
	}//fin main
	 
 }//fin class
 