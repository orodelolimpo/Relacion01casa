package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep11 {

	public static void main(String[] args) {
		// 11. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
		//345
		//3
		//4
		//5
		
		System.out.println(" PROGRAMA QUE LEE NÚMERO DE 3 CIFRAS SEPARADO\n ");
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número de tres cifras: ");
		int numero, cifra1,cifra2,cifra3;
		numero= teclado.nextInt();
		
		cifra1= numero/100;
		System.out.println(cifra1);
		cifra2= (numero%100)/10;
		System.out.println(cifra2);
		cifra3=(numero%100)%10;
		System.out.println(cifra3);
		
		
		
		
		
		

	}

}
