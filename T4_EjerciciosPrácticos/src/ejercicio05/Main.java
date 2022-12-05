package ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//bloque de variables
	int num, potencia;
	double num1;
				
	//Abrimos el scanner
	Scanner sc=new Scanner(System.in);
				
	//solicitamos al usuario un numero
	System.out.print("Dime un numero: ");
	num=sc.nextInt();
	
	System.out.println("La suma desde 1 hasta el numero introducido es:  "+ FuncionesRecursivas.sumatorio(num)); //Mostramos el resultado de función sumatorio
				
	//Pedimos el numero y la potencia
	System.out.println("Dime un numero: ");
	num1=sc.nextDouble();
	System.out.println("¿A que numero quieres elevarlo?: ");
	potencia=sc.nextInt();
				
	System.out.println("La potencia es : "+ FuncionesRecursivas.potencia(num1, potencia)); //Mostramos el resultado de función potencia
				
	//Pedimos un numero para la serie Fibonacci
	System.out.println("Introduce un numero y te digo la serie fibonacci: ");
	num=sc.nextInt();
				
	if(num<0) { 			// Si el numero es menor que 0 error
	System.out.println(" Numero incorrecto, tiene que ser mayor que 0");
	} else {
		
	System.out.println("El numero Fibonacci : "+FuncionesRecursivas.serieFibonacci(num)); //Mostramos el resultado
	}
				
	//Cerramos el scanner
	sc.close();

	}

}
