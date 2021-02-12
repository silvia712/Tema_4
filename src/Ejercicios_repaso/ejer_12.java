package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_12 {

	public static void main(String[] args) {
	/* Calcula el factorial de un número leído de teclado
	Ejemplo: 3!=3*2*1=6 */

		int numero, factorial=1;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		
		for (int i=1; i<=numero;i++) {
			factorial=factorial*i;
		}
		
		System.out.println("Su factorial es " + factorial);
		
		
		
	}

}
