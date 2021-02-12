package Ejercicios_repaso;
import java.util.Scanner;

public class ejer_3 {

	public static void main(String[] args) {
		/* Tenemos que introducir tres notas, de manera que una será la nota del examen, otra
la de los trabajos y la última la del comportamiento. Para realizar esta tarea tenemos
que visualizar los correspondientes mensajes con sus correspondientes entradas de
datos. Hay que tener en cuenta que las notas pueden tener decimales.
Posteriormente se calculará y visualizará la nota final, para realizar el cálculo
tendremos en cuenta que la nota del examen tendrá un peso del 50%, la de los
trabajos un 40% y la de la actitud un 10%. */
		
		
		float examen,trabajos,comportamiento;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce:");
		System.out.println("Nota examen");
		examen=leer.nextFloat();
		System.out.println("Nota trabajos");
		trabajos=leer.nextFloat();
		System.out.println("Nota comportamiento");
		comportamiento=leer.nextFloat();
		
		examen=(examen*50)/100;
		trabajos=(trabajos*40)/100;
		comportamiento=(comportamiento*10)/100;
		
		System.out.println("La nota final es de: " + (examen+trabajos+comportamiento));
		
		

	}

}
