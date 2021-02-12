package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_10 {

	public static void main(String[] args) {
	/* Escribir la tabla de multiplicar de un número introducido por teclado */

		int numero, resultado;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		System.out.println("Tabla del " + numero + "\n");
		
		for (int i=0; i<=10 ;i++) {
			
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
	}

}
