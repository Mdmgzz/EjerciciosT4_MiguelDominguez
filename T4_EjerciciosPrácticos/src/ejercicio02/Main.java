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
		Esfera.radio=sc.nextDouble();		// lo guardamos en la variable global radio
		
		
		if (Esfera.radio<=0) {
			System.out.println("Introduce un valor positivo."); 		//llamamos a la funcion  si radio es mayor que 0, si es menor o = 0 salta el mensaje
		}else  {
			
			resultado=Esfera.Superficie();		
			//mostramos el resultado de la superficie
			System.out.println("La Superficie de la esfera es: "+resultado);
			resultado=Esfera.Volumen();
			//mostramos el resultado del volumen
			System.out.println("El volumen de la esfera es: "+resultado);
		}
		
		//cerramos scanner
		sc.close();
	}

}
