package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep09 {

	public static void main(String[] args) {
		// 9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
		
		System.out.println("ÁREA DE UN TRIÁNGULO \n");
		
		Scanner teclado = new Scanner (System.in);
		
		double lado1,lado2,lado3,perimetro,s,area;
		
		System.out.println("Introduce el lado 1: ");
		lado1=teclado.nextDouble();
		System.out.println("Introduce el lado 2: ");
		lado2=teclado.nextDouble();
		System.out.println("Introduce el lado 3: ");
		lado3=teclado.nextDouble();
		
		perimetro= lado1+lado2+lado3;
		s= perimetro/2; //semiperimetro
		
		
		area= Math.sqrt(s*(s-lado1)* (s-lado2)*(s-lado3));
		
		System.out.printf("El área del triángulo es de %.2f", area);
		
		
	}

}
