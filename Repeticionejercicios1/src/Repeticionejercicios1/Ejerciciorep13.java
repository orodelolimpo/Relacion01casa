package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep13 {

	public static void main(String[] args) {

		// 13. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final igual que en el ejemplo.
		//     5
		//    45
		//   345
		//  2345
		// 12345
		System.out.println("PROGRAMA QUE MUESTRA UN NÚMERO DESDE ATRÁS\n");
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un número entero de 5 cifras");
		int numero, cifra1,cifra2,cifra3,cifra4,cifra5;
		numero=teclado.nextInt();
		
		//System.out.println("    "+cifra1);
		//.out.println("   "+cifra2);
		//System.out.println("  "+cifra3);
		//System.out.println(" "+cifra4);
		//System.out.println(numero);
		
		System.out.printf("    %d\n   %d\n  %d\n %d\n%d\n", numero%10, numero%100, numero%1000,
				numero%10000, numero);
	}

}
