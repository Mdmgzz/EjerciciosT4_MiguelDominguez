package ejercicio04;

public class Operaciones {
	//bloque de variables globales
	int num1;
	int num2;
	
	// funcion para la suma
	public int suma () {
		int resultado;	//guarda el resultado de la suma
		
		resultado=num1+num2;	//realizamos la suma
		return resultado;		//devolvemos el valor de la suma
	}
	// funcion para la resta
	public int resta () {
		int resultado;			// guarda el resultado de la resta
		
		resultado=num1-num2;
		return resultado;		//devolvemos el valor de la resta
	}
		// función para la multiplicación
	public int multiplicacion () {
		int resultado;			// guarda el resultado de la multiplicacíon
		
		resultado=num1*num2;
		return resultado;		//devolvemos el valor de la multiplicación
	}
	// función para la división
	public int division () {
		int resultado;			// guarda el resultado de la división
		
		resultado=num1/num2;	
		return resultado;		//devolvemos el valor de la división
	}
}

