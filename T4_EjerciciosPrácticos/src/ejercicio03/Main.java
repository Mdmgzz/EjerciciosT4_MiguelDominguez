package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// bloque de variables
		int num1;
		int num2;
		int num3;
		
		//creamos scanner 
		Scanner sc=new Scanner (System.in);
		
		// preguntamos al usuario por la cantidad de numeros que quiere generar entre 0 y 1
		System.out.println("Introduzca la cantidad de numeros que quiere generar entre 0 y 1 : ");
		num1=sc.nextInt();
		System.out.println( NumerosAleatorios.aleatorio1(num1));
		
		System.out.println("Introduzca la cantidad de numeros que quiere generar: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el mayor numero para generar numeros entre 0 y este : ");
		num2=sc.nextInt();
		System.out.println( NumerosAleatorios.aleatorio1(num1,num2));
		
		System.out.println("Introduzca la cantidad de numeros que quiere generar: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el mayor Párametro: ");
		num2=sc.nextInt();
		System.out.println("Indica el parámetro menor: ");
		num3=sc.nextInt();
		
		System.out.println(NumerosAleatorios.aleatorio1(num1,num2,num3));
		
		//cerramos scanner
		sc.close();
	}

}
