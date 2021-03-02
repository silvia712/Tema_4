package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_11 {

	public static void main(String[] args) {
		
		/*Diseñar algoritmo que genere por pantalla la siguiente secuencia de números hasta
		un numero N que se solicitara al usuario:
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5 */

		int numero;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		
		for (int i=1; i<=numero;i++) {					//pinta las veces, la cantidad				
			for(int j=1;j<=numero-numero+i;j++) {		// pinta los numeros
				 System.out.print(j + " ");
				}
				System.out.println(" ");
				}
			}
				
		}			
	
	
	


