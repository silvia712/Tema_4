package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_7 {

	public static void main(String[] args) {
		/* Realiza un programa que al introducir un numero por consola muestre los siguientes resultados:
				a. S1 si el numero es <10 e impar
				b. S2 si el n�mero est� entre 10 y 20 y adem�s es par
				c. S3 si el n�mero es m�ltiplo de 3 y NO cumple la condici�n A. 
				d. S4 si el n�mero es mayor que 20 y m�ltiplo de 7 o bien si es mayor que 50.
		Debes de realizar un bucle para que te pida el n�mero varias veces hasta que se
		pulse 0 en cuyo caso se saldr� del programa. */
		
		
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
