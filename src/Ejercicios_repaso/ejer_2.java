package Ejercicios_repaso;
import java.util.Scanner;

public class ejer_2 {

	public static void main(String[] args) {
	
		/* Programa en el cual introduciremos una distancia expresada en metros y una
		cantidad en segundos, ambas sin decimales. Se trata de calcular la velocidad
		expresada en Km/h, la cual sí que puede tener decimales. Hay que tener en cuenta
		que la fórmula de la velocidad es: v = espacio / tiempo. Antes de calcular la velocidad
		tenemos que pasar de metros a Km y de segundos a horas. Para pasar de metros a
		Km hay que dividir entre 1000 y de segundos a horas dividimos entre 3600. El
		mensaje que visualizará el resultado será: La velocidad resultante es: 20,00 km/h */

		int metros;
		int segundos;
		float kilometros;
		float horas;
		float velocidad;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe la distacia en metros");
		metros=leer.nextInt();
		kilometros=metros/1000;
		
		System.out.println("Escribe un tiempo en segundos");
		segundos=leer.nextInt();
		horas=segundos/3600;
		
		velocidad=kilometros/horas;
		System.out.println("La velocidad resultante es: " + velocidad + " km/h");
		
	}

}
