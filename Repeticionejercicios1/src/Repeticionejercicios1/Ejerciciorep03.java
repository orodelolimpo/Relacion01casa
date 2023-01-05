package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep03 {

	public static void main(String[] args) {
		// 3. Programa Java que lee un número entero por teclado y obtiene y muestra 
		//por pantalla el doble y el triple de ese número.
		
		System.out.println("DOBLE Y TRIPLE");
		
		Scanner teclado = new Scanner (System.in);
		
		float num;
		
		System.out.println("Introduce un número: ");
		
		num = teclado.nextInt();
		
		System.out.printf("El doble del número %.2f es %.2f y el triple es de %.2f \n", num, num*2, num*3);
			
	}

}
