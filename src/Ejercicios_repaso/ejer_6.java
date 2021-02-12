package Ejercicios_repaso;

import java.util.Scanner;

public class ejer_6 {
	
	public static void pintaMenu() {
		
		System.out.println(" ");
		System.out.println("Escoge una opcion");
		System.out.println("1 - Sumar operandos");
		System.out.println("2 - Restar operandos");
		System.out.println("3 - Multiplicar operandos");
		System.out.println("4 - Dividir operandos");
		System.out.println("5 - Resto division entera operandos");
		System.out.println("6 - Salir");
	}
	

	public static void main(String[] args) {
	
		/* Realiza un programa en el que se pidan dos números y posteriormente aparezca un
		menú principal con el siguiente aspecto
		1. Sumar Operandos
		2. Restar Operandos.
		3. Multiplicar Operandos.
		4. Dividir Operandos (El resultado puede ser decimal).
		5. Resto división entera operandos
		6. Salir
		El programa deberá de ejecutarse hasta que se pulse 6 */
		
		float num1,num2, resto;
		Scanner leer=new Scanner(System.in);
		int opcion=0;
		
		System.out.println("Escribe dos numeros");
			num1=leer.nextInt();
			num2=leer.nextInt();
		
		
		do {			
			pintaMenu();
			opcion=leer.nextInt();
			
			switch (opcion) {
		case 1:
			System.out.println("La suma de ambos numeros es: " + (num1+num2));
			break;

		case 2:
			System.out.println("La resta de ambos numeros es: " + (num1-num2));
			break;
			
		case 3:
			System.out.println("El producto de ambos numeros es: " + (num1*num2));
			break;
			
		case 4:
			System.out.println("La division de ambos numeros es: " + (num1/num2));
			break;
			
		case 5:
			resto= num1 % num2;
			System.out.println("El resto de la division de ambos numeros es: " + resto);
			break;
		
		case 6:
			System.out.println("Adios!");
			break;
			}
			
		} while (opcion !=6);
		
		
		
		
		
			
		
		
		


	}

}
