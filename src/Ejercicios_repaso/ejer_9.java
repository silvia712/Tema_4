package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_9 {

	public static void main(String[] args) {
		
		//Leer 10 números enteros, tanto positivos como negativos, y mostrar el mayor y eL menor de ellos.

		int numeros = 0;
		int mayor=0;
		int menor=0;
		Scanner leer=new Scanner (System.in);
		System.out.println("escribe 4 numeros");
		
		
		for (int i=0; i<4; i++) {
			numeros=leer.nextInt();
			if ((numeros>=mayor) || (numeros<0) ){
				mayor = numeros;
			}
			if(numeros<=menor) {
				menor=numeros;
			}

		}System.out.println("El numero mayor es " + mayor + " y el menor " + menor);
		
		
		
		
		
		
	
}


