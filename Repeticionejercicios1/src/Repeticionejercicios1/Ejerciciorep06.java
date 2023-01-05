package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep06 {

	public static void main(String[] args) {
		// 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		System.out.println("PASA DE KM/h A m/s \n");
		
		Scanner teclado = new Scanner (System.in);
		
		float kilometrosh, metross;
		
		System.out.println(" Introduzca Km/h:");
		
		kilometrosh = teclado.nextFloat();
		
		metross = (kilometrosh*1000)/3600;
		
		System.out.printf(" %.2f K/h son %.2f m/s", kilometrosh, metross);

	}

}
