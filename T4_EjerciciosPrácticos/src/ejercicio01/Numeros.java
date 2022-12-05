package ejercicio01;

public class Numeros {
	boolean esPrimo(int numero) {
		// bloque de variables de la función
		boolean esPrimo= true;
		
		for (int i=2;i<=numero;i++) {
			if (numero%i==0) {		// comprueba si es primo haciendo el modulo de i y mientras el modulo de i sea distinto de 0 no será primo
				esPrimo=false;
				break;
			}
		}
		return esPrimo;				// devuelve el valor de esPrimo
		
	}
	boolean esCapicua (int numero) {
		// bloque de variables de la función
		boolean esCapicua=true;
		int numeroini=numero;
		int num;
		int aux=0;
		int cifra;
		
		num = numero;
		
		while (num>0) {						// el bucle funciona mientras el num se mayor que 0
			cifra=num%10;					// sacamos la ultima cifra
			aux=aux*10+cifra;				//añadimos la ultima cifra a la variable aux
			num=num/10;						// y por ultimo quitamos la cifra que ya hemos añadido, así hasta que sea 0
			if (aux==numeroini) {
				esCapicua=true;				// si aux = al numero inicial será capicua
				break;
			}else {							// si no es = seguirá siendo falso
				esCapicua=false;
			}
		}
		return esCapicua;		// devolvemos el valor de esCapicua  
		}
	}

