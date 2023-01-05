package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep12 {

	public static void main(String[] args) {
		// 12. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el principio como en el ejemplo.
		//Por ejemplo, para un número N = 12345 La salida debe ser:
		//1
		//12
		//123
		//1234
		//12345
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("PROGRAMA QUE MUESTRA NÚMERO DE 5 CIFRAS POR PARTES\n ");
		System.out.println("Introduzca un número enetero de 5 cifras:");
		int numero,cifra1,cifra2,cifra3,cifra4;
		numero= teclado.nextInt(); 
		cifra1 = numero/10000; 
		System.out.println(cifra1);
		cifra2 = numero/1000;
		System.out.println(cifra2);
		cifra3 = numero/100;
		System.out.println(cifra3);
		cifra4 = numero/10;
		System.out.println(cifra4);
		System.out.println(numero);
		
			

	}

}
