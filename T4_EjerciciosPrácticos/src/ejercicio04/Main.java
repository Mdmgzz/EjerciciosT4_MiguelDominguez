package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creamos scanner
		Scanner sc=new Scanner(System.in);
		//creamos objeto para llamar a las funciones
				Operaciones objeto=new Operaciones();
		
		// preguntamos al usuario
		
		System.out.println("Introduzca el primer entero: ");
		objeto.num1=sc.nextInt();		// lo guardamos en la variable global num1
		System.out.println("Introduzca el segundo entero: ");
		objeto.num2=sc.nextInt();		// lo guardamos en la variable global num2
		
		
		// llamamos a las funciones 
		System.out.println("La Suma de los numeros: " + objeto.suma());
		System.out.println("La Resta de los numeros: " + objeto.resta());
		System.out.println("La Multiplicación de los numeros: " + objeto.multiplicacion());
		System.out.println("La división de los numeros: " + objeto.division());
		
		
		//cerramos scanner
		sc.close();
	}

}
