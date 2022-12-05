package ejercicio02;

public class Esfera {
	// bloque de variables globales
	public static double radio;
	
	
	public static double Volumen() { 
		// bloque de variables de la funcion Volumen
		double volumen;
		
		volumen = (4*Math.PI) * Math.pow(radio, 2);	// calcula el volumen de la esfera segun el radio que haya introducido
		return volumen;	// devolvemos el resultado
	}
	
	public static double Superficie() { 
		// bloque de variables de la funcion superficie
		double superficie; 
		
		superficie = (4*Math.PI/3)*Math.pow(radio, 3); // calcula la superficie de la esfera segun el radio que haya introducido
		return superficie; // devolvemos el resultado
	}
}
