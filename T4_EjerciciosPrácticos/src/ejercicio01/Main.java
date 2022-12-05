package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// bloque de variables
		int numero;
		boolean esPrimo;
		boolean esCapicua;
		
		// creamos scanner
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario por el numero
		System.out.println("Inrtoduzca un numero y le diremos si es Primo y si es Capicúa: ");
		numero=sc.nextInt();
		
		//creamos los objetos para poder llamar las funciones
		Numeros objeto= new Numeros();
		// llamamos a las funciones con el objeto
		esPrimo=objeto.esPrimo(numero);
		esCapicua=objeto.esCapicua(numero);

		// mostrasmos el resultado
		if (esPrimo==true) {
			System.out.println("El numero introducido ES PRIMO.");
		}else {
			System.out.println("El numero introducido NO ES PRIMO.");
		}
		if (esCapicua==true) {
			System.out.println("El numero introducido ES CAPICUA.");
		}else {
			System.out.println("El numero introducido NO ES CAPICUA.");
		}
		//cerramos scanner
		sc.close();
	}

}
