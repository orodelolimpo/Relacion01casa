package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep04 {

	public static void main(String[] args) {
		// 4. Programa que lea una cantidad de grados centígrados y la pase 
		//a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
		
		System.out.println(" PASAMOS DE GRADOS CENTÍGRADOS A GRADOS FAHRENHEIT ");
		
		Scanner teclado = new Scanner (System.in);
		
		float centigrados, fahrenheit;
		System.out.println("Introduce número en Grados Centígrados: ");
		
		centigrados = teclado.nextFloat();
		
		fahrenheit = 32+ (9*centigrados /5);
		
		
		System.out.printf(" %.2f C son %.2f F", centigrados, fahrenheit );
		

	}

}
