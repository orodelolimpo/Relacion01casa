package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep15 {

	public static void main(String[] args) {
		// 15. Programa para pasar de grados centígrados a grados Kelvin.
		
		System.out.println("PROGRAMA QUE PASA DE GRADOS CENTÍGRADOS A GRADOS KELVIN\n");
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce el número en Grados Centígrados");
		double grados, kelvin;
		grados= teclado.nextDouble();
		kelvin= grados+273.15;
		System.out.printf("El resultado en grados kelvin es de %.2f",kelvin);
		
		

	}

}
