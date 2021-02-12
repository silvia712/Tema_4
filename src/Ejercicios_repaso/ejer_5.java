package Ejercicios_repaso;

public class ejer_5 {

	public static void main(String[] args) {
		
		/* Realiza un programa que muestre los números menores de 200 que son pares y
			múltiplos de 3 en orden DESCENDENTE. */
		
		for (int i=200; i>=1; i--) {
			if ( (i % 2 == 0) && (i % 3 == 0) ){
				System.out.print(i + " ");
			}
			
		}
	}
	
}
