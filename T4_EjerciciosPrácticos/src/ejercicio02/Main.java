package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// bloque de variables
		double resultado=0;  		// se guardará el resultado de la superficie y el volumen
		//creamos scanner
		
		Scanner sc=new Scanner(System.in);
		
		//preguntamos al usuario
		System.out.println("Inrtoduce el radio de una esfera: ");
		Esfera.radio=sc.nextDouble();
		
		
		if (Esfera.radio<=0) {
			System.out.println("Introduce un valor positivo."); 
		}else  {
			resultado=Esfera.Superficie();
			System.out.println("La Superficie de la esfera es: "+resultado);
			resultado=Esfera.Volumen();
			System.out.println("El volumen de la esfera es: "+resultado);
		}
		
		//cerramos scanner
		sc.close();
	}

}
