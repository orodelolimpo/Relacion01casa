package Repeticionejercicios1;

import java.util.Scanner;

public class Ejerciciorep10 {

	public static void main(String[] args) {
		// 10. Programa que calcule el cambio que se debe devolver al usuario. 
		//Se pedirán por teclado dos números, el precio del artículo y el importe introducido.
		//Se devolverá el número de monedas a entregar óptimo suponiendo que tenemos disponibilidad
		//de monedas infinita.
		System.out.println("DEVUELVE CAMBIO.  MÁQUINA EXPENDEDORA \n");
		
		Scanner teclado = new Scanner(System.in);
		
		double precio, importe, cambio;
		
		System.out.println("Introduce el precio del artículo: ");
		precio=teclado.nextDouble(); 
		
		System.out.println("Introduce el importe: ");
		importe=teclado.nextDouble();
		
		cambio= importe-precio;
		
		int euros= (int) cambio;
		int centimos = (int) ((cambio-euros)*100);
		
		int m2e = euros/2;
		int m1e = euros%2;
		
		int m50c = centimos /50;
		int resto= centimos%50;
		
		int m20c = resto/20;
		resto= resto%20;
		
		int m10c = resto/10;
		resto=resto%10;
		
		int m5c = resto/5;
		resto=resto%5;
		
		int m2c = resto/2;
		resto=resto%2;
		
		int m1c =resto;  
		
		System.out.printf("El cambio es de %.2f y son: "
				+ "\n %d monedas de 2€ \n "
				+ "%d monedas de 1€ \n "
				+ "%d monedas de 50c \n "
				+ "%d monedas de 20c \n "
				+ "%d monedas de 10c \n "
				+ "%d monedas de 5c \n "
				+ "%d monedas de 2c \n "
				+ "%d monedas de 1c \n" , cambio, m2e,m1e,m50c,m20c,m10c,m5c,m2c,m1c);
	}

}
