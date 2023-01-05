package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep07 {

	public static void main(String[] args) {
		//7. Programa lea la longitud de los catetos de un triángulo rectángulo y 
		//calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		System.out.println("CALCULO DE HIPOTENUSA POR TEOREMA DE PITÁGORAS \n ");
		
		Scanner teclado = new Scanner (System.in);
		
		double cateto1,cateto2, hipotenusa;
		
		System.out.println("Introduzca la longitud del un cateto: ");
		
		cateto1= teclado.nextDouble();
		
		System.out.println("Introduzca la longitudad del otro cateto: ");
		
		cateto2= teclado.nextDouble();
		
		hipotenusa= Math.sqrt((Math.pow(cateto1, 2)+(Math.pow(cateto2, 2))));
		
		System.out.printf("La longitud de la hipotenusa es de %.2f",hipotenusa);
		
		
		
		
		
		
		
		
		
		
	}

}
