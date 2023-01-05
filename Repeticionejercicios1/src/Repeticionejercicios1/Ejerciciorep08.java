package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep08 {

	public static void main(String[] args) {
		// 8. Programa que calcula el volumen de una esfera.
		System.out.println( "VOLUMEN DE UNA ESFERA \n ");
		
		Scanner teclado = new Scanner(System.in);
		
		double radio,volumen;
		
		System.out.println("Introduzca el radio: ");
		
		radio= teclado.nextDouble();
		volumen = (4/3)* (Math.PI)* (Math.pow(radio, 3));
		
		System.out.printf("El volumen de la esfera es de %.2f", volumen);
		
		
		
		

	}

}
