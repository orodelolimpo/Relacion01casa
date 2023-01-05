package Repeticionejercicios1;

import java.util.Date;
import java.util.Scanner;

public class Ejerciciorep14 {

	public static void main(String[] args) {
		// 14. Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.
		//El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación 
		//sumando las cifras obtenidas en la suma.Por ejemplo:
		//Si la fecha de nacimiento es 12/07/1980
		//Calculamos el número de lasuerte así: 12+7+1980 = 1999 1+9+9+9 = 28
		//Número de la suerte: 28
		System.out.println("NÚMERO DE LA SUERTE\n");
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce el número del día de tu nacimiento");
		int dia,mes,anio,suma,resto,numSuerte;	
		dia=teclado.nextInt();
		System.out.println("Introduce el número del mes de tu nacimiento");
		mes= teclado.nextInt();
		System.out.println("Introduce el número del año de tu nacimiento");
		anio=teclado.nextInt();
		suma=dia+mes+anio;
		
		numSuerte = suma /1000;
		resto = suma % 1000;
		numSuerte = numSuerte + resto /100;
		resto = resto % 100;
		numSuerte = numSuerte + resto /10;
		numSuerte = numSuerte + resto%10;
		
		System.out.println("Tu número de la suerte es "+numSuerte);
		
		
		
		}

}
