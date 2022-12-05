package ejercicio05;

public class FuncionesRecursivas {
	public static int sumatorio (int numero) {
			
	//bloque de variables
	int suma=0;
			
	
	if(numero==0) {					//Si  numero = 0
	
	suma=0;							// La suma = 0 entonces ya se habrá recibido un valor y se iran cerrando todas las llamadas a la función
	} else {
									//si no la suma es numero + la funcion -1
	suma=numero + sumatorio(numero-1);
	}
			
	return suma;					//Devolvemos un valor
	}
		
	public static double potencia(double a, int num) {
	//bloque de variables
	double res;
			
	if(num==0) {					// si mientras ejecutas la funcion recursiva el numero obtiene el valor de 0 entonces igualamos res  a 1
									// y se irán resolviendo las llamadas a la función
	res=1;
		} else {					// mientras no sea 0 llamaremos a la función -1 
	res=a*potencia(a, (num-1));
		}
	
	return res;						//Devolvemos el resultado
			
	}
		
public static int serieFibonacci(int num) {
	//bloque de variables
	int res;
			
	
	if(num==1) {					// Si num es 1, el resultado es 1
	res = 1;
	
		} else if(num==0) {			// Si num es 0, el resultado es 1	
		res = 1;
	
		} else {					// Si no volvemos a llamar a la funcion pero con la formula de fibonacci
		res = serieFibonacci(num-1)+serieFibonacci(num-2);
		}
			
	return res;						//Devolvemos el resultado
	}	
}
