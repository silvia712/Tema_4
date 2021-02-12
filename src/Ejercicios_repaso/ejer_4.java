package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_4 {

	public static void main(String[] args) {
		/* Realiza un programa que reciba un numero por pantalla y muestre 
		 * “Prueba superada” en los siguientes supuestos:
			a. El nº es PAR y mayor que 10.
			b. El nº es múltiplo de 3 e IMPAR. */
		
		int numero;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		
		if ( ((numero % 2 == 0) && (numero>10)) || ((numero % 2 !=0) && (numero % 3 == 0))  ) {
			System.out.println("Prueba superada");
			
		} else {
			System.out.println("Error");
			
		}
	}
}
