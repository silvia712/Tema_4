package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_7 {

	public static void main(String[] args) {
		/* Realiza un programa que al introducir un numero por consola muestre los siguientes resultados:
				a. S1 si el numero es <10 e impar
				b. S2 si el número está entre 10 y 20 y además es par
				c. S3 si el número es múltiplo de 3 y NO cumple la condición A. 
				d. S4 si el número es mayor que 20 y múltiplo de 7 o bien si es mayor que 50.
		Debes de realizar un bucle para que te pida el número varias veces hasta que se
		pulse 0 en cuyo caso se saldrá del programa. */
		
		
		Scanner leer=new Scanner (System.in);
		int num;
		
		do {
			
			System.out.println("Escribe un numero");
			num=leer.nextInt();
			
			if (num<10 && num % 2!=0) {
				System.out.println("S1");
			}
			
			if (num>=10 && num<=20 && num%2==0) {
				System.out.println("S2");
			}
			
			if (num>10 && num % 3==0 && num%2!=0) {
				System.out.println("S3");
			}
			if ((num>20 && num%7==0) || (num >50)){
				System.out.println("S4");
			}
			
			
		} while (num !=0);

	}

}
