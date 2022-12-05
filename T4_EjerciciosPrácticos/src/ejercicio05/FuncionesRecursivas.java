package ejercicio05;

public class FuncionesRecursivas {
	public static int sumatorio (int numero) {
			
			//bloque de variables
			int suma=0;
			
			//Si  numero = 0
			if(numero==0) {
				// La suma = 0 entonces ya se habrá recibido un valor y se iran cerrando todas las llamadas a la función
				suma=0;
			} else {
				//si no la suma es numero + la funcion -1
				suma=numero + sumatorio(numero-1);
			}
			
			//Devolvemos un valor
			return suma;
		}
		
	public static double potencia(double a, int num) {
			//bloque de variables
			double res;
			
			if(num==0) {	// si mientras ejecutas la funcion recursiva el numero obtiene el valor de 0 entonces igualamos res  a 1
							// y se irán resolviendo las llamadas a la función
				res=1;
			} else {		// mientras no sea 0 llamaremos a la función -1 
				res=a*potencia(a, (num-1));
			}
			
			//Devolvemos el resultado
			return res;
			
		}
		
	public static int serieFibonacci(int num) {
			//bloque de variables
			int res;
			
			// Si num es 1, el resultado es 1
			if(num==1) {
				res = 1;
			// Si num es 0, el resultado es 1	
			} else if(num==0) {
				res = 1;
			// Si no volvemos a llamar a la funcion pero con la formula de fibonacci
			} else {
				res = serieFibonacci(num-1)+serieFibonacci(num-2);
			}
			
			//Devolvemos el resultado
			return res;
	}
}
