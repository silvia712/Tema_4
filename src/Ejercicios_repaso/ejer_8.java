package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_8 {

	public static void main(String[] args) {
		/* Sumar todos aquellos números leídos por teclado mientras no sean negativos hasta
		que el usuario meta un dato negativo y mostrar por pantalla el resultado.*/

		int numeros, suma=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe varios numeros");
			
		do {
			numeros=leer.nextInt();
			
			if (numeros>0) {
				suma=suma+numeros;
			}
			
		} while (numeros>0);
	
		
	System.out.println("La suma total es " + suma);
		

	}
}


