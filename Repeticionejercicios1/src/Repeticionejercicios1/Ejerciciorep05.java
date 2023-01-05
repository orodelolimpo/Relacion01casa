package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep05 {

	public static void main(String[] args) {
		// 5. Programa que lee por teclado el valor del radio de una circunferencia 
		//y calcula y muestra por pantalla la longitud y el área de la circunferencia.
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		
		System.out.println(" CALCULO DE LA LONGITUD  Y ÁREA DE UNA CIRCUNSFERENCIA ");
		System.out.println("");
		
		Scanner teclado = new Scanner (System.in);
		double radio,longitud,area;
		//double PI = Math.PI;
		
		System.out.println("Introduce el rádio de la circunsferencia a medir: ");
		
		radio = teclado.nextFloat();
		
		longitud=2* Math.PI*radio;
		
		area= Math.PI*Math.pow(radio, 2);
		
		System.out.printf(" La longitud de la circunsferencia de radio %.2f es de %.2f y el área de %.2f\n ", radio,
				+ longitud, area);
		

	}

}
